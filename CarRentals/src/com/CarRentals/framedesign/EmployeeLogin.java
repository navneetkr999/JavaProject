package com.CarRentals.framedesign;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.CarRentals.filehandling.EmployeeDetailsReadWriteFromFile;
import com.CarRentals.pojo.EmployeeDetails;


public class EmployeeLogin extends JFrame
{
	private static final LayoutManager GridBagLayoutInfo = null;
	private static final LayoutManager GridBagLayout = null;
	private static final String title = null;
	private JLabel l5, l6, l7;
	private JTextField tusername;
	private JPasswordField p1;
	private JButton blogin,bcancel;
	
	public EmployeeLogin()
	{
		super("Employee Login");
		
		Container c2 = getContentPane();
		c2.setLayout(new GridLayout(12,2));
		
		Font f2 = new Font("segoe print",Font.BOLD,30);
		Font f = new Font("segoe script",Font.BOLD,20);
		
		l5 = new JLabel("UserID");
		l5.setFont(f);
		l5.setForeground(Color.DARK_GRAY);
		l6 = new JLabel("Password");
		l6.setFont(f);
		
		l7 = new JLabel("Employee Login");
		l7.setFont(f2);
		l7.setForeground(Color.CYAN);
		
		tusername = new JTextField(20);
		p1 = new JPasswordField(20);
		
		blogin = new JButton("Login");
		blogin.setBackground(Color.DARK_GRAY);
		blogin.setForeground(Color.WHITE);
		
		bcancel = new JButton("Cancel");
		bcancel.setBackground(Color.DARK_GRAY);
		bcancel.setForeground(Color.WHITE);
		
		
		c2.setBackground(Color.GRAY);
		c2.add(l7);
		c2.add(new JLabel(""));
		c2.add(l5);c2.add(tusername);
		c2.add(l6);
		c2.add(p1);
		c2.add(new JLabel(""));
		c2.add(blogin);
		c2.add(new JLabel(""));
		c2.add(bcancel);
		
	   	 setSize(450, 450);
		 setLocation(450,100);
		 setResizable(false);
		 //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		
		 blogin.addActionListener((e) ->
			{
			   loginCheck();
			}
		  );
		 
		 bcancel.addActionListener((e) ->
			{
			   new WelcomePage(title);
			}
		  );
	}

	public void loginCheck()
	{
		
		int loginIndex = searchId(tusername.getText().trim());
		
        if(loginIndex >= 0)
        {
        	
       	 ArrayList<EmployeeDetails> userlist = EmployeeDetailsReadWriteFromFile.readDataFromFile();
       	 if((p1.getText().trim()).equals(userlist.get(loginIndex).getPassword()))
       	 {
       		 //System.out.println("heyeyeyey");
       		 SwingUtilities.invokeLater(new Runnable()
             {

				public void run()
                 {
                     new EmployeeHome();
                 }
             });
       	 }
       	 else 
       		 JOptionPane.showMessageDialog(this, "Invalid password");
        }
        else
        {
           JOptionPane.showMessageDialog(this, "Invalid Id");
        }
	}
	public int searchId(String strId)
	{
		ArrayList<EmployeeDetails> cList;
		int f = -1;
		try
		{
			cList=EmployeeDetailsReadWriteFromFile.readDataFromFile();
			
			for(int p=0; p<cList.size(); p++)
			{
				if(strId.equals(cList.get(p).getId()))
				{
				   f = p;
				   break;
				}	
			}
			 
			return(f);
		}catch(Exception e)
		{
			System.out.println(e);
			return(-2);
		}
 	}
	public static void main(String[] args) 
	{
		new EmployeeLogin() ;

	}
}


