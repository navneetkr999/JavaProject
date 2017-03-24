package com.CarRentals.framedesign;
import com.validationcheck.*;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.CarRentals.filehandling.EmployeeDetailsReadWriteFromFile;
import com.CarRentals.pojo.EmployeeDetails;




public class EmployeeDetailsFarme extends JFrame
{
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	private JTextField tid,tname,temailid,tmobno;
	private JPasswordField tpass;
	private JTextArea tadd;
	private JRadioButton rmale,rfemale;
	private JComboBox day,month,year;
	private String sysdate,systime;
	private JButton badd, bcancel;
	private boolean isdatavalidate;
	
	ArrayList<EmployeeDetails> userlist;
	  
	  EmployeeDetails e;
	
	  public EmployeeDetailsFarme(String title)
	  {
		  super("Employee Details");
	  
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(14,3,4,4));
		  Font f1 = new Font("segoe script",Font.BOLD,20);
		  Font f = new Font("segoe print",Font.BOLD,30);
				
		  tid=new JTextField(20);
		  Random r = new Random();
		  int x = r.nextInt(500000);
		  tid.setText(""+x);
		  tid.setEditable(false);
		  tname = new JTextField(20);
		  tpass = new JPasswordField(20);
		  temailid = new JTextField(20);
		  tmobno = new JTextField(20);
		  
		  
		  tadd=new JTextArea(5,20);
		  JScrollPane tapan=new JScrollPane(tadd);
		  
		  rmale=new JRadioButton("Male");
		  rfemale=new JRadioButton("Female");
		 
		  ButtonGroup rgroup=new ButtonGroup();
		   rgroup.add(rmale);
		   rgroup.add(rfemale);
		   
		   JPanel gpanel=new JPanel();
		   gpanel.add(rmale);
		   gpanel.add(rfemale);
		   
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
				
		   String yvalue[]=new String[50];
		   int cnt=0;
		   for(int i=1962;i<=2011;i++)
		   {
				yvalue[cnt]=String.valueOf(i);
				cnt++;	
		   }
		   year=new JComboBox(yvalue);
			
		    JPanel cpanel=new JPanel();
		    cpanel.add(day);
			cpanel.add(month);
			cpanel.add(year);
			
		   
		   badd = new JButton("ADD");
		   badd.setBackground(Color.DARK_GRAY);
		   badd.setForeground(Color.WHITE);
		   
		   bcancel = new JButton("CANCEL");
		   bcancel.setBackground(Color.DARK_GRAY);
		   bcancel.setForeground(Color.WHITE);
		   
		   
			l1=new JLabel("New Employee");
			l1.setFont(f);
			l1.setForeground(Color.CYAN);
				
			
			l2=new JLabel("Employee Id");
			l2.setFont(f1);
			l2.setForeground(Color.DARK_GRAY);
				
			l3=new JLabel("Pasword");
			l3.setFont(f1);
			l3.setForeground(Color.DARK_GRAY);
			
			l13=new JLabel("Name");
			l13.setFont(f1);
			l13.setForeground(Color.DARK_GRAY);
			
			l14=new JLabel("EmailId");
			l14.setFont(f1);
			l14.setForeground(Color.DARK_GRAY);
			
			l15=new JLabel("Mob No");
			l15.setFont(f1);
			l15.setForeground(Color.DARK_GRAY);
				
			l4=new JLabel("Address");
			l4.setFont(f1);
			l4.setForeground(Color.DARK_GRAY);
			
			l6=new JLabel("Gender");
			l6.setFont(f1);
			l6.setForeground(Color.DARK_GRAY);
				
			l7=new JLabel("DOB");
			l7.setFont(f1);
			l7.setForeground(Color.DARK_GRAY);
			
			l9=new JLabel("Current Date");
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
				
			l10=new JLabel("Current Time");
			l10.setFont(f1);
			l10.setForeground(Color.DARK_GRAY);
			
			c.setBackground(Color.GRAY);
			c.add(l1);c.add(new JLabel(""));
			c.add(new JLabel(""));c.add(new JLabel(""));
			c.add(l2);c.add(tid);
			c.add(l3);c.add(tpass);
			c.add(l13);c.add(tname);
			c.add(l14);c.add(temailid);
			c.add(l15);c.add(tmobno);
			c.add(l4);c.add(tapan);
			c.add(l6);c.add(gpanel);
			c.add(l7);c.add(cpanel);
			c.add(l9);c.add(l11);
			c.add(l10);c.add(l12);
			c.add(badd);c.add(bcancel);
			
			badd.addActionListener((e) ->
		      {
		         addInformation();
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
	  public void createEmpObj()
	   {
		    String eid,pass,ename,emailid,mobno,add,ct,gn,dob,ins;
			
			eid=tid.getText().trim();
			pass=tpass.getText().trim();
			ename = tname.getText().trim();
			emailid = temailid.getText().trim();
			mobno = tmobno.getText().trim();
			add=tadd.getText().trim();
			
			gn="";
			if(rmale.isSelected())
			{
				gn="Male";
			}
			else if(rfemale.isSelected())
			{
				gn="Female";
			}
			
			String d=(String)day.getSelectedItem();
			String m=(String)month.getSelectedItem();
			String y=(String)year.getSelectedItem();
			dob=d + "-" + m + "-" + y;
			
			
			e = new EmployeeDetails(eid, pass, ename, emailid, mobno, add, gn, dob, sysdate, systime);
			Validation obj=new Validation();
			 isdatavalidate = obj.dataValidation(ename,emailid,mobno,pass);
		
		 }
	  
	  
	  public void addInformation()
	     {
		  createEmpObj();
		  
		   if(isdatavalidate){
	       	int idfoundpos = SearchEmp.searchId(tid.getText().trim());
	       	
	       	if(idfoundpos >= 0)
	       		{
	       			JOptionPane.showMessageDialog(this, "ID ALREADY EXIST..PLEASE ENTER ANOTHER ID...");
	       		}
	       	else
	       		{
	       		
      	       
	       		int con=JOptionPane.showConfirmDialog(this, "Add Employee?");
			       if(con==JOptionPane.YES_OPTION)
			       {
				      userlist = EmployeeDetailsReadWriteFromFile.readDataFromFile();
				      userlist.add(e);
				      EmployeeDetailsReadWriteFromFile.writeDatatoFile(userlist);
				      JOptionPane.showMessageDialog(this, "Added Successfully");
				    
				      resetFrame();
			       }
      	 }
		  }
		  
	       	
			  
	     }
      	public void resetFrame()
	     {
	    	 this.dispose();
       	 new EmployeeDetailsFarme("Employee Details..");
	     }
	
	public static void main(String[] args) 
	{
		new EmployeeDetailsFarme("Employee Details..");
		
		}

}
