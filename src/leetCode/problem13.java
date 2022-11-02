package leetCode;

public class problem13 {
	public static int romanToInt(String s) {
		int res = 0;
		int sLen = s.length();
		for (int i = 0; i < sLen; i++) {
			if (s.charAt(i) == 'M') {
				if (i != 0 && s.charAt(i - 1) == 'C')
					continue;
				else
					res += 1000;
			} else if (s.charAt(i) == 'D') {
				if (i != 0 && s.charAt(i - 1) == 'C')
					continue;
				else
					res += 500;
			} else if (s.charAt(i) == 'C') {
				if (i != sLen - 1 && s.charAt(i + 1) == 'M') {
					res += 900;
				} else if (i != sLen - 1 && s.charAt(i + 1) == 'D') {
					res += 400;
				} else if (i != 0 && s.charAt(i - 1) == 'X')
					continue;
				else
					res += 100;
			} else if (s.charAt(i) == 'L') {
				if (i != 0 && s.charAt(i - 1) == 'X')
					continue;
				else
					res += 50;
			} else if (s.charAt(i) == 'X') {
				if (i != sLen - 1 && s.charAt(i + 1) == 'C') {
					res += 90;
				} else if (i != sLen - 1 && s.charAt(i + 1) == 'L') {
					res += 40;
				} else if (i != 0 && s.charAt(i - 1) == 'I')
					continue;
				else
					res += 10;
			} else if (s.charAt(i) == 'V') {
				if (i != 0 && s.charAt(i - 1) == 'I')
					continue;
				else
					res += 5;
			} else if (s.charAt(i) == 'I') {
				if (i != sLen - 1 && s.charAt(i + 1) == 'X') {
					res += 9;
				} else if (i != sLen - 1 && s.charAt(i + 1) == 'V') {
					res += 4;
				} else
					res += 1;
			}

		}
		return res;
	}
}
