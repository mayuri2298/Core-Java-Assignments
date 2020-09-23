import java.util.Scanner;
class student{
    String name;
    int rollNo;
    int age;
    int score;
    static int i=0;
    static int j=0;
    static int k=0;
    static int m=0;

    static int arr[]=new int[10];
    static int arr1[]=new int[10];
    static int arr2[]=new int[10];
    static int arr3[]=new int[10];

    void get(String name,int rollNo,int age,int score){
        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
        this.score=score;
    }
    void show(){
        System.out.println(name+" "+rollNo+" "+age+" "+score);
    }
    void group(){
        if( (score>=0 && score<=50) ){
            arr[i]=score;
            i++;
        }
        else if( (score>50 && score<=65) ){
            arr1[j]=score;
            j++;
        }
        else if( (score>65 && score <=80) ){
            arr2[k]=score;
            k++;
        }
        else{
            arr3[m]=score;
            m++;
        }
    }
    void groupShow(){
        System.out.println("between 0 to 50");
        for(int a=0;a<arr.length;a++){
            System.out.println(arr[a]);
        }
        System.out.println("between 50 to 65");
        for(int a=0;a<arr1.length;a++){
            System.out.println(arr1[a]);
        }
        System.out.println("between 65 to 80");
        for(int a=0;a<arr2.length;a++){
            System.out.println(arr2[a]);
        }
        System.out.println("between 80 to 100");
        for(int a=0;a<arr3.length;a++){
            System.out.println(arr3[a]);
        }
        
    }
    
}
class forty{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        student s[]=new student[10];
        for(int i=0;i<s.length;i++){
            System.out.println("Enter name,roll no,age and score");
            String s1=sc.next();
            int roll=sc.nextInt();
            int age1=sc.nextInt();
            int sco=sc.nextInt();
            s[i]=new student();
            s[i].get(s1,roll,age1,sco);
            s[i].group();
            s[i].groupShow();
            
        }
    }
}