import java.util.Scanner;
class twenty{
    public static void main(String args[]){
        int flag,k;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1=s.nextInt();
        System.out.println("Enter 2nd number");
        int num2=s.nextInt();
        for(int i=num1;i<=num2;i++)
        {
            flag=1;
            for(int j=2;j<=i/2;j++)
            {
                k=i%j;
                if(k==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println(i);
            }
            
        }
    
    }
   
}