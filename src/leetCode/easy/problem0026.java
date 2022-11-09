package leetCode.easy;

//  Remove Duplicates from Sorted Array
public class problem0026 {
	 public static int removeDuplicates(int[] nums) {
		 	int index =1;  // As it is sorted so no need to update first index i.e. 0
		 	int lenNums = nums.length;
		 	for (int i=1;i<lenNums;i++) {
		 		if(nums[i]>nums[index-1]) {
		 			nums[index]=nums[i];
		 			index++;
		 		}
		 	}	
	        return index;
	    }
}
