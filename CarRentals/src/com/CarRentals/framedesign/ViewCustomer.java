package com.CarRentals.framedesign;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.CarRentals.filehandling.CdataReadWriteFromFile;
import com.CarRentals.pojo.CustomerDetails;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;

public class ViewCustomer extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public   ViewCustomer(){
		super("Display all");
		String heading[]={"ID","Name","EmailId","MobNo","Car Id","Gender","Address","Seater","Booking Date","Rate","Booking Time"};
		String data[][];
		ArrayList<CustomerDetails> list;
		try
		{
			list =CdataReadWriteFromFile.readDataFromFile();
			
			data = new String[list.size()][11];
			
			int p=0;
			for( CustomerDetails re : list)
			{
				data[p][0]=re.getId();
				data[p][1]=re.getName();
				data[p][2]=re.getEmailid();
				data[p][3]=re.getMobno();
				data[p][4]=re.getCarid();
				data[p][5]=re.getGender();
				data[p][6]=re.getAddress();
				data[p][7]=re.getSeaters();
				data[p][8]=re.getDate();
				data[p][9]=re.getRate();
				data[p][10]=re.getTime();
				
				p++;
			}
			
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			
			JTable datatable=new JTable(data, heading);
			JScrollPane jsp=new JScrollPane(datatable);
			
			con.add(new JLabel("All Registration Details"),BorderLayout.NORTH);
			con.add(jsp,BorderLayout.CENTER);
			
			setSize(850, 300);
			setLocation(200, 200);
			setVisible(true);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

		
	}
	

