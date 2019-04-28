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

	public void createNBars(int n, int spacing, int y) {
		int numSpaces = n - 1;
		int tileSize = (800 - (spacing * numSpaces))/n;
		for (int i = 0; i<=800; i+=tileSize+spacing) {
			bars.add(new Bar(i, y, tileSize, 20, Color.BLACK));
		}
				
	}
	public void createNBarsVertical(int n, int spacing, int x) {
		int numSpaces = n - 1;
		int tileSize = (600 - (spacing * numSpaces))/n;
		for (int i = 0; i<=600; i+=tileSize+spacing) {
			bars.add(new Bar(x, i, 20, tileSize, Color.BLACK));
		}
		
	}
	public Pong()
	{
		//set up all variables related to the game
		//instantiate a Ball
				ball = new Ball(400, 300, 10, 10, 3, 3, Color.RED);
				
				atariPaddle = new Paddle(360, 400, 40, 40);

		bars = new ArrayList<Bar>();
		createNBars(30, 5, 0);
		createNBars(30, 5, 520);
		createNBarsVertical(30, 5, 0);
		createNBarsVertical(30, 5, 750);
		createNBars(30, 5, 25);
		createNBars(30, 5, 495);
		createNBarsVertical(30, 5, 25);
		createNBarsVertical(30, 5, 715);
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
		//graphToBack.clearRect(50, 50, 700, 500);
		if (i == 0) {
			atariPaddle.draw(graphToBack);
		}
		i++;
		for (Bar b : bars)
			b.draw(graphToBack);
		for (int i = 0; i<bars.size(); i++) {
			Bar b = bars.get(i);
			if (ball.getX() >= b.getX() && ball.getX() <= b.getX() + b.getWidth() && ball.getY() >= b.getY() && ball.getY() <= b.getY() + b.getHeight()) {
				bars.remove(i);
				ball.setXSpeed(-ball.getXSpeed());
				ball.setYSpeed(-ball.getYSpeed());
				graphToBack.setColor(Color.WHITE);

				graphToBack.fillRect(b.getX(), b.getY(), b.getWidth(), b.getHeight());
			}
		}
		ball.moveAndDraw(graphToBack);
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			/*if (atariPaddle.getY() - atariPaddle.getSpeed() >= 400)*/ atariPaddle.moveDownAndDraw(graphToBack);

		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			/*if (atariPaddle.getX() - atariPaddle.getSpeed() >= 0)*/ atariPaddle.moveLeftAndDraw(graphToBack);


		}
		if(keys[2] == true)
		{
			/*if (atariPaddle.getY() + atariPaddle.getSpeed() <= 500)*/ atariPaddle.moveUpAndDraw(graphToBack);

		}
		if(keys[3] == true)
		{
			/*if (atariPaddle.getX() + atariPaddle.getSpeed() <= 740)*/ atariPaddle.moveRightAndDraw(graphToBack);

		}
		
		if (keys[4] == true) {
		}
		if (ball.getY() >= 600) {
			reset();
		}
		
		if(!(ball.getX()>=0 && ball.getX()<=800))
		{
			
			ball.setYSpeed(-ball.getYSpeed());

		}
		if (ball.getX() >= atariPaddle.getX() && ball.getX() <= atariPaddle.getX() + atariPaddle.getWidth() && ball.getY() <= atariPaddle.getY()+atariPaddle.getHeight() && ball.getY() >= atariPaddle.getY())
		{	
			ball.setYSpeed(-ball.getYSpeed());
			atariPaddle.draw(graphToBack);

		} // Hit condition
		if(!(ball.getY()>=0))
		{
			System.out.println(ball.getYSpeed()+ " " + ball.getXSpeed());
			ball.setYSpeed(Math.abs(ball.getYSpeed()));
		}
		if(ball.getX()-ball.getXSpeed() <= 0 || ball.getX() + ball.getXSpeed() >= 800)
		{
			reset();
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