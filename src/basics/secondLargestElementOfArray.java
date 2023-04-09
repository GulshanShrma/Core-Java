package basics;

public class secondLargestElementOfArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,9,7,8,120,6,15,5,4,100};
		int max = 0;
		int secondMax=0;
		for(int x: arr) {
			if(x>=max) {
				secondMax=max;
				max=x;
			}
			else if(x<max && x>=secondMax) {
				secondMax=x;
			}
		}
		System.out.println("Second max element in arr is: "+secondMax);
	}

}
