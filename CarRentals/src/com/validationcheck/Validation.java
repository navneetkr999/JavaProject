package com.validationcheck;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.CarRentals.framedesign.*;

public class Validation {
	//private static Scanner sc = new Scanner(System.in);
	
    static boolean nameCheck(String name)
    {
    	String namepattern = "^[a-zA-Z]{3,15}$";
    	
    	Scanner sc1 = new Scanner(name);
    	
    	String match = sc1.findInLine(namepattern);
    	
    	if (match == null)
    	{
    		JOptionPane.showMessageDialog(null, "Invalid Name..Please Enter Another Name");
		    
    		return false;
    	}
    	else
    		return true;
    }
    
    static boolean emilcheck(String emailid)
    {
    	String emailpattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"; 
    			//"^(\\w)+@(\\w+\\.)(\\w+\\.)?[A-Za-z]+$";
    	
    	
    	Scanner sc2 = new Scanner(emailid);
    	//String match2;
    	
    	String match1 = sc2.findInLine(emailpattern);
    	
    	if (match1 == null)
    	{
    
       		
       		JOptionPane.showMessageDialog(null, "Invalid EmailId..");
		       //txt.setText("");
		      // temailid.setBackground(Color.RED);
		       return false;
    	}
		       
		else
			return true;
    }
    
    static boolean mobilenoCheck(String mobno)
    {
    	String phonePattern = "^[0-9]{10}$";
    	
    	Scanner sc3 = new Scanner(mobno);
    	
    	String match2 = sc3.findInLine(phonePattern);
    	
    	if (match2 == null)
    	{
    		JOptionPane.showMessageDialog(null, "Invalid mobile Number..");
    		return false;
    	}
    	
    	else
    		return true;
    }
   
    	
  //  }
    static boolean passwordcheck(String password)
    {
    	String passwordpattern = "^[_A-Za-z0-9-\\+]{5,9}$";
    		
    	
    	Scanner sc3 = new Scanner(password);
    	
    	String match2 = sc3.findInLine(password);
    	
    	if (match2 == null)
    	{
    		JOptionPane.showMessageDialog(null, "Invalid password");
    		return false;
    	}
    	
    	else
    		return true;
    }

    public boolean dataValidation(String Cname,String Cmail,String Cmobno,String Cpassword)
	   {	
 	
		   boolean namevalidation =  nameCheck(Cname);
		   boolean mobnovalidation = mobilenoCheck(Cmobno);
		  // boolean aadharvalidation = aadharcheck(Adhar);
		   boolean passwordvalidation = passwordcheck(Cpassword);
		   boolean emailvalidation = emilcheck(Cmail);
		   
		   if (namevalidation && emailvalidation && mobnovalidation && passwordvalidation)
			   return true;
		       else if(namevalidation && emailvalidation && mobnovalidation)
		   {
			   return true;
		   }
		   
		   return false;
	   }
		
	}

