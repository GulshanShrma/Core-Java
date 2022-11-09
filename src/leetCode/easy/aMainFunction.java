package leetCode.easy;

public class aMainFunction {
/* a is just a prefix to keep this code at top
 * This function is modified as per the latest code I am working on.
 * This function is to have main function to call other problems
 */
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		int[] strs = {1,3,5,6}; 
		int[] strsb = {0,1,2,2,3,0,4,2}; 
		String strsa = "(]"; 
		String strss = "){"; 
		for (int i=0;i<strs.length;i++) 
			System.out.print(strs[i]);
		System.out.println();
		System.out.println(problem0058.lengthOfLastWord(strsa));
	}
}
	