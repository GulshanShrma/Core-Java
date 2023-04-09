package basics;

public class maxElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,9,7,8,12,6,15,5,4,100};
		int max = 0;
		for(int x: arr) {
			if(x>=max) {
				max=x;
			}
		}
		System.out.println("Max element in arr is: "+max);
	}
}
