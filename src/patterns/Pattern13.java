package patterns;
import java.util.Scanner;

/*
	 1 10 11 20 21 
	 2  9 12 19 22 
	 3  8 13 18 23 
	 4  7 14 17 24 
 	 5  6 15 16 25 
 */

public class Pattern13 {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int add1=9,add2=1;
		for(int i=1;i<=n;i++) {
			int temp=i;
			for(int j=1;j<=n;j++) {
				if(j==1) {
					System.out.printf("%2d ",temp);
					temp+=add1;
				}
				else if (j%2==0) {
					System.out.printf("%2d ",temp);
					temp+=add2;
				}
				else {
					System.out.printf("%2d ",temp);
					temp+=add1;
				}
				
			}
			System.out.println();
			add1-=2;
			add2+=2;
		}
		
		s.close();
	}

}
