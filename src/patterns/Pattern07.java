package patterns;
import java.util.Scanner;

/*
  	 1  3  5  7  9 
	11 13 15 17 19 
	21 23 25 27 29 
	31 33 35 37 39 
	41 43 45 47 49 
 */

public class Pattern07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int temp=1;
		for (int i=n;i>=1;i--) {
			for (int j=n;j>=1;j--) {
				System.out.printf("%2d ",temp);
				temp+=2;
			}
			System.out.println();
	}
		s.close();

}
}
