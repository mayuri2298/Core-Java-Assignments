class Employee2{
    private int empId;
    private String empName;
    Employee2(){
        this(1,"xyz");
    }
    Employee2(int empId,String empName){
        this.empId=empId;
        this.empName=empName;
    }
    void show(){
        System.out.println(empId+" "+empName);
    }
}
class fortyOne{
    public static void main(String args[]){
        Employee2 e=new Employee2();
        e.show();
    }
}