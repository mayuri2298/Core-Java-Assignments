class Student{
    private int stdId;
    private String stdName;
    public static int counter=0;

    Student(int id,String name){
        stdId=id;
        stdName=name;
        counter++;
    }
}
class ThirtyTwo{
    public static void main(String args[]){
        Student s1=new Student(1,"Mayuri");
        Student s2=new Student(2,"Dhanashree");
        Student s3=new Student(3,"Sejal");
        Student s4=new Student(4,"Akshaya");
        Student s5=new Student(5,"Pooja");

        System.out.println("Total objects count "+Student.counter);
    }
}