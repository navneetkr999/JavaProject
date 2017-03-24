package com.CarRentals.framedesign;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.CarRentals.filehandling.BookedCarReadWrite;
import com.CarRentals.filehandling.CarDetailsReadWriteFromFile;
import com.CarRentals.filehandling.CdataReadWriteFromFile;
import com.CarRentals.filehandling.EmployeeDetailsReadWriteFromFile;
import com.CarRentals.pojo.BookedCarDetails;
import com.CarRentals.pojo.CarDetails;
import com.CarRentals.pojo.CustomerDetails;
import com.CarRentals.pojo.EmployeeDetails;



public class SearchCar 
{
	public static int searchId(String id)
	{
		ArrayList<CarDetails> list;
		int f = -1;
		try
		{
			list=CarDetailsReadWriteFromFile.readDataFromFile();
			
			int p1 = 0;
			for(CarDetails robj : list)
			{
				if(id.equals(robj.getId()))
				{
					f = p1;
					   break;
				}
				p1++;
			}
			
			return(f);
		}catch(Exception e)
		{
			System.out.println(e);
			return(-2);
		}
 	}
	
	public static ArrayList<CarDetails> searchAvailableCar(String noofseat)
	{
		
		ArrayList<CarDetails> list;
		ArrayList<CarDetails> carlist = new ArrayList<CarDetails>();
        boolean flag = true;
		int f = -1;
	    CarDetails c =null;
		try
		{
			list=CarDetailsReadWriteFromFile.readDataFromFile();
			
		      for(int i = 0; i< list.size();i++)
		      {
		    	     if(noofseat.equals(list.get(i).getSeaters()))
		    	     {
		    	    	 carlist.add(list.get(i));
		    	     }
		      }
		      
		   			
			return(carlist);
			}catch(Exception e)
		{
			System.out.println(e);
			return(carlist);
		}
 	}
	
	public static ArrayList<CarDetails> searchAvalCar(ArrayList<CarDetails> carlist, String bookingdt)
	{
		//System.out.println(carlist.size()+"hjgjkjh");
		ArrayList<CustomerDetails> list;
		ArrayList<CarDetails> clist1 = new ArrayList<CarDetails>();
	    boolean flag;
	
	    CarDetails c =null;
		try
		{
			list=CdataReadWriteFromFile.readDataFromFile();
			for(int j =0 ; j< carlist.size();j++)
			{
				String carid = carlist.get(j).getId();
				flag = true;
				
				 for(int i = 0; i< list.size();i++)
			     {
					 if(carid.equals(list.get(i).getCarid()) && bookingdt.equals(list.get(i).getDate()))
					 {
						 flag = false;
					 }
			     }
				 
				 if(flag)
				 {
					 clist1.add(carlist.get(j));
				 }
				
			}
		     		   			
			return(clist1);
			}catch(Exception e)
		{
			System.out.println(e);
			return(clist1);
		}
 	}
	
	
	
	
	
}