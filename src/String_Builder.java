import java.sql.SQLOutput;
import java.util.Scanner;

public class String_Builder {
    public static void main(String[] args) {
//        StringBuilder name =new StringBuilder("John");
//        System.out.println(name);
//        System.out.println(name+"Smith" +(5+5));
//        System.out.println(name.append("Jr"));  //apppend()
//
//        String name2=" Bob";
//        System.out.println(      name2  + "Smith");
//        System.out.println(      name2.concat("Smith"));


        //deleteCharAt()

//        System.out.println(text.deleteCharAt(16));

        //delete()
//        StringBuilder text= new StringBuilder("Java is a programming labguage");
////        System.out.println(text.delete(8,9));
//
//        String test3="Hello";
//        StringBuilder text4=new StringBuilder(test3);
//        System.out.println(text4.reverse());
//
//        String text5=text4.toString();
//        System.out.println(text5);
//test3=text5;
//        System.out.println(test3);
//        StringBuilder text6=new StringBuilder(text5);
//        System.out.println(text6.reverse());
//        String text7 =text6.toString().toUpperCase();
//        text7.toUpperCase();
//        System.out.println(text7);
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Please Enter Your First Name:");
//        String username=sc.nextLine();
//        StringBuilder converted=new StringBuilder(username);
//        System.out.println("Your name backwards will be:" +converted.reverse());
        StringBuilder str = new StringBuilder("Java and are  programming languages");
//        System.out.println(str.insert(0, "Hello and "));
//        System.out.println(str.insert(  17, 2022));
        System.out.println(str.insert(9,"JavaScript "));
        System.out.println(str.insert(24, "the best"));
        System.out.println(str.insert(54,"of 2022"));



    }
}
