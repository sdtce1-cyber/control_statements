package d10_task4;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = p.nextInt();
		boolean prime = true;
		for(int i=2; i<n; i++) {
			if(n%i ==0) {
				prime = false;
			break;
			}
		}
			if (prime) {
				System.out.println("Prime Number");
			} else {
				System.out.println("Not a prime number");
				
			}
	}
}