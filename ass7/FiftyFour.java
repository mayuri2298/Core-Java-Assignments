package ass7;

import java.util.Scanner;

public class FiftyFour {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.next();
		String r="";
		
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			System.out.print(c);
		}

	}

}
