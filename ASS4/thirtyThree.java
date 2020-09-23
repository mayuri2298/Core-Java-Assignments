class Employee{
    private int empId;
    private String empName;
    void set(int empId,String empName){
        this.empId=empId;
        this.empName=empName;
    }
    void show()
    {
        System.out.println(empId+" "+empName);
    }
}
class thirtyThree{
    public static void main(String args[]){
        Employee e=new Employee();
        e.set(1,"Mayuri Chavan");
        e.show();
    }
}