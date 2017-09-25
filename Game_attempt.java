package day14.examples;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collections;

import javax.sound.sampled.Line;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game_attempt {
	
	

	public static void main(String[] args) {
		
		JFrame fr=new JFrame("beginning graphics");
		fr.setSize(640,480);
		fr.setLocation(30, 10);
		
		
		
		
		JPanel pan=new JPanel();
		pan.setLayout(null);
		
		JButton ben=new JButton();
		ben.setText("tıklamayınız");
		ben.setLocation(70,45);
		ben.setSize(120,20);
		ben.setHorizontalAlignment(0);
		JTextField alan=new JTextField();
		alan.setText("             ");
		fr.add(alan);
		ben.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()){
				
				case KeyEvent.VK_ESCAPE:
					System.out.println("esc ye bastın");
					break;
				}
				
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				switch(e.getKeyCode()){
				
				case KeyEvent.VK_ESCAPE:
					System.out.println("esc den elini çektin");
					break;
				}

			}

			@Override
			public void keyTyped(KeyEvent e) {
				switch(e.getKeyCode()){
				
				case KeyEvent.VK_ESCAPE:
					System.out.println("esc type ettin");
					break;
				}

			}
			
		});
		pan.add(ben);
		
		fr.setContentPane(pan);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*Component c=new Component();
		fr.add(c); 
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
		
	
	}

}
class Component extends JComponent{

	private static final long serialVersionUID = 1L;
	
	

	public void paintComponent(Graphics g) {
		
		//Graphics2D g2=(Graphics2D) g;
		Rectangle dg=new Rectangle(5, 10, 100, 80);
		g.setColor(Color.green);
		g.fillRect(0, 0, 5*4, 5*4);
		((Graphics2D) g).draw(dg);
		
		Point2D.Double p1=new Point2D.Double(200,200);
		Point2D.Double p2=new Point2D.Double(250,200);
		
		Line2D l1=new Line2D.Double(p1,p2);
		g.setColor(Color.red);
		((Graphics2D) g).draw(l1);
		int currentPiece;
		int rotation;
		Point pieceOrigin=new Point(5,2);
		
		
		
		
		
	}
	
}