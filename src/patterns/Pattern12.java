package patterns;
import java.util.Scanner;

/*
	 1  6 11 16 21 
	 2  7 12 17 22 
	 3  8 13 18 23 
	 4  9 14 19 24 
	 5 10 15 20 25 
 */


public class Pattern12 {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++) {
			int temp=i;
			for(int j=1;j<=n;j++) {
				System.out.printf("%2d ",temp);
				temp+=5;
			}
			System.out.println();
		}
		
		s.close();
	}

}
