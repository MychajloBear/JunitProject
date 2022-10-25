package aaa;

import java.util.Scanner;

public class ThirdClass{

public static void main(String[] args) {
	System.out.println (showLength("100"));
	System.out.println (hasFancy("100fancy"));
	}
	
	static int showLength(String s)
	{
	return s.length();
	}

	static boolean hasFancy(String s)
	{
	return s.contains("fancy");
	}
	
}
