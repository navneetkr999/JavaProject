package com.CarRentals.framedesign;

import java.awt.BorderLayout;
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.CarRentals.filehandling.CarDetailsReadWriteFromFile;
import com.CarRentals.pojo.CarDetails;

public class ViewAvailableCarFrame extends JFrame
{

public ViewAvailableCarFrame(ArrayList<CarDetails> carlist)
{
	super("Available Car");
	String heading[]={"ID","Brand","ModelName","Seaters","Rate","Date","Time"};
	String data[][];
	ArrayList<CarDetails> list;
	try
	{
		list = CarDetailsReadWriteFromFile.readDataFromFile();
		
		data = new String[list.size()][7];
		
		int r=0;
		for(CarDetails re:carlist)
		{
		
			data[r][0]=re.getId();
			data[r][1]=re.getBrand();
			data[r][2]=re.getModelname();
			data[r][3]=re.getSeaters();
			data[r][4]=re.getRate();
			data[r][5]=re.getDate();
			data[r][6]=re.getTime();
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
