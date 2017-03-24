package com.CarRentals.framedesign;

import java.awt.BorderLayout;
import java.awt.Color;




import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage extends JFrame
{
	private JLabel l1, l2, l3, l4;
	private JButton badmin, bemployee;
	
	public WelcomePage(String title)
	{
		super(title);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(15, 1));
		
		
		badmin = new JButton("Admin Login");
		bemployee = new JButton("Employee Login");
		
		Font f=new Font("segoe print",Font.BOLD,25);
		Font f1 = new Font("Segoe script",Font.BOLD,15);
		l1=new JLabel("WELCOME TO CAR RENTALS :)");
		l1.setFont(f);
		l1.setForeground(Color.CYAN);
		
		l2=new JLabel("As the world's biggest online "
				+ "car rental service, we ");
		l3 = new JLabel("specialize in finding the "
				+"cheapest car rental deals from ");
		l4 = new JLabel("major brands such as Audi, Mrcedez, Maruti Suzuki..");
		l2.setFont(f1);
		l2.setForeground(Color.pink);
		l3.setFont(f1);
		l3.setForeground(Color.pink);
		l4.setFont(f1);
		l4.setForeground(Color.pink);
		
		badmin.setBackground(Color.DARK_GRAY);
		badmin.setForeground(Color.WHITE);
		badmin.setMnemonic(KeyEvent.VK_A);
		bemployee.setBackground(Color.DARK_GRAY);
		bemployee.setForeground(Color.WHITE);
		bemployee.setMnemonic(KeyEvent.VK_E);
		
		c.setBackground(Color.GRAY);
		c.add(l1);
		c.add(new JLabel(""));
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(new JLabel(""));c.add(new JLabel(""));
		c.add(badmin);
		c.add(new JLabel(""));
		c.add(bemployee);
		
		 setSize(450, 450);
		 setLocation(450,100);
		 setResizable(false);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		 
		 badmin.addActionListener((e) ->
			{
			 
				new AdminLogin();
			}
		  );
		 bemployee.addActionListener((e) ->
			{
			   new EmployeeLogin();
			}
		  );
		 
		 
		 
	}

	public static void main(String[] args) 
	{
		new WelcomePage("WELCOME TO CAR RENTAL..");

	}

}
