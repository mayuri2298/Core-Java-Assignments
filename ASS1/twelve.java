import java.util.Scanner;
class twelve{
    public static void main(String args[]){
        double hra,da;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter basic salary");
        double sal=s.nextDouble();
        if(sal<10000)
        {
            hra=sal*0.1;
            da=sal*0.9;
        }
        else
        {
            hra=2000;
            da=sal*9.8;
        }
        double gross_sal=sal+da+hra;
        System.out.println("Gross salary is "+gross_sal);
    }
}