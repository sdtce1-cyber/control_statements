package d10_task1;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = a.nextInt();
		if (age>=18) {
			System.out.println("person is Eligible to vote");
		} else {
			System.out.println("person is Not eligible to vote");
		}

	}

}
