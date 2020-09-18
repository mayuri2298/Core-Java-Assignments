import java.util.Scanner;
class eighteen{
    public static void main(String args[]){
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int num=s.nextInt();
        int n=num/2;
        int flag=1;
        for(int i=2;i<=n;i++){
            a=num%i;
            if(a==0)
            {
                System.out.println("not prime");
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("prime");
        }

    }
}