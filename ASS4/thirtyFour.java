import java.util.Scanner;
class Circle{
    private float radius;
    private float area;
    void init(float radius){
        this.radius=radius;
    }
    void calArea()
    {
        this.area=2*3.14f*this.radius;
    }
    void display()
    {
        System.out.println(area);
    }
}
class thirtyFour{
    public static void main(String args[]){
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius");
        float r=s.nextFloat();
        Circle c1=new Circle();
        c1.init(r);
        c1.calArea();
        c1.display();
    }
}