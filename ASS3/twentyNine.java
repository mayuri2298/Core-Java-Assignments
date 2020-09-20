import java.util.Scanner;
class twentyNine{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter rows");
        int r=s.nextInt();
        int arr[][]=new int[r][];
        for(int i=0;i<arr.length;i++){
            int count=0;
            System.out.println("Enter number of cols");
            int c=s.nextInt();
            arr[i]=new int[c];
            for(int j=0;j<arr[i].length;j++)
            {
               arr[i][j]=s.nextInt();
            }
            
        }
        System.out.println("");
        for(int i=0;i<arr.length;i++){
            int counter=0;
            for(int j=0;j<arr[i].length;j++){
                
                if(arr[i][j]!=0){
                    counter++;
                }
                
            }
            System.out.println("Elements present at " + i + "th row is "+counter);
        }
    }
}