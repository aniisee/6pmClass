import java.util.Scanner;

public class Nested_ifElse {
    public static void main(String[] args) {
        //dataBase
//        String username = "Admin123";
//        String password = "admin123$";
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter your username: ");
//        String currentUsername = scanner.nextLine();
//        if (currentUsername.equals(username)) {
//
//
//            System.out.println("Please enter your password: ");
//            String currentPassword = scanner.nextLine();
//            if( currentPassword.equals(password)){
//                System.out.println("Logged in successfully!");
//            } else{
//                System.out.println("Upps Wrong password!");
//            }
//            } else{
//            System.out.println("Invalid username!");

      // ask user to enter a number,
        // write java code to check if number is between 1-10
        //check if number is greater or less than 5
        //if number is less than 5 print number is smaller than 5
        //if number is greater than 5 print number is greater than 5
        //if number is 5 print number is in between 1 and 10
        //if number less than 1 print enter a higher number
        //if the number is greater than 10 print enter lower number
        //if number is between 1-10 print you got it right

        Scanner scanner = new Scanner(System.in);
        System.out.println( "Please enter a number from 1 to 10: ");
        int numberFromUser= scanner.nextInt();
        if(numberFromUser>=1 && numberFromUser<=10) {
            System.out.println("You got it right");
            if (numberFromUser < 5) {
                System.out.println("Number is smaller than 5");
            } else if (numberFromUser==5) {
            } else {
                System.out.println("number is greater than 5");
            }
        } else if (numberFromUser<1){
            System.out.println("enter a higher number");

        } else if (numberFromUser>10){
            System.out.println("enter a lower number");
        }
        }
    }

