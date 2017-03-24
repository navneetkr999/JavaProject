package com.CarRentals.framedesign;

import java.awt.Color;
import java.awt.Component;
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

import com.CarRentals.filehandling.BookedCarReadWrite;
import com.CarRentals.filehandling.CarDetailsReadWriteFromFile;
import com.CarRentals.filehandling.CdataReadWriteFromFile;
import com.CarRentals.filehandling.EmployeeDetailsReadWriteFromFile;
import com.CarRentals.pojo.BookedCarDetails;
import com.CarRentals.pojo.CarDetails;
import com.CarRentals.pojo.CustomerDetails;
import com.CarRentals.pojo.EmployeeDetails;
import com.validationcheck.Validation;





public class CustomerDetailsFrame extends JFrame
{
	private static final EmployeeDetailsReadWriteFromFile CustomerDetailsReadWriteFromFile = null;
	private static final Component seater = null;
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
	  private JTextField tid,tname,temailid,tmobno,tdate,tseat,trate;
	  
	  private JTextArea tadd;
	  private JRadioButton rmale,rfemale;
	  private JComboBox day,month,year,day1,month1,year1, combocarid;
	  private String sysdate,systime;
	  private JButton badd, bcancel,bfill;
	  private String j;
	  
	  CarDetails r2;
	  CustomerDetails r;
	  BookedCarDetails r1;
	  ArrayList<BookedCarDetails> blist;
	  ArrayList<CarDetails> carlist = new ArrayList<CarDetails>();
	  private boolean isdatavalidate;
	  
	  ArrayList<CustomerDetails> userlist1;
	
	  public CustomerDetailsFrame(String title)
	  {
		  super(title);
	  
		  Container c=getContentPane();
		  c.setLayout(new GridLayout(16,2));
				
		  tid=new JTextField(20);
		  Random r = new Random();
		  int x = r.nextInt(500000);
		  tid.setText(""+x);
		  tid.setEditable(false);
		  tname = new JTextField(20);
		  trate = new JTextField(20);
		  temailid = new JTextField(20);
		  tmobno = new JTextField(20);
		  tseat = new JTextField(20);
		  
		  combocarid = new JComboBox();
		  
		  carlist = CarDetailsReadWriteFromFile.readDataFromFile();
		  for(CarDetails c1 : carlist)
		  {
			  combocarid.addItem(c1.getId());
		  }
		  
		  
		  
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
				
		   String yvalue[]=new String[8];
		   int cnt=0;
		   for(int i=2010;i<=2017;i++)
		   {
				yvalue[cnt]=String.valueOf(i);
				cnt++;	
		   }
		   year=new JComboBox(yvalue);
		   
		   
			
		    JPanel cpanel=new JPanel();
		    cpanel.add(day);
			cpanel.add(month);
			cpanel.add(year);
			
		   badd = new JButton("Add");
		   badd.setBackground(Color.DARK_GRAY);
		   badd.setForeground(Color.WHITE);
		   bcancel = new JButton("Cancel");
		   bcancel.setBackground(Color.DARK_GRAY);
		   bcancel.setForeground(Color.WHITE);
		   
		   bfill = new JButton("Fill Car Info");
		   bfill.setBackground(Color.DARK_GRAY);
		   bfill.setForeground(Color.WHITE);
		  
		    Font f = new Font("segoe script",Font.BOLD,23);
			l1=new JLabel("Customer Details");
			l1.setFont(f);
			l1.setForeground(Color.CYAN);
				
			Font f1 = new Font("segoe print",Font.BOLD,15);
			l2=new JLabel("Customer Id");
			l2.setFont(f1);
			l2.setForeground(Color.DARK_GRAY);
				
			l3=new JLabel("Pasword");
			l3.setFont(f1);
			l3.setForeground(Color.DARK_GRAY);
			
			l13=new JLabel("Name");
			l13.setFont(f1);
			l13.setForeground(Color.DARK_GRAY);
			
			l14=new JLabel("Email Id");
			l14.setFont(f1);
			l14.setForeground(Color.DARK_GRAY);
			
			l15=new JLabel("Mobile No");
			l15.setFont(f1);
			l15.setForeground(Color.DARK_GRAY);
			
			l5=new JLabel("Car Id");
			l5.setFont(f1);
			l5.setForeground(Color.DARK_GRAY);
			
			l8=new JLabel("Seaters");
			l8.setFont(f1);
			l8.setForeground(Color.DARK_GRAY);
				
			l4=new JLabel("Address");
			l4.setFont(f1);
			l4.setForeground(Color.DARK_GRAY);
			
			l6=new JLabel("Gender");
			l6.setFont(f1);
			l6.setForeground(Color.DARK_GRAY);
			
			l7=new JLabel("Booking Date");
			l7.setFont(f1);
			l7.setForeground(Color.DARK_GRAY);
			
			
				
				
		
			
					
			
			
			LocalTime time = LocalTime.now();
			int hr = time.getHour();
	 		int min = time.getMinute();
	 		int sec = time.getSecond();
			
	 		systime = hr+":"+min+":"+sec;
			l12=new JLabel(systime);		
				
			l10=new JLabel("Booking Time");
			l10.setFont(f1);
			l10.setForeground(Color.DARK_GRAY);
			
			l16=new JLabel("Rate");
			l16.setFont(f1);
			l16.setForeground(Color.DARK_GRAY);
			c.setBackground(Color.GRAY);
			
			c.add(l1);c.add(new JLabel(""));
			c.add(new JLabel(""));c.add(new JLabel(""));
			c.add(l2);c.add(tid);
			c.add(l13);c.add(tname);
			c.add(l14);c.add(temailid);
			c.add(l15);c.add(tmobno);
			c.add(l5);c.add(combocarid);
			c.add(l8);c.add(tseat);
			c.add(l16);c.add(trate);
			c.add(l4);c.add(tapan);
			c.add(l6);c.add(gpanel);
			c.add(l7);c.add(cpanel);
			c.add(l10);c.add(l12);
			c.add(new JLabel(""));c.add(new JLabel(""));
			c.add(bfill);
			c.add(badd);c.add(bcancel);
			
			badd.addActionListener((e) ->
		      {
		         addCustDetail();
		      }
		    );
			
			bcancel.addActionListener((e) ->
			{
				this.dispose();
			}
		);
			bfill.addActionListener((e) ->
			{
				String Carid = (String)combocarid.getSelectedItem();
				int index = SearchCar.searchId(Carid);
				
				if(index>=0)
				{
					ArrayList<CarDetails> list;
					list = CarDetailsReadWriteFromFile.readDataFromFile();
					
					CarDetails cobj = list.get(index);
					tseat.setText(cobj.getSeaters());
					trate.setText(cobj.getRate());
					tseat.setEditable(false);
					trate.setEditable(false);
				}
			}
		);
			
			 setSize(450, 450);
			 setLocation(450,100);
			 setResizable(false);
			 //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 setVisible(true);
			
	  }	
	  public void bookedCarObj(){
		    String noofseat, pud, carid, rate;
		    
			carid= (String)combocarid.getSelectedItem();
			noofseat = tseat.getText();
			rate = trate.getText().trim();
			String d=(String)day.getSelectedItem();
			String m=(String)month.getSelectedItem();
			String y=(String)year.getSelectedItem();
			pud=d + "-" + m + "-" + y;
			
			
			r1 = new BookedCarDetails(carid, pud, noofseat, rate);
	  }
	  
	  public void createCusOBJ(){
		  String eid,ename,emailid,mobno,add,gn,seat,rate,bdate,carid;
		    eid=tid.getText().trim();
		    ename = tname.getText().trim();	
			emailid = temailid.getText().trim();
			mobno = tmobno.getText().trim();
			carid= (String)combocarid.getSelectedItem();
			seat = tseat.getText().trim();
			rate = trate.getText().trim();
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
			bdate=d + "-" + m + "-" + y;
			
			
			r = new CustomerDetails(eid, ename, emailid, mobno, carid, gn, add,seat, bdate,rate, systime);
			Validation obj=new Validation();
			 isdatavalidate = obj.dataValidation(ename,emailid,mobno, y);
			
	  }
			 public void addCustDetail()
		     {
				 createCusOBJ();
				 bookedCarObj();
				 if(isdatavalidate)
				 {
					 
				
		       	int idfoundpos = SearchEmp.searchId(tid.getText().trim());
	      	
	      	if(idfoundpos >= 0)
	      	{
	      	   JOptionPane.showMessageDialog(this, "ID ALREADY EXIST..PLEASE ENTER ANOTHER ID...");
	      	}
	      	else
	      	{
	      		   //createCusOBJ();
	      	       
	      		   int con=JOptionPane.showConfirmDialog(this, "Add Customer?");
				       if(con==JOptionPane.YES_OPTION)
				       {
					      userlist1 = CdataReadWriteFromFile.readDataFromFile();
					      userlist1.add(r);
					      CdataReadWriteFromFile.writeDatatoFile(userlist1);
					      JOptionPane.showMessageDialog(this, "Customer Added Successfully");
					    
					      blist = BookedCarReadWrite.readDataFromFile();
					      blist.add(r1);
					      BookedCarReadWrite.writeDatatoFile(blist);
					     resetFrame();
				       }
	      	}       
		 }
	}
			 public void resetFrame()
		     {
		    	 this.dispose();
	     	 new CustomerDetailsFrame("Add Customers");
		     }
	public static void main(String[] args) 
	{
		new CustomerDetailsFrame("CustomerDetails...");
	}

}
