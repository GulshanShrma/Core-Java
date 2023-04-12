package leetCode.easy;

public class aMainFunction {
/* a is just a prefix to keep this code at top
 * This function is modified as per the latest code I am working on.
 * This function is to have main function to call other problems
 */
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		int[] strs = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6}; 
		int[] strsb = {1,2,3}; 
		int[] strsa = {4,3,2,1};
		String strsd = "day";
		String strss = "   fly me   to   the moon  "; 
//		for (int i=0;i<strs.length;i++) 
//			System.out.print(strs[i]);
//		System.out.println(strsd);
//		System.out.println(strsd.length());
//		System.out.println();
//		System.out.println(problem0066.plusOne(strsb));
		int[] res = problem0066.plusOne(strs);
		for (int i=0;i<res.length;i++) 
			System.out.print(res[i]+" ");
	}
}
	