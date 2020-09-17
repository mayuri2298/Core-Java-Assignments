import java.util.Scanner;
class thirteen{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1=s.nextInt();
        System.out.println("Enter 2nd number");
        int num2=s.nextInt();
        System.out.println("Enter 3rd number");
        int num3=s.nextInt();

        int n=num1>num2?num1:num2;
        int n1=num3>n?num3:n;
        System.out.println("Greatest number is "+n1);
    }
}