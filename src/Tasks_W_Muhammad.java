import java.util.Scanner;

public class Tasks_W_Muhammad {
    public static void main(String[] args) {
//        System.out.println(2 + 4 + "hello" + (4+2));
//        System.out.println("hello" + 40 / 5);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please Enter a letter to check whether it it vowel or constant: ");
//        String ch = scanner.nextLine().toLowerCase();
//
//        int number = Integer.parseInt("ch");
//
//
//        if (ch.equals("o") || ch.equals("a") || ch.equals("i") || ch.equals("e") || ch.equals("u")) {
//            System.out.println("It is a vowel letter!");
//        } else if (ch == "a-z") {
//            System.out.println("It is a constant letter");
 //  3) Write a program that takes 2 int values from user,
        //  return true if one is negative and one is positive.
        //Except if the parameter "negative" is true,
        //then return true only if both are negative.

        Scanner input=new Scanner(System.in);
        System.out.println("Input your first integer: ");
        int num1=input.nextInt();
        System.out.println("Input your second integer: ");
        int num2=input.nextInt();
        if (num1<=0 && num2>=0 || (num1>0 && num2<=0)){
            System.out.println("true");
        } else if(num1<=0 && num2<0 || num1<0 && num2>=0){
            System.out.println("true");
        } else{
            System.out.println("False");

        }

        }

    }



