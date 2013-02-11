package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DirectionsPanel extends JPanel implements ActionListener
{
	private JButton btnLeft, btnRight, btnUp, btnDown;
	private Pacman pacman;
	
	public DirectionsPanel(Pacman pacman)
	{
		this.pacman = pacman;
		
		setLayout(new GridLayout(0, 4));
		
		btnLeft = new JButton("<");
		btnLeft.addActionListener(this);
		add(btnLeft);
		
		btnRight = new JButton(">");
		btnRight.addActionListener(this);
		add(btnRight);
		
		btnUp = new JButton("^");
		btnUp.addActionListener(this);
		add(btnUp);
		
		btnDown = new JButton("v");
		btnDown.addActionListener(this);
		add(btnDown);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnLeft)
		{
			pacman.setRichtingPosY(0);
			pacman.setRichtingPosX(-1);
		}
		else if(e.getSource() == btnRight)
		{
			pacman.setRichtingPosY(0);
			pacman.setRichtingPosX(1);
		}
		else if(e.getSource() == btnUp)
		{
			pacman.setRichtingPosX(0);
			pacman.setRichtingPosY(-1);
		}
		else if(e.getSource() == btnDown)
		{
			pacman.setRichtingPosX(0);
			pacman.setRichtingPosY(1);
		}
	}
}