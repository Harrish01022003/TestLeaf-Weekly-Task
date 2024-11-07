package week3.day1;

public class Occurance {

	public static void main(String[] args) {
		String companyName = "Test Leaf";
		char[] charArray = companyName.toCharArray();
		int count = 0;
		for(int i = 0;i<=charArray.length-1;i++) {
			if(charArray[i]=='e') {
				count = count + 1;
			}
		}
		System.out.println(count);
	}

}
