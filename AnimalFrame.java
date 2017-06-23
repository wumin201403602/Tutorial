import java.awt.*;
import javax.swing.*;

public class AnimalFrame extends JFrame
{
	public AnimalFrame()
	{
		//calls super and sets the name of the window
		super();
		//default close
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//set resize
		setResizable(false);
		//set size
		setSize(800, 600);
		//set visible
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		//background color
		g.setColor(new Color(255,0,64));
		g.fillRect(0, 0, 800, 600);

		//antlers
		g.setColor(new Color(185,122,87));
		g.fillRect(260, 130, 20, 100);

		g.setColor(new Color(185,122,87));
		g.fillRect(230, 130, 20, 100);

		g.setColor(new Color(185,122,87));
		g.fillRect(210, 165, 20, 20);

		g.setColor(new Color(185,122,87));
		g.fillRect(280, 145, 20, 20);

		//head
		g.setColor(new Color(185,122,87));
		g.fillOval(175, 200, 140, 110);

		g.setColor(new Color(0,0,0));
		g.fillOval(225, 240, 20, 20);

		g.setColor(new Color(255,255,255));
		g.fillOval(230, 242, 16, 15);

		g.setColor(new Color(0,0,0));
		g.fillOval(170, 260, 15, 10);

		//neck
		g.setColor(new Color(185,122,87));
		g.fillRect(270, 300, 25, 150);
	}
}
