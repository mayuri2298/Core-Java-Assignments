import java.util.Scanner;
class Student{
    int rollNo;
    int per;
    Student(int rollNo,int per){
        this.rollNo=rollNo;
        this.per=per;
    }
    void show(){
        System.out.println(rollNo+" "+per);
    }
}
class ClgStudent extends Student{
    int sem;
    ClgStudent(int rollNo,int per,int sem){
        super(rollNo,per);
        this.sem=sem;
    }
    void show(){
        super.show();
        System.out.println(sem);
    }
}
class SchoolStudent extends Student{
    String clsName;
    SchoolStudent(int rollNo,int per,String clsName){
        super(rollNo,per);
        this.clsName=clsName;
    }
    void show(){
        super.show();
        System.out.println(clsName);
    }
}
class FortyFive{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        ClgStudent arr[]=new ClgStudent[2];
        SchoolStudent arr1[]=new SchoolStudent[3];
        int gradeStudent=0;
        int gradeClg=0;
        System.out.println("Enter details of clg students");
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter roll no");
            int roll=s.nextInt();
            System.out.println("Enter percentage");
            int pr=s.nextInt();
            System.out.println("Enter sem");
            int sm=s.nextInt();
            arr[i]=new ClgStudent(roll,pr,sm);

            if(pr>75){
                gradeClg++;
            }
        }
        System.out.println("Enter details of school student");
        for(int i=0;i<arr1.length;i++){
            System.out.println("Enter roll no");
            int rollno=s.nextInt();
            System.out.println("Enter percentage");
            int percent=s.nextInt();
            System.out.println("Enter class name");
            String ss=s.next();
            arr1[i]=new SchoolStudent(rollno,percent,ss);
            if(percent>75){
                gradeStudent++;
            }
        }
        for(ClgStudent clg:arr)
        {
            clg.show();
        }
        for(SchoolStudent sc:arr1)
        {
            sc.show();
        }
        
        
        System.out.println("Enter roll no you want to search");
        int rol=s.nextInt();
        int flag=1;
        for(int i=0;i<arr.length;i++){
            if(rol == arr[i].rollNo){
                System.out.println("Student is college student");
                flag=0;
                break;
            }
            else{
                for(int j=0;j<arr1.length;j++){
                    if(rol == arr1[j].rollNo){
                        System.out.println("Student is school student");
                        flag=0;
                        break;
                    }
                }
            }
        }
        if(flag==1){
            System.out.println("Roll no is invalid");
        }

        System.out.println("College students above 75%: "+gradeClg);
        System.out.println("School students above 75%: "+gradeStudent);

        

    }
}