package basics;

public class radix {
	public static void main(String atgs[]) {
		String number = "";
		if(number.matches("[01]+")) {
			System.out.println("It is a binary or octal or decimal or hexadecimal number");
		}
		else if (number.matches("[0-7]+")) {
			System.out.println("It is an octal or decimal or hexadecimal number");
		}
		else if (number.matches("\\d+")) {
			System.out.println("It is a decimal or hexadecimal number");
		}
		else if (number.matches("[0-9A-Fa-f]+")) {
			System.out.println("It is a hexadecimal number");
		}
		else {
			System.out.println("Invalid number");
		}
	}

}
