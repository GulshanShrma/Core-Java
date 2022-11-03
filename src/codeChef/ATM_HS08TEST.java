package codeChef;
import java.util.Scanner;

public class ATM_HS08TEST {
	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		float y = s.nextFloat();
		s.close(); 
		System.out.println(operation(x,y));
		
	}
	
	static float operation(int a, float b) {
		float out=0;
		//float bc=0.5f;
		if (a>b) out=b;
		else if (a%5!=0) out =b;
		else out= (b - a - 0.5f);
		return out;
	}
}
