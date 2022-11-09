package leetCode.easy;

//  Remove Element
public class problem0027 {
	public static int removeElement(int[] nums, int val) {
		int index = 0;
	 	int lenNums = nums.length;
	 	for (int i=0;i<lenNums;i++) {
	 		if(nums[i]!=val) {
	 			nums[index]=nums[i];
	 			index++;
	 		} 
	 	}
        return index;
	}
}
