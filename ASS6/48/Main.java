import java.util.Scanner;
abstract class Method{
    float a;
    float pi=3.14f;
    abstract void area();
    void show(){
        System.out.println("Area of circle is: "+a);
    }
}
abstract class Method1{
    int fa=1;
    abstract void fact();
    void display(){
        System.out.println("Factorial: "+fa);;
    }
}
class Circle extends Method{
    void area(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius");
        float r=s.nextFloat();
        a=2*pi*r;
    }
}
class Factorial extends Method1{
    void fact(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        
        for(int i=1;i<=num;i++){
            fa=fa*i;
        }
    }
}
class Main{
    public static void main(String args[]){
        Scanner ss=new Scanner(System.in);
        
        while(true){
            System.out.println("Enter your choice");
            int choice=ss.nextInt();

            switch (choice) {
            case 1:
                Circle c=new Circle();
                c.area();
                c.show();
                break;
            case 2:
                Factorial f=new Factorial();
                f.fact();
                f.display();
                break;
            }
                
        }
       
    }
}