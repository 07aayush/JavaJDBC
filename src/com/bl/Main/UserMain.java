package com.bl.Main;


import java.util.Scanner;

import com.bl.Model.*;
import com.bl.Service.UserService;

public class UserMain {

	public static void main(String[] args) throws ClassNotFoundException {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		String Name;
		String Email;
		String Password;
		String  MobileNumber;
		UserService service=new UserService();
		if(service.getConn())
		{
		int ch1 =0;
		while(ch1!=2)
		{
			System.out.println("Press 1 to add Student");
			System.out.println("pres 2 to login");
			ch1 = sc2.nextInt();

			switch (ch1)
			{
			
			case 1: System.out.println("adding student...! ");
			UserPojo up = new UserPojo();
			System.out.println("enter name");
			Name =sc2.next();
			up.setName(Name);
			System.out.println("enter email");
			Email =sc2.next();
			up.setEmail(Email);
			System.out.println("enter Password");
			Password =sc2.next();
			up.setPassword(Password);
			System.out.println("enter MobileNumber");
			MobileNumber=sc2.next();
			up.setMobileNumber(MobileNumber);
			System.out.println("name = "+Name+" email = "+Email+" Password = "+Password+" MobileNumber = "+MobileNumber);
			System.out.println("");
			service.insert(up);
			
			break;
		
			
			case 2: System.out.println("please enter login details");
					System.out.println("enter email id");
					Email = sc2.next();
					System.out.println("enter your password");
					Password = sc2.next();
					boolean check=service.verifyUser(Email,Password);
					if(check)
					{
						System.out.println("login successfull..!");
					}
					else
						System.out.println("invalid user");
			}
		}
	}
		else
		{
			System.out.println("not connected");
			
		}
		}
}



