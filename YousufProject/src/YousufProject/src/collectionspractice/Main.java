package collectionspractice;
import javafx.animation.ScaleTransition;
import org.omg.SendingContext.RunTime;
import sun.util.BuddhistCalendar;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("hi");
        try {
           // System.out.println("jkl");
            try {
                System.out.println(2 / 0);
            }
            catch (Exception e){
            }
        }
        catch (ArithmeticException| NullPointerException | ClassCastException | ArrayIndexOutOfBoundsException e){
            System.out.println("class cast Exception");
        }
        catch (Exception e){

        }
        finally {
            System.out.println("code clean up");
        }

        System.out.println("bye");
  try {
      WajahatException w = new WajahatException("Bhai Exception marra");
      throw w;
  }
  catch (WajahatException e){
      e.printStackTrace();
  }


    }
}

class WajahatException extends ArithmeticException{
    WajahatException(String s){
        super(s);
    }
}
