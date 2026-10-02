package d10_task5;

import java.util.Scanner;

public class Mark {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter mark1");
		int mark1= s.nextInt();
		System.out.println("Enter mark2");
		int mark2 = s.nextInt();
		System.out.println("Enter mark3");
		int mark3 = s.nextInt();
		System.out.println("Enter mark4");
		int mark4 = s.nextInt();
		System.out.println("Enter mark5");
		int mark5 = s.nextInt();
		int Total = mark1+mark2+mark3+mark4+mark5;
		System.out.println("Total mark is "+ Total);
	    int average = Total/5;
	    System.out.println("Average mark is "+ average);
	    if (average>=90) {
	    	System.out.println("A Grade");	
	    } else if (average>=75) {
	    	System.out.println("B Grade");
	    } else if (average>=50) {
	    	System.out.println("C Grade");	
	    } else {
	    	System.out.println("Fail");}
}}
