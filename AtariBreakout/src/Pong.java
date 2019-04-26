//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle leftPaddle;
	private Paddle rightPaddle;
	private Paddle atariPaddle;
	private boolean[] keys;
	private ArrayList<Bar> bars;
	private BufferedImage back;
	private int i;
	private int leftScore, rightScore;


	public Pong()
	{
		//set up all variables related to the game
		//instantiate a Ball
				ball = new Ball(50, 50, 10, 10, 5, 5, Color.RED);
				
				atariPaddle = new Paddle(360, 500, 40, 40);

		bars = new ArrayList<Bar>();
		for (int i = 0, count = 0; i < 20; i++) {
			for (int j = 0; j<2; j++, count++) {
			
				int y = 50 + 50*j;
				bars.add(new Bar(10 + i*32, y, 30, 20, Color.BLACK));
			
			}
		}

		keys = new boolean[5];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }
   public void reset() {
	   ball.setX(360);
	   ball.setY(300);
	   ball.setXSpeed((int) (Math.random()*6));
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));
		
		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();
		for (Bar b : bars)
			b.draw(graphToBack);
		for (int i = 0; i<bars.size(); i++) {
			Bar b = bars.get(i);
			if (ball.getX() >= b.getX() && ball.getX() <= b.getX() + b.getWidth() && ball.getY() >= b.getY() && ball.getY() <= b.getY() + b.getHeight()) {
				System.out.println("Hit");
				graphToBack.setColor(Color.WHITE);
				bars.remove(i);
				ball.setXSpeed(-ball.getXSpeed());
				ball.setYSpeed(-ball.getYSpeed());
				graphToBack.fillRect(b.getX(), b.getY(), b.getWidth(), b.getHeight());
			}
		}
		ball.moveAndDraw(graphToBack);
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			atariPaddle.moveDownAndDraw(graphToBack);

		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			atariPaddle.moveLeftAndDraw(graphToBack);


		}
		if(keys[2] == true)
		{
			atariPaddle.moveUpAndDraw(graphToBack);

		}
		if(keys[3] == true)
		{
			atariPaddle.moveRightAndDraw(graphToBack);

		}
		
		if (keys[4] == true) {
		}
		if (ball.getY() >= 600) {
			reset();
		}
		if(!(ball.getX()>=0 && ball.getX()<=750))
		{
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());

		}
		if (ball.getX() >= atariPaddle.getX() && ball.getX() <= atariPaddle.getX() + atariPaddle.getWidth() && ball.getY() <= atariPaddle.getY()+atariPaddle.getHeight() && ball.getY() >= atariPaddle.getY())
		{	ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
			leftScore++;
		}
		if(!(ball.getY()>=0))
		{
			System.out.println(ball.getYSpeed()+ " " + ball.getXSpeed());
			ball.setYSpeed(Math.abs(ball.getYSpeed()));
		}
		if(ball.getX()<=0 && ball.getX()>=750)
		{
			ball.setXSpeed(-ball.getXSpeed());

		}
		
		/**
		if (i == 0) {
			leftPaddle.draw(graphToBack);
			rightPaddle.draw(graphToBack);
		}
		i++;

		


		//see if ball hits left wall or right wall
		if(!(ball.getX()>=0 && ball.getX()<=750))
		{
			graphToBack.clearRect(ball.getX(), ball.getY(), ball.getWidth(), ball.getHeight());
			reset();
			leftPaddle.draw(graphToBack);
			rightPaddle.draw(graphToBack);
		}

		if(!(ball.getY()>=0 && ball.getY()<=450))
		{

			ball.setYSpeed(-ball.getYSpeed());
		}

		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			leftPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			leftPaddle.moveDownAndDraw(graphToBack);

		}
		if(keys[2] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		if (keys[4] == true) {
			leftPaddle.draw(graphToBack);
			rightPaddle.draw(graphToBack);
		}
		
		//see if the ball hits the top or bottom wall 



		//see if the ball hits the left paddle
		if (ball.getX() <= leftPaddle.getX() && ball.getX() >= leftPaddle.getX() - leftPaddle.getWidth() && ball.getY() <= leftPaddle.getY()+leftPaddle.getHeight() && ball.getY() >= leftPaddle.getY())
		{	ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
			leftScore++;
		}
		
		//see if the ball hits the right paddle
		
		if (ball.getX() >= rightPaddle.getX() && ball.getX() <= rightPaddle.getX() + rightPaddle.getWidth() && ball.getY() >= rightPaddle.getY() && ball.getY() <= rightPaddle.getY() + rightPaddle.getHeight())
		{	
			ball.setXSpeed(-ball.getXSpeed());
			ball.setYSpeed(-ball.getYSpeed());
			rightScore++;
		}
		


		//see if the paddles need to be moved











		**/

		/*
		graphToBack.clearRect(400, 520, 100, 20);
		graphToBack.clearRect(600, 520, 100, 20);
		graphToBack.drawString("rightscore = " + rightScore, 400, 540);
		graphToBack.drawString("leftscore = " + leftScore, 600, 540);
		*/
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'A' : keys[1]=true; break;
			case 'S' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
			default : keys[4]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'A' : keys[1]=false; break;
			case 'S' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
			default : keys[4]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}