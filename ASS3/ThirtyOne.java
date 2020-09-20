class Student{
    private int stdId;
    private String stdName;
    
    void set(int id,String name)
    {
        stdId=id;
        stdName=name;
    }
    void show()
    {
        System.out.println(stdId+" "+stdName);
    }
}
class ThirtyOne{
    public static void main(String args[])
    {
        Student s=new Student();
        s.set(1,"Mayuri Chavan");
        s.show();
    }
}