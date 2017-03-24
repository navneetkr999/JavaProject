package com.CarRentals.framedesign;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagLayoutInfo;
import java.awt.GridLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.util.Scanner;

public class BookedCarFrame extends JFrame
{
	private static final LayoutManager GridBagLayoutInfo = null;
	private static final LayoutManager GridBagLayout = null;
	private JLabel l4, l5, l6, l7;
	private JTextField tseater;
	private JComboBox day,month,year;
	private JButton bsearch,bcancel;
	
	
	public BookedCarFrame()
	{
		super("Booked car Details");
		
		Container c1 = getContentPane();
		c1.setLayout(new GridLayout(15,2));
		Font f2 = new Font("segoe print",Font.BOLD,30);
		Font f = new Font("segoe script",Font.BOLD,20);
		l4 = new JLabel("Search Booked Car", l4.CENTER);
		l4.setFont(f2);
		l4.setForeground(Color.CYAN);
		
		l5 = new JLabel("Number of Seaters");
		l5.setFont(f);
		l5.setForeground(Color.DARK_GRAY);
		
		l6 = new JLabel("Booked Date");
		l6.setFont(f);
		l6.setForeground(Color.DARK_GRAY);
		
		String dvalue[]=new String[31];
		   for(int i=0;i<=30;i++)
		   {
				dvalue[i]=String.valueOf(i+1);
		   }
		   day=new JComboBox(dvalue);
				
		   String mvalue[]=new String[12];
		   for(int i=0;i<=11;i++)
		   {
				mvalue[i]=String.valueOf(i+1);
		   }
		   month=new JComboBox(mvalue);
				
		   String yvalue[]=new String[8];
		   int cnt=0;
		   for(int i=2010;i<=2017;i++)
		   {
				yvalue[cnt]=String.valueOf(i);
				cnt++;	
		   }
		   year=new JComboBox(yvalue);
		   
		
		tseater = new JTextField(20);
	
		
		bsearch = new JButton("Search");
		bsearch.setBackground(Color.DARK_GRAY);
		bsearch.setForeground(Color.WHITE);
		
		bcancel = new JButton("Cancel");
		bcancel.setBackground(Color.DARK_GRAY);
		bcancel.setForeground(Color.WHITE);
		
		JPanel cpanel=new JPanel();
	    cpanel.add(day);
		cpanel.add(month);
		cpanel.add(year);
		
		c1.setBackground(Color.GRAY);
		c1.add(new JLabel(""));
		c1.add(l4);c1.add(new JLabel(""));
		c1.add(l5);
		c1.add(tseater);
		c1.add(new JLabel(""));
		c1.add(l6);
		c1.add(cpanel);
		c1.add(new JLabel(""));
		c1.add(bsearch);
		c1.add(new JLabel(""));
		c1.add(bcancel);
		
	   	setSize(450, 450);
		setLocation(450,100);
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		bsearch.addActionListener((e) ->
		{
		    new SearchBookedCar();
		}
	  );
		
		bcancel.addActionListener((e) ->
		{
		    new EmployeeHome();
		}
	  );
		
}

	
}