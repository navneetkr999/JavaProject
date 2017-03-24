package com.CarRentals.framedesign;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class AdminHome extends JFrame
{
	private JLabel l2, l3;
	private JButton addemp, vemp, delemp, addcar, vcar, delcar, bcal,logout;
	private String title;
	
	
	public AdminHome()
	{
		super("Home");
		
		Container c3 = getContentPane();
		c3.setLayout(new GridLayout(16, 3));
		Font f1 = new Font("segoe print",Font.BOLD,30);
		Font f = new Font("segoe script",Font.BOLD,20);
		
		l2 = new JLabel("Welcome Admin :)", l2.CENTER);
		l2.setFont(f1);
		l2.setForeground(Color.cyan);
		
		l3 = new JLabel("What do you like to do today..");
		l3.setFont(f);
		l3.setForeground(Color.pink);
		
		addemp = new JButton("Add Employee");
		addemp.setBackground(Color.DARK_GRAY);
		addemp.setForeground(Color.WHITE);
		
		vemp = new JButton("View Employee");
		vemp.setBackground(Color.DARK_GRAY);
		vemp.setForeground(Color.WHITE);
		
		delemp = new JButton("Remove Employee");
		delemp.setBackground(Color.DARK_GRAY);
		delemp.setForeground(Color.WHITE);
		
		addcar = new JButton("Add New Cars");
		addcar.setBackground(Color.DARK_GRAY);
		addcar.setForeground(Color.WHITE);
		
		vcar = new JButton("View Cars");
		vcar.setBackground(Color.DARK_GRAY);
		vcar.setForeground(Color.WHITE);
		
		delcar = new JButton("Remove Cars");
		delcar.setBackground(Color.DARK_GRAY);
		delcar.setForeground(Color.WHITE);
		
		bcal = new JButton("Calculation");
		bcal.setBackground(Color.DARK_GRAY);
		bcal.setForeground(Color.WHITE);
		
		logout = new JButton("Logout");
		logout.setBackground(Color.DARK_GRAY);
		logout.setForeground(Color.WHITE);
		
		c3.setBackground(Color.GRAY);
		
		c3.add(l2);
		c3.add(new JLabel(""));
		c3.add(l3);
		c3.add(new JLabel(""));
		c3.add(new JLabel(""));
		c3.add(addemp);
		c3.add(vemp);
		c3.add(delemp);
		c3.add(new JLabel(""));
		c3.add(addcar);
		c3.add(vcar);
		c3.add(delcar);
		c3.add(new JLabel(""));
		c3.add(bcal);
		c3.add(new JLabel(""));
		c3.add(logout);
		addemp.addActionListener((e) ->
	      {
	         new EmployeeDetailsFarme(title);
	      }
	    );
		
		vemp.addActionListener((e) ->
	      {
	         new ViewEmp();
	      }
	    );
		delemp.addActionListener((e) ->
	      {
	         new RemoveEmployeeFrame(title);
	      }
	    );
		addcar.addActionListener((e) ->
	      {
	         new CarDetailsFrame(title);
	      }
	    );
		vcar.addActionListener((e) ->
	      {
	         new ViewCarFrame();
	      }
	    );
		delcar.addActionListener((e) ->
	      {
	         new RemoveCarFrame(title);
	      }
	    );
		
		
		logout.addActionListener((e) ->
	      {
	         new AdminLogin();
	      }
	    );
		
		bcal.addActionListener((e) ->
	      {
	         new CarIncomeFrame(title);
	      }
	    );

		
		setSize(450, 450);
		setLocation(450,100);
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	

	public static void main(String[] args)
	{
		new AdminHome();
	}
}
