package com.CarRentals.framedesign;

import java.util.ArrayList;

import com.CarRentals.filehandling.EmployeeDetailsReadWriteFromFile;
import com.CarRentals.pojo.EmployeeDetails;


public class DeleteEmpInfo 
{
	public static void deleteInfoData(int index)
	{
		ArrayList<EmployeeDetails> list1;
		
		list1=EmployeeDetailsReadWriteFromFile.readDataFromFile();
		
		list1.remove(index);
		 
		EmployeeDetailsReadWriteFromFile.writeDatatoFile(list1);
	}
}