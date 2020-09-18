import java.util.Scanner;
class sixteen{
    public static void main(String args[]){
        int product=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int num=s.nextInt();
        for(int i=1;i<=10;i++)
        {
            product=num*i;
            System.out.println(product);
        }
    }
}