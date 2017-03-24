package com.CarRentals.framedesign;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.CarRentals.filehandling.EmployeeDetailsReadWriteFromFile;
import com.CarRentals.pojo.EmployeeDetails;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;



public class ViewEmp extends JFrame 
{
	private static final long serialVersionUID = 1L;

	public ViewEmp()
	{
		super("Display All");
		String heading[]={"ID","Password","Name","EmailId","MobNo","Address","Gender","DOB","Reg Date","Reg Time"};
		String data[][];
		ArrayList<EmployeeDetails> list;
		try
		{
			list = EmployeeDetailsReadWriteFromFile.readDataFromFile();
			
			data = new String[list.size()][12];
			
			int r=0;
			for(EmployeeDetails re : list)
			{
				data[r][0]=re.getId();
				data[r][1]=re.getPassword();
				data[r][2]=re.getName();
				data[r][3]=re.getEmailid();
				data[r][4]=re.getMobno();
				data[r][5]=re.getAddress();
				data[r][6]=re.getGender();
				data[r][7]=re.getDob();
				data[r][8]=re.getDate();
				data[r][9]=re.getTime();
				r++;
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