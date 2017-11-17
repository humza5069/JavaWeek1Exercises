public class Boardexample {

	public static void main(String[] args) {
		System.out.println(findLastWord("doggoesbark"));
	}
	

public static String findLastWord(String input) {
	int goesIndex = input.indexOf("goes")+4;
	String subStr = input.substring(goesIndex,input.length());
	return subStr;
}
}

// Given a string, return a string where for every char in the original, there are two chars.

//doubleChar("The") → "TThhee"
//doubleChar("AAbb") → "AAAAbbbb"
//doubleChar("Hi-There") → "HHii--TThheerree"
