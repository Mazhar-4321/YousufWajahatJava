package exceptionpractice;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    int a;
   static Main m;
    public static void main(String[] args) throws Exception  {
        userException();
        //tryCatchExample();
        //method1();
//        try {
//            exceptionSpecification();
//        }catch(Exception e) {
//
//        }
        //exceptionSpecification();
    }
    static void tryCatchExample(){
        System.out.println("hi");
        try {
            System.out.println(1/0);
        }
        catch (Exception e){
            //System.out.println("divide by zero exception");
        }
        finally {
            System.out.println("hi finally");
        }

        System.out.println("bye");
    }
    static void method1(){
//        try {
//            method2();
//        }
//        catch(Exception e){
//            System.out.println("catching thrown exception");
//        }
        method2();
    }
    static void method2(){
        System.out.println("hi");
        try {
            System.out.println(1 / 0);
        }
        catch (ArithmeticException e){
            System.out.println("throwing exception");
            throw e;
        }

    }
    static void exceptionSpecification() throws Exception {
        System.out.println(1/0);

    }
    static void userException(){
        int age;
        Scanner sc = new Scanner(System.in);
        age=sc.nextInt();
        try{
            if(age>80) {
                Yousuf y = new Yousuf("Invalid Age");
                throw y;
            }
        }
        catch (Yousuf e){
           e.printStackTrace();
        }
    }
}
class Yousuf extends NullPointerException{

    Yousuf(String s1){
        super(s1);
    }

}
