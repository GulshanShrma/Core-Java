package basics;

public class leftRotaingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,9,7,8,120,6,15,5,4,100};
		int temp = arr[0],length=arr.length;
		for(int i=0;i<length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[length-1]=temp;
		
		for(int x:arr) {
			System.out.print(x+",");
		}
	}

}
