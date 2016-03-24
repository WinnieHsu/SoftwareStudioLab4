import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;


public class MyJPanel extends JPanel implements MouseMotionListener{
	
	private Square square = new Square(100);
	int centerX = 0;
	int centerY = 0;
	
	public MyJPanel(){
		addMouseMotionListener(this);
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(square.getRandomColor());
		// TODO Draw square and fill it with random color decided by method getRandomColor()
		g.fillRect(centerX, centerY, square.getShapeHeight(), square.getShapeWidth());
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Get mouse dragged position and change suqare's position
		centerX = e.getX()-square.getShapeWidth()/2;
		centerY = e.getY()-square.getShapeHeight()/2;
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// No need to implement
	}
}
