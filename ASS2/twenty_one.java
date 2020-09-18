import java.util.Scanner;
class twenty_one{
    public static void main(String args[]){
        int sum=0;
        Scanner s=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<10;i++)
        {   
            System.out.println("Enter array element at index "+i);
            arr[i]=s.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum is "+sum);
    }
}