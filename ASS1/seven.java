import java.util.Scanner;
class seven{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter marks of five subjects");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();
        int e=s.nextInt();
        float sum=(float)(a+b+c+d+e);
        float per=sum/500*100;
        System.out.println(per);

    }
}