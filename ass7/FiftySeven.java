package ass7;

public class FiftySeven {

	public static void main(String[] args) {
		String s="Good morning have a nice day";
		System.out.println(s);
		String ar[]=s.split(" ");
		
		for(int i=0;i<ar.length;i++) {
			for(int j=ar[i].length()-1;j>=0;j--) {
				System.out.print(""+ar[i].charAt(j));
			}
			System.out.print(" ");
		}

	}

}
