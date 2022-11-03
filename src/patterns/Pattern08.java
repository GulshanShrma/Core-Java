package patterns;
import java.util.Scanner;

/*
     2  4  6  8 10 
	12 14 16 18 20 
	22 24 26 28 30 
	32 34 36 38 40 
	42 44 46 48 50 
 */

public class Pattern08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int temp=2;
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
