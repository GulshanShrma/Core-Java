package patterns;
import java.util.Scanner;

/*
 	12345
	12345
	12345
	12345
	12345
 */
public class Pattern03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
	}
		s.close();

}
}
