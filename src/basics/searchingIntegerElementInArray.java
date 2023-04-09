package basics;

import java.util.Scanner;

public class searchingIntegerElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,9,7,8,12,6,15,5,4,10};
		System.out.println("Enter element to search: ");
		Scanner scan = new Scanner(System.in);
		int toSearch = scan.nextInt();
		boolean flag = true;
		scan.close();
		for(int x: arr) {
			if(x==toSearch) {
				System.out.println("Element is present");
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Element is not present");
		}

	}

}
