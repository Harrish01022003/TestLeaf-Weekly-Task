package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;
public class SetUniqueChar {

	public static void main(String[] args) {
		String cmp = "google";
		char[] charArray = cmp.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (Character ch : charArray) 
		{
			charSet.add(ch);
		}
		for (Character ch : charSet) 
		{
			if(!ch.equals(' '))
			{
				System.out.print(ch);
			}
		}
	}

}

