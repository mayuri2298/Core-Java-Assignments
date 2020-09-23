class Person{
    private int age;
    private String name;
    Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    void display(){
        System.out.println(age+" "+name);
    }

}
class thirtySeven{
    public static void main(String args[]){
        Person p1=new Person(22,"Mayuri Chavan");
        p1.display();
    }
}