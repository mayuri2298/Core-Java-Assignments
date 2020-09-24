class person{
    person(){
        this(45);
        System.out.println("no arg person");
    }
    person(int i){
        System.out.println("param person");
    }
}
class employee extends person{
    employee(){
        this(12);
        System.out.println("no arg employee");
    }
    employee(int i){
        System.out.println("param employee");
    }
}
class FortySeven{
    public static void main(String args[]){
        employee e=new employee();
    }
}