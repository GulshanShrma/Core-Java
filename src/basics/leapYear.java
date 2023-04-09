package basics;

import java.util.Scanner;
public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = s.nextInt();
		if(year%4 == 0) {
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("It is not a leap year");
		}
		s.close();
	}

}
