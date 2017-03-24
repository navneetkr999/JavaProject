package com.CarRentals.filehandling;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.CarRentals.framedesign.CustomerDetailsFrame;
import com.CarRentals.framedesign.EmployeeDetailsFarme;
import com.CarRentals.pojo.EmployeeDetails;

public class EmployeeDetailsReadWriteFromFile {	

	public static ArrayList<EmployeeDetails> readDataFromFile()
	{
		ArrayList<EmployeeDetails> list3;
		try
		{
		   FileInputStream fin=new FileInputStream("EmployDetailsInfo.dat");// fileinput to retrieve data
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list3=(ArrayList<EmployeeDetails>)oin.readObject();
		   
		   oin.close();
		   fin.close();
		}	
		catch(Exception e)
		 {
			 list3=new ArrayList<EmployeeDetails>();
		 }	
		return list3;
	}
		public static void writeDatatoFile(ArrayList<EmployeeDetails> userlist)
		{
			try	
			 {
			       FileOutputStream fout=new FileOutputStream("EmployDetailsInfo.dat");
			       ObjectOutputStream oout=new ObjectOutputStream(fout);
			       oout.writeObject(userlist);
			       
			       oout.close();
			}catch(Exception e){System.out.println(e);}
		}
}
		

