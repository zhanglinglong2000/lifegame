package lifeGame;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui {
 static JFrame jframe;
 static Cell [][]cell;
 static Graphics g;
 final static public int x = 64;
 final static public int y = 64;
	public static void GUI(){
		Gui.init();
		Gui.draw();
	}
	
	public static void init() {
		jframe = new JFrame();
		jframe.setSize(660, 690);
		JPanel jpanel = new JPanel();
		jpanel.setBounds(0,0,800,800);
		cell = new Cell[64][64];
		cell = Chessboard.initial();
		Chessboard.getNeighbor_living(cell);
		jframe.setTitle("ÉúÃüÓÎÏ·--µÚ0Ãë"); 
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setLocationRelativeTo(null);
		jframe.add(jpanel);
		jframe.setVisible(true);
		 g = jpanel.getGraphics();
	}
	
	public static void draw() {
		for(int i=0; i<x; i++)
		    for(int j=0; j<y; j++) {
		    	g.drawRect(i * 10, j * 10, 1 * 10, 1 * 10);
		    }
		for(int i=0; i<x; i++)
			for(int j=0; j<y; j++) {
				if(cell[i][j].getStatus() == 1) {
				    g.fillRoundRect(i * 10, j * 10, 10, 10, 10, 10);
				    
				    //g.fillRect(i * 10, j * 10, 10, 10);
				}
				else {
					g.drawRect(i * 10, j * 10, 1 * 10, 1 * 10);
				}
			}
	}
	
	public static void update()
	{
		jframe.repaint();
		Chessboard.getNeighbor_living(cell);
		Chessboard.update(Gui.cell);
		Gui.draw();
	}
}
