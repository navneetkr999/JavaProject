package com.CarRentals.framedesign;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SearchCarFrame extends JFrame
{
	private JLabel l1,l2,l3,l4,l5;
	private JTextField tid;
	private JButton bsearchcar, bcancel;
	
	ArrayList<SearchCarFrame> userlist;
	  
	 SearchCarFrame r;
	 public SearchCarFrame(String title)
	  {
		  super(title);
	  
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(15,3));
		  		  
		  tid=new JTextField(20);
		  
		  bsearchcar = new JButton("Search");
		  bsearchcar.setBackground(Color.DARK_GRAY);
		  bsearchcar.setForeground(Color.WHITE);
		  bcancel = new JButton("Cancel");
		  bcancel.setBackground(Color.DARK_GRAY);
		  bcancel.setForeground(Color.WHITE);
			
		  Font f=new Font("segoe print",Font.BOLD,30);
		  Font f1=new Font("seoge script",Font.BOLD,20);
			
		  l1=new JLabel("Search Car", l1.CENTER);
			l1.setFont(f);
			l1.setForeground(Color.CYAN);
				
			//Font f1=new Font("comic sans ms",Font.BOLD,20);
			l2=new JLabel("Car_Id");
			l2.setFont(f1);
			l2.setForeground(Color.DARK_GRAY);
			
			
			c.setBackground(Color.GRAY);
			
			c.add(l1);c.add(new JLabel(""));
			c.add(l2);
			c.add(tid);c.add(new JLabel(""));
			
			c.add(bsearchcar);c.add(new JLabel(""));c.add(bcancel);

			bsearchcar.addActionListener((e) ->
			{
			   searchCar();
			}
		  );
			
			bcancel.addActionListener((e) ->
			{
			   new EmployeeHome();
			}
		  );
			
			
			setSize(450, 450);
			setLocation(450,100);
			setResizable(false);
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			
	  }
	 public void searchCar()
     {
    	 int idfoundpos = SearchCar.searchId(tid.getText().trim());

      if(idfoundpos >= 0)
      {
     	 new ViewSearchedCarFrame(idfoundpos);
         
      }
      else
      {
         JOptionPane.showMessageDialog(this, "Entered Car_Id Not Found, Enter again!");
      }
     }	
	

	public static void main(String[] args) 
	{
		new SearchCarFrame("RemoveCars...");
		
	}

}
