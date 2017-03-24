package com.CarRentals.framedesign;

import java.util.ArrayList;

import com.CarRentals.filehandling.BookedCarReadWrite;
import com.CarRentals.filehandling.CarDetailsReadWriteFromFile;
import com.CarRentals.filehandling.CdataReadWriteFromFile;
import com.CarRentals.filehandling.EmployeeDetailsReadWriteFromFile;
import com.CarRentals.pojo.BookedCarDetails;
import com.CarRentals.pojo.CarDetails;
import com.CarRentals.pojo.CustomerDetails;
import com.CarRentals.pojo.EmployeeDetails;



public class SearchBookedCar 
{
	public static int searchId(String id)
	{
		ArrayList<BookedCarDetails> list;
		int f = -1;
		try
		{
			list=BookedCarReadWrite.readDataFromFile();
			
			int p1 = 0;
			for(BookedCarDetails robj : list)
			{
				if(id.equals(robj.getCarid()))
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
}