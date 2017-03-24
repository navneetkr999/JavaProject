package com.CarRentals.framedesign;

import java.util.ArrayList;

import com.CarRentals.filehandling.CdataReadWriteFromFile;
import com.CarRentals.filehandling.EmployeeDetailsReadWriteFromFile;
import com.CarRentals.pojo.CustomerDetails;
import com.CarRentals.pojo.EmployeeDetails;


public class DeleteCusInfo 
{
	public static void deleteInfoData(int index)
	{
		ArrayList<CustomerDetails> list1;
		
		list1=CdataReadWriteFromFile.readDataFromFile();
		
		list1.remove(index);
		 
		CdataReadWriteFromFile.writeDatatoFile(list1);
	}
}