package patterns;
import java.util.*;

/*
	1 1 2 1 3 1 
	1 2 2 2 3 2 
	1 3 2 3 3 3 
	1 4 2 4 3 4 
	1 5 2 5 3 5 
*/
public class Pattern10 {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=3;j++) {
				System.out.print(j+" "+i+" ");
			}
			System.out.println();
		}
		
		s.close();
	}

}
