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

import com.CarRentals.filehandling.CarDetailsReadWriteFromFile;
import com.CarRentals.filehandling.CdataReadWriteFromFile;
import com.CarRentals.pojo.CarDetails;
import com.CarRentals.pojo.CustomerDetails;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchAvailableCarFrame extends JFrame
{
	
	private static final LayoutManager GridBagLayoutInfo = null;
	private static final LayoutManager GridBagLayout = null;
	private JLabel l4, l5, l6, l7;
	private JTextField tcid, tbdate;
	private JComboBox day,month,year;
	private JButton bsearch;
	ArrayList<CarDetails> userlist1;
	CarDetails r;
	
	public SearchAvailableCarFrame(String title)
	{
		super("Available Car Details");
		
		Container c1 = getContentPane();
		c1.setLayout(new GridLayout(12,2));
		Font f2 = new Font("segoe print",Font.BOLD,30);
		Font f = new Font("segoe script",Font.BOLD,20);
		l4 = new JLabel("Search Available Car", l4.CENTER);
		l4.setFont(f2);
		l4.setForeground(Color.pink);
		
		l5 = new JLabel("No. Of Seaters");
		l5.setFont(f);
		l5.setForeground(Color.black);
		
		l6 = new JLabel("Date");
		l6.setFont(f);
		l6.setForeground(Color.BLACK);
		
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
		   
		   
		   tcid = new JTextField(20);
	
		
		bsearch = new JButton("Search");
		bsearch.setBackground(Color.DARK_GRAY);
		bsearch.setForeground(Color.WHITE);
		
		JPanel cpanel=new JPanel();
	    cpanel.add(day);
		cpanel.add(month);
		cpanel.add(year);
		
		c1.setBackground(Color.GRAY);
		c1.add(new JLabel(""));
		c1.add(l4);c1.add(new JLabel(""));
		c1.add(l5);
		c1.add(tcid);
		c1.add(new JLabel(""));
		c1.add(l6);
		c1.add(cpanel);
		c1.add(new JLabel(""));
		c1.add(bsearch);
		
		setSize(450, 450);
		setLocation(450,100);
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		bsearch.addActionListener((e) ->
		{
			String noofseat, bookingdt;
			
			noofseat = tcid.getText().trim();
			String d=(String)day.getSelectedItem();
			String m=(String)month.getSelectedItem();
			String y=(String)year.getSelectedItem();
			bookingdt= d + "-" + m + "-" + y;
			
			
			ArrayList<CarDetails> carlist = SearchCar.searchAvailableCar(noofseat);
			
			ArrayList<CarDetails> carlist1 = SearchCar.searchAvalCar(carlist,bookingdt);
			//System.out.println(carlist1.size());

		     if(carlist1.size() >= 0)
		     {
		    	 new ViewAvailableCarFrame(carlist1);
		    	 
		     }
		    // else
		    //	 JOptionPane.showMessageDialog(this, "Car Booked");
			
			
			
		}
	  );
	}
 
 
 public void resetFrame()
    {
   	 this.dispose();
	 new SearchAvailableCarFrame("Search Booked Cars");
    }
 public static void main(String[] args) 
	{
		new SearchAvailableCarFrame("Search Booked Cars");
		
	}
}