package com.CarRentals.framedesign;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.CarRentals.filehandling.BookedCarReadWrite;
import com.CarRentals.filehandling.CarDetailsReadWriteFromFile;
import com.CarRentals.pojo.BookedCarDetails;
import com.CarRentals.pojo.CarDetails;

public class ViewCalFrame extends JFrame
{
	private static final long serialVersionUID = 1L;

	public ViewCalFrame()
	{
		super("Display All");
		String heading[]={"ID","Booking Date","Seaters","Income"};
		String data[][];
		CarDetails x = null;
		ArrayList<BookedCarDetails> list;
		try
		{
			list = BookedCarReadWrite.readDataFromFile();
			
			data = new String[list.size()][4];
			
			int r=0;
			for(BookedCarDetails re : list)
			{
				data[r][0]=re.getCarid();
				data[r][1]=re.getBookingdt();
				data[r][2]=re.getNoofseat();
				data[r][3]=re.getRate();
				r++;
			}
			Container con=getContentPane();
			con.setLayout(new BorderLayout());
			
			JTable datatable=new JTable(data, heading);
			JScrollPane jsp=new JScrollPane(datatable);
			
			con.add(new JLabel("All Car Details"),BorderLayout.NORTH);
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
