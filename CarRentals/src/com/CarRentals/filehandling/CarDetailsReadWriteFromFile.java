package com.CarRentals.filehandling;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.CarRentals.pojo.CarDetails;

	public class CarDetailsReadWriteFromFile {
	
		public static ArrayList<CarDetails> readDataFromFile()
		{
			ArrayList<CarDetails> list2;
			try
			{
			   FileInputStream fin=new FileInputStream("CarDetailsInfo.dat");// fileinput to retrieve data
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list2=(ArrayList<CarDetails>)oin.readObject();
			   
			   oin.close();
			   fin.close();
			}
			catch(Exception e)
			 {
				 list2=new ArrayList<CarDetails>();
			 }	
			return list2;
			
}
		public static void writeDatatoFile(ArrayList<CarDetails> wlist)
		{
			try	
			 {
			       FileOutputStream fout=new FileOutputStream("CarDetailsInfo.dat");
			       ObjectOutputStream oout=new ObjectOutputStream(fout);
			       oout.writeObject(wlist);
			       
			       oout.close();
			}catch(Exception e){System.out.println(e);}
		}
	}		
