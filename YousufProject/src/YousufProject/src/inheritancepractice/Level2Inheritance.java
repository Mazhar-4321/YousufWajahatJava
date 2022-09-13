package inheritancepractice;

public class Level2Inheritance {
    public static void main(String[] args) {
        Child c = new Child("child");

    }
}

class GrandParent{
    int a=2;
    void add(){
        System.out.println("Grand Parent add method");
    }
    GrandParent(String s){
        System.out.println("Grand Parent Parameterized Constructor");
    }
    GrandParent(){
        //3
        System.out.println("Grand Parent Zero Parametrized Constructor");//p1 4
    }

}
class Parent extends GrandParent{
    int a=1;
    void add(){
        System.out.println("Parent add method");//8
    }
    Parent(String s){
        super(s);
        System.out.println("Parent Parameterized Constructor");
    }
    Parent(){
     super();//2
        System.out.println(" Parent Zero Parametrized Constructor");//p2 5
    }


}
class Child extends Parent{
    int a=0;
    Child(String s){
        super();//1
        System.out.println( super.a);//p3 6
        super.add();//7
        System.out.println(super.a);//9

       // super();
        System.out.println("Child Parameterized Constructor");//10
    }
    Child(){
        System.out.println("Child Zero Parametrized Constructor");
    }
}
/*****
 output:
 Grand Parent Zero Parametrized Constructor
 Parent Zero Parametrized Constructor
 1
 Parent add method
 1
 Child Parameterized Constructor
 */
