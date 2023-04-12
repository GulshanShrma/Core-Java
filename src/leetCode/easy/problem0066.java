package leetCode.easy;

// Plus One
public class problem0066 {
	public static int[] plusOne(int[] digits) {
	    int lengthInput = digits.length;
	    int powerGenerate=0;
	    long value=0; 
	    System.out.println(lengthInput);
	    for(int i=lengthInput-1;i>=0;i--) {
//	    	To generate integer value
	    	value= value +  digits[i]* (long)Math.pow(10, powerGenerate);
	    	powerGenerate++;
	    }
	    long result = value+1;
//	    System.out.println(result);
	    String resultAsString = String.valueOf(result);
	    int lengthOutput = resultAsString.length();
//	    System.out.println(lengthOutput);
	    int[] resultArray = new int[lengthOutput];
	    for(int i=0;i<lengthOutput;i++){
	    	resultArray[i]= Character.getNumericValue(resultAsString.charAt(i));
	    }
		return resultArray;
	}
}


