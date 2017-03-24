package com.CarRentals.framedesign;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.CarRentals.filehandling.BookedCarReadWrite;
import com.CarRentals.pojo.BookedCarDetails;
import com.CarRentals.pojo.CarDetails;
public class CarIncomeFrame extends JFrame 
{
	
	private JLabel l1,l2,l3,l4;
	private JTextField tid;
	private JButton bcalculation,bcancel;
	
	ArrayList<CarIncomeFrame> userlist;
	  
	 CarIncomeFrame r;
	  
	public CarIncomeFrame( String title)
	{
		super(title);
		  
		  Container frame=getContentPane();
		  frame.setLayout(new GridLayout(15,2));
		  frame.setBackground(Color.gray);		
		  tid=new JTextField(15);		  
		  
		  bcalculation = new JButton("Show Income");
		  bcalculation.setBackground(Color.DARK_GRAY);
		  bcalculation.setForeground(Color.WHITE);
		  
		  
		  bcancel = new JButton("Cancel");
		  bcancel.setBackground(Color.DARK_GRAY);
		  bcancel.setForeground(Color.WHITE);
		  Font f=new Font("segoe script",Font.BOLD,30);
		  Font f1=new Font("segoe print",Font.BOLD,20);
		  
		  	l1=new JLabel("CAR INCOME REPORT", l1.CENTER);
			l1.setFont(f);
			l1.setForeground(Color.CYAN);
			l2=new JLabel("Car_Id");
			l2.setFont(f1);
			l2.setForeground(Color.DARK_GRAY);
			
			frame.setBackground(Color.GRAY);
			
			frame.add(new JLabel(""));
			frame.add(l1);frame.add(new JLabel(""));
			frame.add(new JLabel(""));frame.add(new JLabel(""));
			frame.add(l2);frame.add(tid);
			frame.add(new JLabel(""));frame.add(new JLabel(""));
			frame.add(bcalculation);frame.add(new JLabel(""));
			frame.add(bcancel);
			
			
			bcalculation.addActionListener((e) ->
            {
            	calculation();
            }
           );
			
			bcancel.addActionListener((e) ->
            {
            	this.dispose();
             }
           );
			
			setSize(450, 450);
			setLocation(450,100);
			setResizable(false);
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
	}	 

	public void calculation()
	{
		{
			 int idfoundpos = SearchBookedCar.searchId(tid.getText().trim());
     	
     	if(idfoundpos >= 0)
     	{
     	   new ViewCalFrame();
     	}
     	else
     	{
     		JOptionPane.showMessageDialog(this, "Car Is Not Booked To Anyone");
     	}
     	}
	}
	public void addIncome()
	{
		BookedCarDetails r;
		ArrayList<BookedCarDetails> list;
		list = BookedCarReadWrite.readDataFromFile();
		
		for(BookedCarDetails robj : list)
		{
			
		}
	}

	public static void main(String[] args) 
	{
		new CarIncomeFrame("income report...");
	}

}

