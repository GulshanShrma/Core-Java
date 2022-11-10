package leetCode.easy;

// Length of Last Word
public class problem0058 {
	public static int lengthOfLastWord(String s) {
		int lenOfString=s.length();
		int caseNo;//There are 2 cases - string ending with space or not.
		int firstSpaceIndex=0,lastSpaceIndex=0;
		int lastChar = s.charAt(lenOfString-1);
		if (lastChar==32) {
			caseNo=1; //Ending with space.
			lastSpaceIndex=lenOfString-2;
		} else {
			caseNo=2; //Ending with character.
			lastSpaceIndex=lenOfString-1;
		}
		for(int i=lenOfString-2;i>=0;i--) {
			if(32 == s.charAt(i)) {
				if(caseNo==2) {
					firstSpaceIndex=i;
					break;
				}
					
				if(caseNo==1) {
					if(s.charAt(i+1)!=32) {
						firstSpaceIndex=i;
						break;
					} else {
						lastSpaceIndex=i-1;
					}	
				}
			}
		}
		if(lastSpaceIndex==firstSpaceIndex) {
			return 1; // For case where last word is single character 
		}else if(firstSpaceIndex==0 && s.charAt(firstSpaceIndex)!= ' ') {
			lastSpaceIndex++; // String with single word but starts with space
		}
        return lastSpaceIndex-firstSpaceIndex;
    }
}

