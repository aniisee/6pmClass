
import java.util.*;
import java.util.Scanner;

public class Code_Review {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter an operator:");
//        String operator = scanner.nextLine();
//        if (operator.equals("+")||operator.equals("-")||operator.equals("*")||operator.equals("/"));
//
//        System.out.println("Please Enter first decimal number:");
//        double number= scanner.nextDouble();
//        System.out.println("Please Enter  second decimal number:");
//        double number2= scanner.nextDouble();
//
//        switch (operator) {
//            case "+":
//                System.out.println("Result" +(number+number2));
//                break;
//            case "-":
//                System.out.println("Result" +(number-number2));
//                break;
//            case "*":
//                System.out.println("Result" +(number*number2));
//                break;
//            case "/":
//                System.out.println("Result" +(number/number2));
//                break;
//                default:
//                    System.out.println("Invalid Operator");


                    //Random
                   Random random=new Random();
       int randomNumber=random.nextInt(100);
       float randomNumber2=random.nextFloat(100f);
       long randomNumber3=random.nextLong(10000);

        System.out.println(randomNumber);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);

        boolean randomBoolean=random.nextBoolean();
        if (randomBoolean){
            System.out.println("You got it right!");

        }else if(!randomBoolean){
            System.out.println("Try again!");
        }


        }




    }

