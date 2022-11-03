package patterns;
import java.util.Scanner;

/*
	1 1 1 2 1 3 
	2 1 2 2 2 3 
	3 1 3 2 3 3 
	4 1 4 2 4 3 
	5 1 5 2 5 3 
 */

public class Pattern11 {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(i+" "+j+" ");
			}
			System.out.println();
		}
		
		s.close();
	}

}
