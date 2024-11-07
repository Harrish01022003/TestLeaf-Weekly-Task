package week3.day1;

public class Reverse {

	public static void main(String[] args) {
		String movieName = "GOAT";
		char[] charArray = movieName.toCharArray();
		
		for(int i = charArray.length-1;i>=0;i--) {
			System.out.print(charArray[i]);
		}

	}

}
