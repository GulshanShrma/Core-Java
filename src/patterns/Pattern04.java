package patterns;
import java.util.Scanner;

/*
 	55555
	44444
	33333
	22222
	11111 
 */

public class Pattern04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		for (int i=n;i>=1;i--) {
			for (int j=1;j<=n;j++) {
				System.out.print(i);
			}
			System.out.println();
	}
		s.close();

}
}
