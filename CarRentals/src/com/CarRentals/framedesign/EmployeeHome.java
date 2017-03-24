package com.CarRentals.framedesign;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EmployeeHome extends JFrame
{
	private JLabel l1, l2,l3,l4,l5;
	private JButton addcst, vcst, rcst, addcar, vcar, scar,sbcar, logout;
	private String title;
	
	
	public EmployeeHome()
	{
		super("Home");
		
		Container c3 = getContentPane();
		c3.setLayout(new GridLayout(15, 5));
		Font f1 = new Font("segoe print",Font.BOLD,30);
		Font f = new Font("segoe script",Font.BOLD,20);
		
		l1 = new JLabel("CAR RENTALS..");
		l1.setFont(f1);
		l1.setForeground(Color.cyan);
		
		l2 = new JLabel("Welcome, what do you like to do today.. ");
		l2.setFont(f);
		l2.setForeground(Color.pink);
		
		
		addcst = new JButton("Add Customer");
	 	addcst.setBackground(Color.DARK_GRAY);
		addcst.setForeground(Color.WHITE);
		
		
		vcst = new JButton("View Customer");
		vcst.setBackground(Color.DARK_GRAY);
		vcst.setForeground(Color.WHITE);
		
		rcst = new JButton("Remove Customer");
		rcst.setBackground(Color.DARK_GRAY);
		rcst.setForeground(Color.WHITE);
		
		
		addcar = new JButton("Add New Cars");
		addcar.setBackground(Color.DARK_GRAY);
		addcar.setForeground(Color.WHITE);
		
		vcar = new JButton("View Cars");
		vcar.setBackground(Color.DARK_GRAY);
		vcar.setForeground(Color.WHITE);
		
		scar = new JButton("Search Cars");
		scar.setBackground(Color.DARK_GRAY);
		scar.setForeground(Color.WHITE);
		
		sbcar = new JButton("Search Available Cars");
		sbcar.setBackground(Color.DARK_GRAY);
		sbcar.setForeground(Color.WHITE);
		
		logout = new JButton("Logout");
		logout.setBackground(Color.DARK_GRAY);
		logout.setForeground(Color.WHITE);
		
		c3.setBackground(Color.GRAY);
		c3.add(l1);
		c3.add(l2);
		c3.add(new JLabel(""));
		c3.add(sbcar);
		c3.add(new JLabel(""));
		c3.add(addcst);
		c3.add(new JLabel(""));
		c3.add(vcst);
		c3.add(new JLabel(""));
		c3.add(rcst);
		c3.add(new JLabel(""));
		c3.add(scar);
		c3.add(new JLabel(""));
		c3.add(logout);
		
		
		addcst.addActionListener((e) ->
		{
		   new CustomerDetailsFrame(title);
		}
	  );
		vcst.addActionListener((e) ->
		{
		   new ViewCustomer();
		}
	  );
		rcst.addActionListener((e) ->
		{
		   new RemoveCustomerFrame(title);
		}
	  );
		scar.addActionListener((e) ->
		{
		   new SearchCarFrame(title);
		}
	  );
		sbcar.addActionListener((e) ->
		{
		   new SearchAvailableCarFrame(title);
		}
	  );
		logout.addActionListener((e) ->
	      {
	         new EmployeeLogin();
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
		new EmployeeHome() ;

	}

}
