public class College {
    private String name;
    private String location;
    private String noOfStudents;
    private String yearOfEstablishment;

    public College(String n1, String n2, String n3, String n4) {
        name = n1;
        location = n2;
        noOfStudents = n3;
        yearOfEstablishment = n4;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getNoOfStudents() {
        return noOfStudents;
    }

    public String getYearOfEstablishment() {
        return yearOfEstablishment;
    }
}
class Main{
    public static void main(String[] args) {
        arraysAndStringsExample();
    }
    static void collegeObjectExample(){
        College college = new College("LIET","kali mandir","145","2001");
        System.out.println(college.getLocation());
        System.out.println(college.getLocation());
        System.out.println(college.getName());
        System.out.println(college.getNoOfStudents());
        System.out.println(college.getYearOfEstablishment());
    }
    static void methodOverLoadingExample(){
        MethodOverloading m = new MethodOverloading();
        m.add(1,2);
        m.add(1,2.2);
        m.add(4.4,5.5);
    }
    static void arraysAndStringsExample(){
        ArraysAndStrings a = new ArraysAndStrings();
        a.stringExample();
    }
}
class MethodOverloading{
    void add(int x,int y){
        System.out.println("two integers");
    }
    void add(double x,double y)
    {
        System.out.println("two doubles");
    }
    void add(int x,double y)
    {
        System.out.println("one int and one double");
    }
}
class StaticAndInstanceMethodsCalling{
    //static method
    static void add(){
        // no instance calling
        subtract1();//static
        StaticAndInstanceMethodsCalling s = new StaticAndInstanceMethodsCalling();

        s.add1();
    }
    //instance methods
    void subtract(){
        add();//static
        add1();//instance
    }
    //instance method
    void add1(){

    }
    //static method
    static void subtract1(){

    }
}
class ArraysAndStrings{
    void arraysExample(){
        int a[]= new int[3];
        a[0]=58;
        a[1]=79;
        a[2]=987;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a.length);

    }
    void stringExample(){
         String s= new String("mazhar");
        // String s1="mazhar";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.substring(1));
        System.out.println(s.toUpperCase());
        System.out.println(s.trim());
        System.out.println(s.charAt(2));
        //System.out.println(s.);
    }
}
