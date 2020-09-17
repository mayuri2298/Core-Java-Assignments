import java.util.Scanner;
class interest{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter principle");
        float principle=s.nextFloat();
        System.out.println("Enter rate");
        float rate=s.nextFloat();
        System.out.println("Enter time");
        float time=s.nextFloat();
        float si=(principle*rate*time)/100;
        System.out.println("Simple Interest = "+si);

    }
}