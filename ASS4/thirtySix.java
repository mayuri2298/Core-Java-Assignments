class MathOperation1{
    static int multiply(int a,int b){
        return a*b;
    }
    static float multiply(float a,float b,float c){
        return a*b*c;
    }
    static double multiply(double a,int b){
        return a*b;
    }
    static int multiply(int arr[]){
        int pro=1;
        for(int i=0;i<arr.length;i++){
            pro=pro*arr[i];
        }
        return pro;
    }
}
class thirtySix{
    public static void main(String args[]){
        int arr[]={1,2,3};
        int ans1=MathOperation1.multiply(arr);
        System.out.println(ans1);
    }
}