import java.util.Scanner;
class fourteen{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter year");
        int year=s.nextInt();
        if(year%4==0)
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not leap year");
        }
    }
}