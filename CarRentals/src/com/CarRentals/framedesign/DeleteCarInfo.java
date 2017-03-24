package com.CarRentals.framedesign;

import java.util.ArrayList;

import com.CarRentals.filehandling.CarDetailsReadWriteFromFile;
import com.CarRentals.filehandling.EmployeeDetailsReadWriteFromFile;
import com.CarRentals.pojo.CarDetails;
import com.CarRentals.pojo.EmployeeDetails;


public class DeleteCarInfo 
{
	public static void deleteInfoData(int index)
	{
		ArrayList<CarDetails> list1;
		
		list1=CarDetailsReadWriteFromFile.readDataFromFile();
		
		list1.remove(index);
		 
		CarDetailsReadWriteFromFile.writeDatatoFile(list1);
	}
}