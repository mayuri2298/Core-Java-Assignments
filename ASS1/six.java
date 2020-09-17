import java.util.Scanner;
class circumference{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius");
        float rad=s.nextFloat();
        float circum=(float)(2*3.14*rad);
        System.out.println(circum);
    }
}