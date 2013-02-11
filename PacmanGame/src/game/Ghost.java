package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ghost extends JPanel
{
	private int ghostPosX;
	private int ghostPosY;
	private int eye1PosX;
	private int eye1PosY;
	private Color color;
	
	public Ghost(int ghostPosX, int ghostPosY, Color color)
	{
		this.ghostPosX = ghostPosX;
		this.ghostPosY = ghostPosY;
		this.color = color;
	}
	
	public void teken(Graphics g)
	{
		g.setColor(color);
		g.fillArc(ghostPosX, ghostPosY, 100, 200, 0, 180);
	}
	
	public void setPosX(int currentPosX, int maxWidth){
		if(currentPosX < maxWidth)
		{
			this.ghostPosX += 1;
		}
		else
		{
			this.ghostPosX = -100;
		}
	}
	
	public int getPosX()
	{
		return this.ghostPosX;
	}
}
