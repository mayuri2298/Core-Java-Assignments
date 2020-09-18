import java.util.Scanner;
class twenty_four{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int arr[]=new int [] {1, 2, 3, 4, 5};  
        System.out.println("Enter element");
        int num=s.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(num==arr[i])
            {
                System.out.println("Element present at index "+i);
            }
        }
    }
}