package basics;

public class regularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 10;
		String binary = Integer.toBinaryString(number);
		binary = "11010101100";
		System.out.println(binary);
		System.out.println(binary.matches("[01]*"));
		
		String hex = Integer.toHexString(number);
		hex = "0125478f";
		System.out.println(hex);
		System.out.println(hex.matches("[0-9a-fA-F]*"));
		
		System.out.println("\nFor Date\n");
		String Date = "32/19/2000";
		System.out.println(Date);
		System.out.println(Date.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));

	}

}
