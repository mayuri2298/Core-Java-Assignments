import java.util.Scanner;
class twenty_three{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter array elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=s.nextInt();
        }
        for(int b:a)
        {
            System.out.print(b);
        }
        System.out.println();
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }

    }
}