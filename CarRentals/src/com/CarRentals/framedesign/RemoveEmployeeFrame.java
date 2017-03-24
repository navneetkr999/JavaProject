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






public class RemoveEmployeeFrame extends JFrame 
{
	  private JLabel l1,l2, l3;
	  private JTextField tid;
	  private JButton bdelete,bcancel;
	  private Container c;
	  
	    
	  public  RemoveEmployeeFrame(String title)
		
	  {
		  super("Remove Employee");
	  
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(15,2));
		   
		  tid=new JTextField(20);
		  
		  bdelete = new JButton("Remove");
		  bdelete.setBackground(Color.DARK_GRAY);
		  bdelete.setForeground(Color.WHITE);
		  bcancel = new JButton("Cancel");
		  bcancel.setBackground(Color.DARK_GRAY);
		  bcancel.setForeground(Color.WHITE);
		
		
				
			Font f1=new Font("segoe print",Font.BOLD,30);
			Font f2 = new Font("segoe script",Font.BOLD,20);
			
			
			l3 = new JLabel("Remove Employee", l3.CENTER);
			l3.setFont(f1);
			l3.setForeground(Color.cyan);
			l2=new JLabel("Employee Id");
			l2.setFont(f2);
			l2.setForeground(Color.DARK_GRAY);
			
			c.setBackground(Color.GRAY);
			
			c.add(l3);
			c.add(new JLabel(""));
			c.add(l2);c.add(tid);
			c.add(new JLabel(""));
			c.add(bdelete);
			c.add(new JLabel(""));
			c.add(bcancel);
			
		  
			bdelete.addActionListener((e) ->
		      {
		         deleteEmployee();
		      }
		    );
			
			bcancel.addActionListener((e) ->
		      {
		         new AdminHome();
		      }
		    );
			
			 setSize(450, 450);
			 setLocation(450,100);
			 setResizable(false);
			 //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 setVisible(true);	
		  
	  }
	  public void deleteEmployee()
	     {
	    	 int idfoundpos = SearchEmp.searchId(tid.getText().trim());

          if(idfoundpos >= 0)
          {
         	 DeleteEmpInfo.deleteInfoData(idfoundpos);
             JOptionPane.showMessageDialog(this, "Employee Deleted!");
          }
          else
          {
             JOptionPane.showMessageDialog(this, "ID NOT FOUND..PLEASE ENTER ANOTHER ID...");
          }
          resetFrame();
	     }
	  
	  
	  public void resetFrame()
	     {
	    	 this.dispose();
     	 new RemoveEmployeeFrame("Remove Emloyee.");
	     }
	  
	  public static void main(String[] args)
	  {
	  	new RemoveEmployeeFrame("Delete Employee");
	  			  
	  }	  
				
}
