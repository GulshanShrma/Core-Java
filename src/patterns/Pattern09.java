package patterns;
import java.util.*;

/*
     1  2  3  4  5 
	 2  4  6  8 10 
	 3  6  9 12 15 
	 4  8 12 16 20 
	 5 10 15 20 25 
 */

public class Pattern09 {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			int temp = i;
			for(int j=1;j<=n;j++) {
				System.out.printf("%2d ",temp);
				temp+=i;
			}
			System.out.println();
		}
		
		s.close();
	}

}
