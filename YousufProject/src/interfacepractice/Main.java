package interfacepractice;

public class Main {
    public static void main(String[] args) {

    }
}
class Concrete{
    void add()
    {



    }
    //void sub();
}
abstract class Abstract{
    void add(){

    }
    abstract void sub();
}
interface Interface{
    void add();
    void sub();
}
class Child implements  Interface{

    @Override
    public void add() {

    }

    @Override
    public void sub() {

    }
}
