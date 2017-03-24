package com.CarRentals.framedesign;

import java.util.ArrayList;

import com.CarRentals.filehandling.CarDetailsReadWriteFromFile;
import com.CarRentals.filehandling.CdataReadWriteFromFile;
import com.CarRentals.filehandling.EmployeeDetailsReadWriteFromFile;
import com.CarRentals.pojo.CarDetails;
import com.CarRentals.pojo.CustomerDetails;
import com.CarRentals.pojo.EmployeeDetails;



public class SearchCus 
{
	public static int searchId(String id)
	{
		ArrayList<CustomerDetails> list;
		int f = -1;
		try
		{
			list=CdataReadWriteFromFile.readDataFromFile();
			
			int p1 = 0;
			for(CustomerDetails robj : list)
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
}