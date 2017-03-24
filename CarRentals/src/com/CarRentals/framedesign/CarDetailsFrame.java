package com.CarRentals.framedesign;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.CarRentals.filehandling.CarDetailsReadWriteFromFile;
import com.CarRentals.pojo.CarDetails;

public class CarDetailsFrame extends JFrame
{
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	private JTextField tid,tname,tmodno,tseater,trate;
	private JButton badd, bcancel;
	private String sysdate,systime;
	
	ArrayList<CarDetails> userlist;
	  
	  CarDetails r;
	
	  public CarDetailsFrame(String title)
	  {
		  super("Car Details");
	  
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(15,3,4,4));
		  
		  
		  tid=new JTextField(20);
		  Random r = new Random();
		  int x = r.nextInt(2000);
		  tid.setText(""+x);
		  tid.setEditable(false);
		  tname = new JTextField(20);
		  tmodno = new JTextField(20);
		  tseater = new JTextField(20);
		  trate = new JTextField(20);
		  
		  badd = new JButton("Add");
		  badd.setBackground(Color.DARK_GRAY);
		  badd.setForeground(Color.WHITE);
		  bcancel = new JButton("Cancel");
		  bcancel.setBackground(Color.DARK_GRAY);
		  bcancel.setForeground(Color.WHITE);
		  
		  
		  Font f=new Font("segoe print",Font.BOLD,30);
			l1=new JLabel("Add New Car");
			l1.setFont(f);
			l1.setForeground(Color.CYAN);
				
			Font f1=new Font("segoe script",Font.BOLD,20);
			l2=new JLabel("Car Id");
			l2.setFont(f1);
			l2.setForeground(Color.DARK_GRAY);
				
			l3=new JLabel("Brand");
			l3.setFont(f1);
			l3.setForeground(Color.DARK_GRAY);
			
			l4=new JLabel("Model Name");
			l4.setFont(f1);
			l4.setForeground(Color.DARK_GRAY);
			
			l5=new JLabel("Number Of Seaters");
			l5.setFont(f1);
			l5.setForeground(Color.DARK_GRAY);
			
			l6=new JLabel("Rate Per Day");
			l6.setFont(f1);
			l6.setForeground(Color.DARK_GRAY);
			
			
			l9=new JLabel("Add Date");
			l9.setFont(f1);
			l9.setForeground(Color.DARK_GRAY);
			
			
			LocalDate today = LocalDate.now();
			int day = today.getDayOfMonth();
	  		int month = today.getMonthValue();
	  		int year = today.getYear();
				
			sysdate = day+"/"+month+"/"+year;
			l11=new JLabel(sysdate);		
			
			
			LocalTime time = LocalTime.now();
			int hr = time.getHour();
	 		int min = time.getMinute();
	 		int sec = time.getSecond();
			
	 		systime = hr+":"+min+":"+sec;
			l12=new JLabel(systime);		
				
			l10=new JLabel("Add Time");
			l10.setFont(f1);
			l10.setForeground(Color.DARK_GRAY);
			
			c.add(l1);c.add(new JLabel(""));
			c.add(new JLabel(""));c.add(new JLabel(""));
			c.add(l2);c.add(tid);
			c.add(l3);c.add(tname);
			c.add(l4);c.add(tmodno);
			c.add(l5);c.add(tseater);
			c.add(l6);c.add(trate);
			
			c.add(l9);c.add(l11);
			c.add(l10);c.add(l12);
			c.add(new JLabel(""));c.add(new JLabel(""));
			c.add(badd);c.add(bcancel);
			
			c.setBackground(Color.GRAY);
			
			badd.addActionListener((e) ->
            {
           	     addCar();
           	
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
	  public void createCarObj()
	   {
		    String id,brand,modelname,seaters,rate;
			
			
			id=tid.getText().trim();  //trim will remove space after string
			brand=tname.getText().trim();
			modelname = tmodno.getText().trim();
			seaters = tseater.getText().trim();
			rate = trate.getText().trim();
			ArrayList<String> dtlist = new ArrayList<String>(); 
			r=new CarDetails(id,brand,modelname,seaters,rate,sysdate,systime, dtlist);
	   }
	  public void addCar()
	     {
	       	int idfoundpos = SearchEmp.searchId(tid.getText().trim());
     	
     	if(idfoundpos >= 0)
     	{
     	   JOptionPane.showMessageDialog(this, "ID ALREADY EXIST..PLEASE ENTER ANOTHER ID...");
     	}
     	else
     	{
     		   createCarObj();
     	       
     		   int con=JOptionPane.showConfirmDialog(this, "Are You Sure to Add?");
			       if(con==JOptionPane.YES_OPTION)
			       {
				      userlist = CarDetailsReadWriteFromFile.readDataFromFile();
				      userlist.add(r);
				      CarDetailsReadWriteFromFile.writeDatatoFile(userlist);
				      JOptionPane.showMessageDialog(this, "Add Successfully...");
				    
				      resetFrame();
			       }
     	 }
	      }
	  public void resetFrame()
	     {
	    	 this.dispose();
    	 new CarDetailsFrame("Car Details..");
	     }  
		 
				

	public static void main(String[] args) 
	{
		new CarDetailsFrame("Car Details...");

	}

}
