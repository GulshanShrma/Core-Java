package patterns;
import java.util.Scanner;

/*
 	11111
	22222
	33333
	44444
	55555
 */

public class Pattern02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		for (int i=1;i<=n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(i);
			}
			System.out.println();
	}
		s.close();

}
}
