import java.awt.Color;
import java.awt.Font;
import java.io.*;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class Viewer {
	public static void main(String... args) {
		JFrame mainframe = new JFrame();
		JLabel l = new JLabel();
		mainframe.add(l);
		l.setBounds(0, 0, 500, 500);
		l.setText("");
		l.setForeground(Color.red); // I have an error here
		l.setFont(new Font("Product Sans", Font.BOLD, 30));
		mainframe.getContentPane().setBackground(Color.black);
		mainframe.setSize(1920, 1080);
		mainframe.setVisible(true);
		mainframe.setLayout(null);
		String str = "";
		MrMauro m = new MrMauro();
		str+=" Happy belated birthday Mr. Mauro! I appreciate all of your help across the board, and here's to many more great years!!!";
		for (int i = 0; i < str.length(); i++) {
			char thischar = str.charAt(i);
			if (l.getText().length() > 0) {
				l.setText(l.getText().substring(0, l.getText().length()-1) + thischar + "_");
			}
			else {
				l.setText(l.getText() + thischar);
			}
			try {
				TimeUnit.MILLISECONDS.sleep(150);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}

		
	}
}
