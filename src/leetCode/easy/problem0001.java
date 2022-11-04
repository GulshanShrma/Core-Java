package leetCode.easy;

public class problem0001 {
	 public int[] twoSum(int[] nums, int target) {
//	  	two numbers add up to target.
//	  	exactly one solution
	        int result[] = {0,0};
	        int numLength = nums.length;
	        for(int i=0;i<numLength;i++) {
	        	for (int j=i+1;j<numLength;j++) {
	        		if(nums[i]+nums[j]==target) {
	        			result[0]=i;
	        			result[1]=j;
	        			break;
	        		}
	        	}
	        }
	        return result;
	    }
}
