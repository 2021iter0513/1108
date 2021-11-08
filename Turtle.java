import java.awt.*;
import javax.swing.*;

public class Turtle {

	private static final int FRAME_WIDTH = 690;
	private static final int FRAME_HEIGHT = 650;
	private static int pacmanH, pacmanW, enemyH, enemyW, numOfDot, where, start;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final JFrame frame = new JFrame();

		final ImageIcon wall = new ImageIcon("wall.png");
		final ImageIcon empty = new ImageIcon("empty.png");
		final ImageIcon pacman = new ImageIcon("pacman.png");
		

		pacmanH=12;  pacmanW=7;
		
		
		final JLabel[][] f = new JLabel[14][14];
		
		for (int i=0; i<14; i++) {
			for(int j=0; j<14; j++) {
				f[i][j] = new JLabel();
			}
		}

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(14,14));
		frame.requestFocus();


		for(int i=0; i<14; i++) {
			for(int j=0; j<14; j++) {
					f[i][j].setIcon(wall);
					panel.add(f[i][j]);
				
			}
		}
		
		for(int i=1; i<13; i++) {
			for(int j=1; j<13; j++) {
					f[i][j].setIcon(empty);
					frame.add(panel);
				
			}
		}
		
		f[12][7].setIcon(pacman);
		
		frame.setTitle("TurtleGame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
		
	}
