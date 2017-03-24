package com.CarRentals.framedesign;

import java.util.ArrayList;

import com.CarRentals.filehandling.EmployeeDetailsReadWriteFromFile;
import com.CarRentals.pojo.EmployeeDetails;



public class SearchEmp 
{
	public static int searchId(String id)
	{
		ArrayList<EmployeeDetails> list;
		int f = -1;
		try
		{
			list=EmployeeDetailsReadWriteFromFile.readDataFromFile();
			
			int p1 = 0;
			for(EmployeeDetails robj : list)
			{
				if(id.equals(robj.getId()))
				{
					f = p1;
					   break;
				}
				p1++;
			}
			
			/*
			Registration robj1;
			for(int p=0; p<list2.size(); p++)
			{
				robj1 = list2.get(p);
				
				if(id.equals(list2.get(p).getId()))
				{
				   f = p;
				   break;
				}	
			}
			 */
			return(f);
		}catch(Exception e)
		{
			System.out.println(e);
			return(-2);
		}
 	}
}