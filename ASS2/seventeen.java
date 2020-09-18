import java.util.Scanner;
class seventeen{
    public static void main(String args[]){
    int rem,rev=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number");
    int num=s.nextInt();
    while(num>0)
    {
        rem=num%10;
        rev=rev*10+rem;
        num=num/10;
    }
    System.out.println(rev);
    }
    
}