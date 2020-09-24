class Person{
    void getDetail(){
        System.out.println("person detail");
    }
    void getJob(){
        System.out.println("person job");
    }
}
class Employee extends Person{
    void getJob(){
        System.out.println("Employee job");
    }
    void getDept(){
        System.out.println("Employee dept");
    }
}
class FortySix{
    public static void main(String args[]){
        Person p[]={new Employee(),new Person()};
        for(Person a:p){
            if(a instanceof Employee){
                Employee e=(Employee)a;
                e.getDept();
            }
        }
    }
}