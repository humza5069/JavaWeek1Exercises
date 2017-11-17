
public class Offline {
	public static void main(String[] args) {
	System.out.println(doubleChar("The"));
	}
	//Given a string, return a string where 
	//for every char in the original, there are two chars.

	//doubleChar("The") → "TThhee"
	//doubleChar("AAbb") → "AAAAbbbb"
	//doubleChar("Hi-There") → "HHii--TThheerree"

	public static  String doubleChar(String input) {
		String tmp="";
		
		for (int i = 0; i < input.length(); i++){
		tmp += input.charAt(i);	
		tmp += input.charAt(i);	
		}
		
		return tmp;
		
		
}
}

