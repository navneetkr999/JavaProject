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

public class RemoveCustomerFrame extends JFrame
{
	private JLabel l1,l2,l3,l4,l5;
	private JTextField tid;
	private JButton bremove, bcancel;
	
	ArrayList<RemoveCustomerFrame> userlist;
	  
	 RemoveCustomerFrame r;
	 public RemoveCustomerFrame(String title)
	  {
		  super("Remove Customer");
	  
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(15,3));
		  		  
		  tid=new JTextField(20);
		  
		  bremove = new JButton("Remove");
		  bremove.setBackground(Color.DARK_GRAY);
		  bremove.setForeground(Color.WHITE);
		  bcancel = new JButton("Cancel");
		  bcancel.setBackground(Color.DARK_GRAY);
		  bcancel.setForeground(Color.WHITE);
		  
		  Font f1=new Font("segoe script",Font.BOLD,20);
		  Font f=new Font("segoe script",Font.BOLD,30);
			
		    l1=new JLabel("REMOVE CUSTOMER", l1.CENTER);
			l1.setFont(f);
			l1.setForeground(Color.CYAN);
				
			//Font f1=new Font("comic sans ms",Font.BOLD,20);
			l2=new JLabel("Customer_Id");
			l2.setFont(f);
			l2.setForeground(Color.DARK_GRAY);
			
			c.add(l1);c.add(new JLabel(""));
			c.add(l2);
			c.add(tid);c.add(new JLabel(""));
			
			c.setBackground(Color.GRAY);
			
			c.add(bremove);c.add(new JLabel(""));c.add(bcancel);
			
			bremove.addActionListener((e) ->
			{
			   removeCus();
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
	 public void removeCus()
     {
    	 int idfoundpos = SearchCus.searchId(tid.getText().trim());

      if(idfoundpos >= 0)
      {
     	 DeleteCusInfo.deleteInfoData(idfoundpos);
         JOptionPane.showMessageDialog(this, "Customer Removed!");
      }
      else
      {
         JOptionPane.showMessageDialog(this, "Entered Customer_Id Not Found, Enter again!");
      }
      resetFrame();
     }
  
  
  public void resetFrame()
     {
    	 this.dispose();
 	 new RemoveCustomerFrame("Remove Customer.");
     }
	
	

	public static void main(String[] args) 
	{
		new RemoveCustomerFrame("Remove Customer");
		
	}

}
