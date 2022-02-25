import java.util.Scanner;

import static java.awt.SystemColor.text;

public class Practice_S {
    public static void main(String[] args) {
//        String text1 = "Hello";
//        String text2 ="World";
//        System.out.println(text1 + " " + text2);
//
//        int x =10;
//        int y =20;
//        System.out.println(text1 + " " + text);
//        System.out.println(x+y);
//
//        String text= "Hello \t \nWorld";
//        text= "John  Smith";
//        System.out.println(text);
//        text= "Naj is mad at me";
//        System.out.println("=====================================");
//        System.out.println(text +"\nHello Najmuddin");
//        System.out.println("=====================================");
//
//        text ="Anisa's \'Java Class\'.";
//        System.out.println(text);
//
//        text="Hello \r Hello";
//        System.out.println(text);
//
//        text ="Hello\f Najmuddinxon ";

        //Create a variable named carName and assign value to BMW:
        String carName="BMW";

        //Write a Java program to check whether Java is installed on your computer:
        System.out.println("My java version is " +  System.getProperty("java.version"));
        System.out.println("My java version is " +  System.getProperty ("java.vendor"));

        //Write a Java program that takes two numbers input and display the product of two numbers:
        Scanner in = new Scanner(System.in);
        System.out.print("Input first integer number please:  ");
        int firstNumber = in.nextInt();
        System.out.print("Input your second integer number please  :");
        int secondNumber=in.nextInt();
        int total =firstNumber*secondNumber;
        System.out.println("The product of your numbers is:   "  +total);


    }
}
