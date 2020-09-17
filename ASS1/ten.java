import java.util.Scanner;
class ten{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter temperature in fahrnite");
        float fahr=s.nextFloat();
        float temp=5*(fahr-32)/9;
        System.out.println("Temperature in celcius is "+temp);
    }
}