public class ExceptionHandling { }
class Main1 {
    public static void main(String[] args) {
        System.out.println("hi");
        try {
            System.out.println(1 / 0);//error

        } catch(ArrayIndexOutOfBoundsException | ArithmeticException a1) {

        }
        System.out.println("bye");
    }
}
    // try is a block in which we write those statements on which
    // we have doubt that they can create exception when program is executed
    // we have to write either catch block or finally block with try block
    // catch is a block which takes one or more parameters of "exception class"
    // finally is a block in which we write statements that has to be executed at any cost.

