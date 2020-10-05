package ass7;

import java.util.Arrays;
import java.util.Scanner;
public class FiftyTwo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int vowels=0;
		System.out.println("Enter name");
		String str=s.next();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				vowels++;
			}
		}
		System.out.println("Vowels present in string "+vowels);
		

	}

}
