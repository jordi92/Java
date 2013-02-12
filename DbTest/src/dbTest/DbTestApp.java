package dbTest;

import javax.swing.*;

public class DbTestApp extends JFrame {

	public DbTestApp(){
	 	setSize(300, 500);
	 	setDefaultCloseOperation(EXIT_ON_CLOSE);
	 	setTitle("DBTest app");
	 	setLocation(10, 10);
	 	add(new DbTestPanel());
	 	setVisible(true);
	}
	
	public static void main(String[] args) {
		new DbTestApp();
	}
}
