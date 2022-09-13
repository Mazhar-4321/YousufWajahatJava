package inheritancepractice;

public class Level4Inheritance {
    public static void main(String[] args) {
        ParentB p = new ParentB();
        p.add();
        ChildA c= new ChildA();
        c.add();
        ParentB p1  = new ChildA();
        p1.add();
        //ChildA c1= new ParentB();
    }
}
class ParentB{
    void add(){
        System.out.println("Parent");
    }
}
class ChildA extends ParentB{
    void add(){
        System.out.println("Child");
    }
}
