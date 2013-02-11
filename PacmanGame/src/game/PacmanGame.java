package game;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class PacmanGame extends JFrame
{

	public PacmanGame()
	{
		this.setSize(700, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Pacman");
		this.setLocation(100, 100);
		
		Pacman figures = new Pacman();
		
		DirectionsPanel directionsPanel = new DirectionsPanel(figures);
		add(directionsPanel, BorderLayout.SOUTH);
		
		PacmanSizePanel sizePanel = new PacmanSizePanel();
		add(sizePanel, BorderLayout.NORTH);
		
		
		add(figures, BorderLayout.CENTER);		
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new PacmanGame();
	}
}
