package com.CarRentals.framedesign;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagLayoutInfo;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.util.Scanner;

public class AdminLogin extends JFrame
{
	private static final LayoutManager GridBagLayoutInfo = null;
	private static final LayoutManager GridBagLayout = null;
	private static final String title = null;
	private JLabel l4, l5, l6, l7;
	private JTextField tusername;
	private JPasswordField p1;
	private JButton blogin, bcancel;
	
	
	public AdminLogin()
	{
		super("Admin Login");
		
		Container c1 = getContentPane();
		c1.setLayout(new GridLayout(12,2));
		Font f2 = new Font("segoe print",Font.BOLD,30);
		Font f = new Font("segoe script",Font.BOLD,20);
		l4 = new JLabel("Admin Login", l4.CENTER);
		l4.setFont(f2);
		l4.setForeground(Color.CYAN);
		
		l5 = new JLabel("Username");
		l5.setFont(f);
		l5.setForeground(Color.DARK_GRAY);
		
		l6 = new JLabel("Password");
		l6.setFont(f);
		l6.setForeground(Color.DARK_GRAY);
		
		
		tusername = new JTextField(20);
		p1 = new JPasswordField(20);
		
		blogin = new JButton("Login");
		blogin.setBackground(Color.DARK_GRAY);
		blogin.setForeground(Color.WHITE);
		
		bcancel = new JButton("Cancel");
		bcancel.setBackground(Color.DARK_GRAY);
		bcancel.setForeground(Color.WHITE);
		
		
		c1.setBackground(Color.GRAY);
		c1.add(l4);c1.add(new JLabel(""));
		c1.add(l5);
		c1.add(tusername);
		c1.add(l6);
		c1.add(p1);
		c1.add(new JLabel(""));
		c1.add(blogin);
		c1.add(new JLabel(""));
		c1.add(bcancel);
		
	   	setSize(450, 450);
		setLocation(450,100);
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		blogin.addActionListener((e) ->
		{
		   checkUsername();
		}
	  );
		bcancel.addActionListener((e) ->
		{
		   new WelcomePage(title);
		}
	  );
		
}

	 	
	public void checkUsername()
	{
		String s1 = tusername.getText();
		String s2 = p1.getText();
		if(s1.equals("admin") && s2.equals("admin")) 
			{
				new AdminHome();
			}
		else
			{
			JOptionPane.showMessageDialog(this, "Invalid Username and Password");
			}
			tusername.setText("");
			p1.setText("");
	}
	
}