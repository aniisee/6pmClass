import java.util.Scanner;

public class Operators {
    public static void main(Practice4[] args) {

        //+Addition
        int a =30;
        int b= 35;
        int result = a + b;

        //-Subtraction

        int a1 = 40;
        int b1=45;
        int result1 =a1 -b1;

        // * Multiplication
        int a2 =50;
        int b2 =5;
        int result2 = a2*b2;

        //Division
        int a3=45;
        int b3 =5;
        int result3 =a3/b3;


        //Modulus
        int a4 =20;
        int b4 =3;

        System.out.println(a4 % b4);



        //++ Increment +1

        int a5 =70;
        ++a5;
        ++a5;
        ++a5;

        System.out.println(a5);


        //--Decrement -1;
        int a6 =80;
        --a6;
        --a6;
        --a6;
        --a6;

        System.out.println(a6);


        //Scanner examples:

        Scanner input = new Scanner(System.in);

        /*System.out.print("Enter first number:");
        int num1= input.nextInt();

        System.out.print("Enter second number:");
        int num2 =input.nextInt();
        int results =num1 +num2;

        System.out.println("Result is:"+ results);

         */
        /*System.out.print("Enter first number:");
        int num1= input.nextInt();

        System.out.print("Enter second number:");
        int num2 =input.nextInt();
        int results =num1 % num2;

        System.out.println("Remainder is:"+ results);

         */
        System.out.print("Enter a number:");
        int num1= input.nextInt();
        ++num1;
        System.out.println("Your number is:"+num1);





                ;

    }
}
