package com.iasa.ka23.ManagementSystem.ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class WelcomePage extends AbstractInterfaceUnit{

	private JTextField loginField;
	
	private JPasswordField passwordField;	
	
	public WelcomePage(){
	}
	
	public static void startWelcomePage(){
		new WelcomePage().initComponents();	
	}	
	
	private void goFurther() {
		dismiss();
	}
	@Override
	public void initComponents(){
		frame.setName("Log in");
		GridLayout gl = new GridLayout();
		gl.setRows(3);
		windowContent.setLayout(gl);
		JLabel label1 = new JLabel("login: ");
		JLabel label2 = new JLabel("password: ");
		loginField = new JTextField();
		passwordField = new JPasswordField();
		JButton confirmButton = initButton("confirm");		
		windowContent.add(label1);
		windowContent.add(loginField);		
		windowContent.add(label2);
		windowContent.add(passwordField);	
		windowContent.add(confirmButton);
		frame.setContentPane(windowContent);
		frame.setSize(400,100);
		frame.setVisible(true);
	}

	private JButton initButton(String string) {
		JButton button = new JButton(string);
		button.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e){
            	String username = loginField.getText();
            	String password = String.copyValueOf(passwordField.getPassword());
            	if (username.length()<1){
        			JOptionPane.showMessageDialog(frame, "You did not fill the login field");	
            	}
            	else {
            		boolean done = false;
            		try {
            			done = service.login(username, password);
            		} catch (Exception ex){
            			done = true;
            			ex.printStackTrace();
            		}
            		if (!done){
	            		JOptionPane.showMessageDialog(frame, "Fail to connect to database");
	            	}  
            		else {
            			goFurther();
            		}
            	}	
            }
        });   
		return button;
	}
	
}