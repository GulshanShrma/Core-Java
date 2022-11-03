package patterns;
import java.util.Scanner;

/*
  	 1  2  3  4  5 
	 6  7  8  9 10 
	11 12 13 14 15 
	16 17 18 19 20 
	21 22 23 24 25  
 */

public class Pattern06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int temp=1;
		for (int i=n;i>=1;i--) {
			for (int j=n;j>=1;j--) {
				System.out.printf("%2d ",temp++);
			}
			System.out.println();
	}
		s.close();

}
}
