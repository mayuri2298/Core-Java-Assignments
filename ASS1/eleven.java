import java.util.Scanner;
class swapTwoNum{
    public static void main(String args[]){
        int temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st num");
        int num1=s.nextInt();

        System.out.println("Enter 2nd num");
        int num2=s.nextInt();

        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After swapping");
        System.out.println(num1);
        System.out.println(num2);
        
    }
}