package dbTest;

import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class DbTestPanel extends JPanel implements ActionListener {

	private JButton btnAdd;
	private JTextField txtInput;
	private JTextArea txtResult;
	private JScrollPane scrll;
		
	public DbTestPanel(){
		txtInput = new JTextField(13);
		
		btnAdd = new JButton("Toevoegen");
		btnAdd.addActionListener(this);
		
		txtResult = new JTextArea(20, 13);
		
		add(txtInput);
		add(btnAdd);
		add(txtResult);
	}
	
	public void actionPerformed(ActionEvent e){
		
	}
}
