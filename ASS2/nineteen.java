import java.util.Scanner;
class nineteen{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int num=s.nextInt();
        for(int i=12;i<=num;i=i+10)
        {
            System.out.println(i);
        }
    }
}