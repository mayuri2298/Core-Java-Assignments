import java.util.Scanner;
class nine{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter days");
        int days=s.nextInt();
        int year=days/365;
        int months=days/31;
        int week=(days%365)/7;
        System.out.println("years are "+year+" months are "+months+" weeks are "+week);
    }
}