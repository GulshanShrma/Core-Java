package leetCode;

public class problem14 {

	@SuppressWarnings("unused")
	public static String longestCommonPrefix(String[] strs) {
		int lenStringList = strs.length;
		String prefix = strs[0];
		int subStringEnd = prefix.length();
		if(lenStringList==1) {
			return prefix;
		}
		else {
			main:
			for(int i=1 ; i<lenStringList; i++) {
				prefix=prefix.substring(0, subStringEnd);
				subStringEnd=0;
				int smallerOne=0;
				int lenCurrrentString = strs[i].length();
				int lenPrefix = prefix.length();
				if(lenPrefix<=lenCurrrentString) {
					smallerOne=lenPrefix;
				}
				else {
					smallerOne=lenCurrrentString;
				}
				inner:
				for(int j=0;j<smallerOne;j++) {
					if(strs[i].charAt(j)==prefix.charAt(j)) {
						subStringEnd++;
					}
					else if (j==0){
						return "";
					}
					else if(strs[i].charAt(j)!=prefix.charAt(j)) {
						break inner;
					}
				}
			}
		}
		
		prefix=prefix.substring(0, subStringEnd);
        return prefix;
    }
}
