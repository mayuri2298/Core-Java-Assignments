package ass7;

public class FiftyFive {

	public static void main(String[] args) {
		String s="Good morning have a nice day";
		String ar[]=s.split(" ");
		int count=0;
		for(String m:ar) {
			count++;
		}
		System.out.println("Total words are "+count);

	}

}
