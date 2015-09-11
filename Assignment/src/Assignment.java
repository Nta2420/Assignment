import java.awt.Graphics;

import javax.swing.JApplet;

public class Assignment extends JApplet{
	public void paint(Graphics canvas){
		canvas.drawArc(600, 284, 150, 150, 0, 360);
		canvas.fillArc(625, 309, 100, 100, 0, 360);
		canvas.drawArc(450, 284, 150, 150, -90, 180);
		canvas.drawArc(750, 284, 150, 150, 90, 180);
		canvas.drawArc(600, 134, 150, 150, 0, -180);
		canvas.drawArc(600, 434, 150, 150, 0, 180);
	}

}
