package inheritancepractice;

public class Level4Inheritance {
    public static void main(String[] args) {
        ParentB p = new ChildA();
        p.add();
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
