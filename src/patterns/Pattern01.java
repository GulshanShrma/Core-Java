package patterns;
import java.util.Scanner;

/*
	  *****
	  *****
	  *****
	  *****
	  *****
 */

public class Pattern01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		for (int i=1;i<=n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
	}
		s.close();

}
}
