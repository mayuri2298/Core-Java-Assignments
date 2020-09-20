import java.util.Scanner;
class twentySeven{
    public static void main(String args[]){
        int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rows");
        int r=s.nextInt();
        int arr[][]=new int[r][];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter columns for"+i+"th row");
            int c=s.nextInt();
            arr[i]=new int[c];
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Enter element");
                arr[i][j]=s.nextInt();
            }
        }
        for(int a[]:arr){
            for(int b:a){
                System.out.print(b+" ");
            }
            System.out.println("");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum=sum+arr[i][j];
            }
        }
        System.out.println(sum);
    }

}