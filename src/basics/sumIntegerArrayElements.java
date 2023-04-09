package basics;

public class sumIntegerArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,9,7,8,12,6,15,5,4,10};
		int sum=0;
		for( int x: arr) {
			sum+=x;
		}
		System.out.println("Sum of Array is: "+sum);

	}

}
