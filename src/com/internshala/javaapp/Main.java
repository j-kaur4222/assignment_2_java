package com.internshala.javaapp;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your name:");
	String name= sc.nextLine();
	System.out.print("Enter your age:");
	int age=sc.nextInt();
	System.out.println("Enter your Blood Group:");
	String bloodgroup=sc.next();
	sc.close();
	String group;
	    if((age>=10)&&(age<15))
	    {
		    group="YELLOW";
	    }
	    else if((age>=15)&&(age<20))
	    {
		    group="BLUE";
	    }
	    else if(age>=20)
	    {
		    group="RED";
	    }
	    else
	    {
	    	group="NO GROUP";
	    }
	    System.out.println("-----------------------------");
	    System.out.println("Name: "+ name);
	    System.out.println("Age: "+ age);
	    System.out.println("Blood Group: "+ bloodgroup );
	    System.out.println("-----------------------------");
	    System.out.println("Your Group is: "+ group);
	    System.out.println("-----------------------------");
    }
}
