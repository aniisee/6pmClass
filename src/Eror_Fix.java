import java.util.Scanner;

public class Eror_Fix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your first number:  ");
        double num1 = sc.nextDouble();


        System.out.println("Please enter your second number:");
        double num2=sc.nextDouble();
        sc.nextLine();


        String text= "Select one of these operations: +, - , *, /";
        System.out.println(text);
        String symbol=sc.nextLine();
        double result;
        if (symbol.equals("+")){
            result=num1+num2;
            sc.nextLine();
            System.out.println(num1+ " + " +num2 + "=" +result);

        } else if(symbol.equals("-")){
            result=num1-num2;
            System.out.println(num1+ "-"+num2+"="+ result);
        } else if(symbol.equals("*")){
            result=num1*num2;
            System.out.println(num1+"*"+num2+"="+result);
        }
        else if(symbol.equals("/")){
            result=num1/num2;
            System.out.println(num1+ "/"+num2+"="+result);
        }

    }
}
