package leetCode.easy;

public class problem0009 {
//	9. Palindrome Number
	 public boolean isPalindrome(int x) {
		 String sX = Integer.toString(x);
		 int sXLength = sX.length();
		 for(int i=0;i<sXLength/2;i++) {
			 int revChar = sXLength-i-1;
			 if(sX.charAt(i) !=   sX.charAt(revChar)) return false;
		 }
	     return true;   
	    }
}
