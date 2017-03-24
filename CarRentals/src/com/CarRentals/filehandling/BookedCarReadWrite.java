package com.CarRentals.filehandling;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.CarRentals.pojo.BookedCarDetails;

	public class BookedCarReadWrite {
	
		public static ArrayList<BookedCarDetails> readDataFromFile()
		{
			ArrayList<BookedCarDetails> list2;
			try
			{
			   FileInputStream fin=new FileInputStream("BookedCarDetailsInfo.dat");// fileinput to retrieve data
			   ObjectInputStream oin=new ObjectInputStream(fin);
			   list2=(ArrayList<BookedCarDetails>)oin.readObject();
			   
			   oin.close();
			   fin.close();
			}
			catch(Exception e)
			 {
				 list2=new ArrayList<BookedCarDetails>();
			 }	
			return list2;
			
}
		public static void writeDatatoFile(ArrayList<BookedCarDetails> wlist)
		{
			try	
			 {
			       FileOutputStream fout=new FileOutputStream("BookedCarDetailsInfo.dat");
			       ObjectOutputStream oout=new ObjectOutputStream(fout);
			       oout.writeObject(wlist);
			       
			       oout.close();
			}catch(Exception e){System.out.println(e);}
		}
	}		

