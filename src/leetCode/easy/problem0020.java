package leetCode.easy;

import java.util.Stack;

// Valid Parentheses
public class problem0020 {
	 public static boolean isValid (String s) {
	        int lenString = s.length();
	        Stack<Character> stStore = new Stack<Character>();
	        if(lenString%2!=0) {
	        	return false;
	        }
	        else {
	        	for(int i=0;i<lenString;i++) {
	        		int res = 0;
	        		char currentChar = s.charAt(i);
	        		if(currentChar==')' || currentChar==']' ||currentChar=='}') {
	        			if (stStore.empty()) {
	        	        	return false;
	        	        }
	        			char poppedChar = stStore.pop();
		        		res = Character.compare(currentChar, poppedChar);
	        		} else {
	        			stStore.push(currentChar);
	        			continue;
	        		}
	        		if (res == 1 || res == 2) {
	        	            continue;
	        	        }
	        	        else {
	        	            return false;
	        	        }
	        		
	        	}
	        }
	        if (!stStore.empty()) {
	        	return false;
	        }
	        return true;
	    }
}
