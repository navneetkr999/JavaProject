package com.CarRentals.filehandling;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.CarRentals.pojo.CustomerDetails;


public class CdataReadWriteFromFile {
	public static ArrayList<CustomerDetails> readDataFromFile()
	{
		ArrayList<CustomerDetails> list1;
		try
		{
		   FileInputStream fin=new FileInputStream("CustomerDetailsInfo.dat");// fileinput to retrieve data
		   ObjectInputStream oin=new ObjectInputStream(fin);
		   list1=(ArrayList<CustomerDetails>)oin.readObject();
		   
		   oin.close();
		   fin.close();
		}
		catch(Exception e)
		 {
			 list1=new ArrayList<CustomerDetails>();
		 }
		return list1;
}
	public static void writeDatatoFile(ArrayList<CustomerDetails> wlist)
	{
		try	
		 {
		       FileOutputStream fout=new FileOutputStream("CustomerDetailsInfo.dat");
		       ObjectOutputStream oout=new ObjectOutputStream(fout);
		       oout.writeObject(wlist);
		       
		       oout.close();
		}catch(Exception e){System.out.println(e);}
	}
}	
