package game;

import javax.swing.*;
import java.awt.*;

public class FiguresPanel extends JPanel{

	Ghost ghost1;
	public FiguresPanel()
	{
		Pacman pacman = new Pacman();
		add(pacman);
		//ghost1 = new Ghost(20, 20, Color.GREEN);
	}
}
