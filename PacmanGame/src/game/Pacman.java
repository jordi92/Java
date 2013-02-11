package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Pacman extends JPanel implements ActionListener
{
	private int pacmanPosX = 200;
	private int pacmanPosY = 200;
	private int eyePosX = 225;
	private int eyePosY = 210;
	private int pacmanMouthTop = 45;
	private int pacmanMouthBottom = 300;
	private Ghost ghost1, ghost2, ghost3;
	private int richtingPosY = 0;
	private int richtingPosX = 1;

	public Pacman()
	{	
		ghost1 = new Ghost(20, 20, Color.GREEN);
		ghost2 = new Ghost(120, 120, Color.RED);
		Timer timer = new Timer(5, this);
		timer.start();
		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillArc(pacmanPosX, pacmanPosY, 100, 100, pacmanMouthTop, pacmanMouthBottom);
		g.setColor(Color.BLACK);
		g.fillOval(eyePosX, eyePosY, 15, 15);
		
		ghost1.teken(g);
		ghost2.teken(g);
	}
	
	public void setRichtingPosY(int nieuweRichtingPosY)
	{
		richtingPosY = nieuweRichtingPosY;
	}
	
	public void setRichtingPosX(int nieuweRichtingPosX)
	{
		richtingPosX = nieuweRichtingPosX;
	}
	
	public int getRichtingPosY()
	{
		return richtingPosY;
	}
	
	public int getRichtingPosX()
	{
		return richtingPosX;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(pacmanMouthBottom < 360)
		{
			pacmanMouthTop -= 5;
			pacmanMouthBottom += 5;
		}
		else
		{
			pacmanMouthTop = 45;
			pacmanMouthBottom = 300;
			
		}
		
		//posX
		if(richtingPosX == 1 || richtingPosX == -1)
		{
				if(pacmanPosX > getWidth())
				{
					pacmanPosX = -100;
					eyePosX = -75;
				}
				else if(pacmanPosX + 100 < 0)
				{
					pacmanPosX = getWidth() + 100;
					eyePosX = getWidth() + 25;
				}
			
				else
				{
					pacmanPosX += richtingPosX;
					eyePosX += richtingPosX;
				}
		}
		
		
		else if(richtingPosY == 1 || richtingPosY == -1)
		{
			pacmanPosY += richtingPosY;
			eyePosY += richtingPosY;
		}
		
		int maxWidth = getWidth();
		ghost1.setPosX(ghost1.getPosX(), maxWidth);
		ghost2.setPosX(ghost2.getPosX(), maxWidth);
		repaint();
	}
}
