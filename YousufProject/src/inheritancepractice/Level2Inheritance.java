package inheritancepractice;

public class Level2Inheritance {
    public static void main(String[] args) {
        Child c = new Child("child");

    }
}

class GrandParent{
//    GrandParent(String s){
//        System.out.println("Grand Parent Constructor");
//    }

}
class Parent extends GrandParent{
    int a;
    void add(){

    }
    Parent(String s){
        super();
        System.out.println("Parent Constructor");
    }
    Parent(){

    }

}
class Child extends Parent{
    Child(String s){
        super();
        System.out.println( super.a);
        super.add();
        System.out.println(super.a);

       // super();
        System.out.println("Child Constructor");
    }
}
