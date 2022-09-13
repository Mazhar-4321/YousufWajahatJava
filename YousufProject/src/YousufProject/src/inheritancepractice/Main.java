package inheritancepractice;

public class Main {
    public static void main(String[] args) {
        //Single Level Inheritance
        C c= new C();
        System.out.println(c.aB);
        System.out.println(c.aC);

        B b = new B();
        System.out.println(b.aB);
        //Multi level Inheritance
        A a = new A();//parent
        System.out.println(a.aA+","+a.aD+","+a.aE);
        D d = new D();//intermediate class
        System.out.println(d.aD+","+d.aE);
        E e = new E();//child
        System.out.println(e.aE);
    }
}
class E{
    int aE;
}
class D extends E{
    int aD;
}
class A extends D{
    int aA;

}
class B {
    int aB;
}
class C extends B{
    int aC;
}
