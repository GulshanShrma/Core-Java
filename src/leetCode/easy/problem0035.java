package leetCode.easy;

// Search Insert Position
public class problem0035 {
	public static int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=0;i<nums.length;i++) {
        	if(nums[i]<target) {
        		index++;
        	} else if(nums[i]==target) {
        		return i;
        	} else {
        		break;
        	}
        }
        return index;
    }
}
