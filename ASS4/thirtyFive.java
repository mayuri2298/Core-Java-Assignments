import java.lang.Math;
class MathOperation{
    static int add(int i,int j){
        return i+j;
    }
    static int subtract(int a,int b){
        return a-b;
    }
    static int product(int x,int y){
        return x*y;
    }
    static double power(double p,double q){
        return Math.pow(p,q);
    }
}
class thirtyFive{
    public static void main(String args[]){
        int sum=MathOperation.add(5,2);
        int minus=MathOperation.subtract(25,15);
        int prod=MathOperation.product(10,5);
        double pow=MathOperation.power(2,3);

        System.out.println(sum);
        System.out.println(minus);
        System.out.println(prod);
        System.out.println(pow);
    }
}