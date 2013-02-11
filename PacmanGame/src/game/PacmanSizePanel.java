package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PacmanSizePanel extends JPanel implements ActionListener
{
	private JButton btnLarger, btnSmaller;
	
	public PacmanSizePanel()
	{
		setLayout(new GridLayout(0, 2));
		
		btnLarger = new JButton("groter");
		btnLarger.addActionListener(this);
		add(btnLarger);
		
		btnSmaller = new JButton("kleiner");
		btnSmaller.addActionListener(this);
		add(btnSmaller);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
	}
}