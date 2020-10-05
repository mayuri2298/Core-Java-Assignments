package ass7;

public class FiftySix {

	public static void main(String[] args) {
		String s="good morning have a nice day";
		String ar[]=s.split(" ");
		for(int i=0;i<ar.length;i++) {
			String s1=ar[i].substring(0,1).toUpperCase()+ar[i].substring(1);
			System.out.print(" "+s1);
		}
		
		
		
	}

}
