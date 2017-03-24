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

public class RemoveCarFrame extends JFrame
{
	private JLabel l1,l2,l3,l4,l5;
	private JTextField tid;
	private JButton bremove, bcancel;
	
	ArrayList<RemoveCarFrame> userlist;
	  
	 RemoveCarFrame r;
	 public RemoveCarFrame(String title)
	  {
		  super("Remove Car");
	  
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(15,3));
		  Font f1=new Font("segoe script",Font.BOLD,20);
		  Font f=new Font("segoe print",Font.BOLD,30);
		  		  
		  tid=new JTextField(20);
		  
		  bremove = new JButton("Remove");
		  bremove.setBackground(Color.DARK_GRAY);
		  bremove.setForeground(Color.WHITE);
		  bcancel = new JButton("Cancel");
		  bcancel.setBackground(Color.DARK_GRAY);
		  bcancel.setForeground(Color.WHITE);
		 
		  l1=new JLabel("REMOVE CARS", l1.CENTER);
			l1.setFont(f);
			l1.setForeground(Color.CYAN);
				
			//Font f1=new Font("comic sans ms",Font.BOLD,20);
			l2=new JLabel("Car_Id");
			l2.setFont(f1);
			l2.setForeground(Color.DARK_GRAY);
			
			c.add(l1);c.add(new JLabel(""));
			c.add(l2);
			c.add(tid);c.add(new JLabel(""));
			
			c.add(bremove);c.add(new JLabel(""));c.add(bcancel);
			c.setBackground(Color.GRAY);
			
			bremove.addActionListener((e) ->
			{
			   removeCar();
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
	 public void removeCar()
     {
    	 int idfoundpos = SearchCar.searchId(tid.getText().trim());

      if(idfoundpos >= 0)
      {
     	 DeleteCarInfo.deleteInfoData(idfoundpos);
         JOptionPane.showMessageDialog(this, "Car Remover!");
      }
      else
      {
         JOptionPane.showMessageDialog(this, "Entered Car_Id Not Found, Enter again!");
      }
      resetFrame();
     }
  
  
  public void resetFrame()
     {
    	 this.dispose();
 	 new RemoveCarFrame("Remove Cars.");
     }
	
	

	public static void main(String[] args) 
	{
		new RemoveCarFrame("RemoveCars...");
		
	}

}
