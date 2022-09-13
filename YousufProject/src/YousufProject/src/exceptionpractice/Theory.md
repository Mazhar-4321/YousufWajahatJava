......................................

Q1)**What happen when exception occurs?**

Ans: 
* When exception occurs program is terminated abnormally.
 * The following event occurs in the background
 * i) When an exception occurs , the object of related exception class is 
created(like ArithmeticException,NullPointerException,ArrayIndexOutOfBoundException) 
* ii)Then all the details of the exception is stored in the object like(line no,thread name, etc)
* iii)Then the object is thrown to JVM
* iv)Now JVM looks for exception handler
* v) If the exception handler is available then exception object is given to that handler else
JVM will give that object to default exception handler
* vi)The default exception handler displays the details stored in the object and terminate the program abnormally
.......................................
  
2)**What is Exception Handling?Explain its benefits?**
  
Ans:  
  * Exception handling is a process of skipping those statements that can generate exception 
    so that we can terminate program normally.
* In Java we can handle exception using the keywords ( try,catch,throw,throws,finally)
 try :
   try is a block in which we write those statements that can generate exception.
  Once the control goes out of try block, it will not return back to try block.
 syntax:
  * try
    
{

statemnts that can generate exception

}
 * catch: catch is a block which takes a parameter of Exception class . catch block is executed when exception occurs
we can write multiple catch blocks, but only one catch block is executed.
 syntax :
 catch(ExceptionClass e){
}
 * finally : finally is a block in which we write statements that has to be executed at any cost.
finally block will get executed whether there is exception or not.
 syntax: finally{
}
* Note : we have to write either catch or finally or both with try block
* Note : we can only write one finally block  with a try block
.........................................
  
3)**Classify Exceptions?**

Ans : 
* refer notes
........................................
  
4)**Explain Checked and Unchecked Exceptions?**
........................................
  
5)**How do you handle exceptions?(or) Explain try,catch,throw,throws,finally?**
......................................
  
6)**Difference between throw and throws?**
Ans: 
  * throw : we can use throw keyword inside a block.
throw keyword is used to throw an exception explicitly to its caller.
It is optional for Caller to handle the exception whether it is Checked or Unchecked.
  * throws : we can use throws keyword with method signature.
We use throws keyword to indicate that the mentioned exception can take place in a method.
If we throws Unchecked Exception then it is optional for Caller to handle that exception else it is mandatory for caller to 
handle that exception
.....................................
    
7)**What is rethrowing of exception and also explain exception specification?**
Ans : 
    * Suppose there are two methods method1() and method2(). Here method1() is caller method and
method2() is callee method. If there is an exception in method2() then we can handle that exception directly or else we
can rethrow that exception. If we re-throw that exception then that exception will be thrown to method1() i.e Caller.
Example Program:  

8)**Explain some predefined exceptions?**

Ans : 
* ArithmeticException,ArrayIndexOutOfBoundsException,NullPointerException,IOException
*  This exception occurs when we do illegal arithmetic operation like divide by zero.
* This excepti0n occurs when we try to access elements of array at invalid index.
* We get this exception when we try to acces the contents of an object without creating an object

9)**Can u create User defined Exception? how?????????**
10) Based on the requirement create user defined exception????????????
