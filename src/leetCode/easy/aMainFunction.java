package leetCode.easy;

public class aMainFunction {
/* a is just a prefix to keep this code at top
 * This function is modified as per the latest code I am working on.
 * This function is to have main function to call other problems
 */
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		String strs = "b a "; 
		int[] strsb = {0,1,2,2,3,0,4,2}; 
		String strsa = "Hello World";
		String strsd = "day";
		String strss = "   fly me   to   the moon  "; 
//		for (int i=0;i<strs.length;i++) 
//			System.out.print(strs[i]);
		System.out.println(strsd);
		System.out.println(strsd.length());
		System.out.println();
		System.out.println(problem0058.lengthOfLastWord(strsd));
	}
}
	