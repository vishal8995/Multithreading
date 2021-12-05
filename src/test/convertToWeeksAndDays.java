package test;

import java.util.Scanner;

public class convertToWeeksAndDays {

	/*
	 * If 
	 * n= 7, 1 week 
	 * n= 3/0, 3/0 days 
	 * n= 1, 1 day 
	 * n= 8, 1 week + 1 day 
	 * n= 14, 2 weeks
	 * n= 32, 4 weeks + 4 days
	 */
	
	public static void main(String[] args) {
		System.out.println("Enter the number of days !!");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		calculateValue(input);
	}

	private static void calculateValue(String input) {
		
		int n = Integer.parseInt(input);
		if (n == 7)
			System.out.println("1 week");
		else if (n >= 0 && n < 7) {
			if (n==1)
				System.out.println("1 day");
			else
				System.out.println(n+" days");
		}
		else if (n > 7) {
			int x = n % 7;
			int y = n / 7;
			
			if (x == 0) 
				System.out.println(y+" weeks");
			else if (x == 1 && y == 1)
				System.out.println("1 week + 1 day");
			else
				System.out.println(y+" weeks + "+x+" days");
		}
		else {
			if (n < 0)
				System.out.println("Days can't be negative !!");
			else
				System.out.println("Invalid Input !!");
		}
	}
}
