package leetCode.easy;

public class aMainFunction {
/* a is just a prefix to keep this code at top
 * This function is modified as per the latest code I am working on.
 * This function is to have main function to call other problems
 */
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		int[] strs = {1,1,2}; 
		int[] strsb = {0,0,1,1,1,2,2,3,3,4}; 
		String strsa = "(]"; 
		String strss = "){"; 
		for (int i:strs)
			System.out.print(strs[i]);
		System.out.println();
		System.out.println(problem0026.removeDuplicates(strsb));
		
	}

}
	