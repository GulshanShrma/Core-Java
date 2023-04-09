package basics;

public class usernameDomain {

	public static void main(String args[]) {
		String str1 = "programmer@gmail.com";
		System.out.print("Whether it is gmail or not: ");
		Boolean matchFlag = (str1.matches("\\w*@gmail.*"));
		System.out.println(matchFlag);
		
		System.out.println("\nSeparating username and domain");
		if(matchFlag) {
			int end = str1.indexOf("@");
			System.out.println("Username: "+str1.substring(0, end));
			System.out.println("Domain: "+ str1.substring(end+1));
		}
	}

}
