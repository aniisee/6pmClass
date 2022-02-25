import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
//        int x = 5;
//        switch (x) {
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                break;
//            case 3:
//                System.out.println(3);
//                break;
//            default:
//                System.out.println("none");
//
//        }
//        if (x == 1) {
//            System.out.println(1);
//
//        } else if (x == 2) {
//            System.out.println(2);
//        } else if (x == 3) {
//            System.out.println(3);
//        } else {
//            System.out.println("none");
//        }
        //  Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number from 1 to 7:");
//        int numberOfDays= scanner.nextInt();
//        switch(numberOfDays){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//                case 3:
//                    System.out.println("Wednesday");
//                    break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//                case 7:
//                    System.out.println("Sunday");
//                    break;
//                    default: System.out.println("Invalid input try again!");


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please Enter a vowel:");
//        String ch = scanner.nextLine();
//
//
//       switch (ch) {
//           case "a":
//               System.out.println(" This is vowel");
//               break;
//           case "e":
//               System.out.println("This is vowel");
//               break;
//           case "u":
//               System.out.println("This is vowel");
//               break;
//           case "i":
//               System.out.println("This is vowel");
//               break;
//           default:
//               System.out.println("this is constant");
//       }
//

//        Scanner scanner = new Scanner(System.in);
//        System.out.println(" Please enter a weekday:");
//        String weekday = scanner.nextLine();
//        switch ( weekday ) {
//            case"Monday":
//            case "Tuesday":
//            case"Wednesday":
//            case"Thursday":
//            case"Friday":
//                System.out.println(weekday +  " " + "is a weekday");
//                break;
//            case "Saturday":
//            case "Sunday":
//                System.out.println(weekday +  ""+ "is a weekend");
//                break;
//                default: System.out.println("Not a week day! Try Again");
//        }
//
//

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number from 1 to 7:");
//        int numberOfDays = scanner.nextInt();
//            switch (numberOfDays) {
//                case 1:
//                    System.out.println("Monday");
//                    break;
//                case 2:
//                    System.out.println("Tuesday");
//                    break;
//                case 3:
//                    System.out.println("Wednesday");
//                    break;
//                case 4:
//                    System.out.println("Thursday");
//                    break;
//                case 5:
//                    System.out.println("Friday");
//                    break;
//                case 6:
//                    System.out.println("Saturday");
//                    break;
//                case 7:
//                    System.out.println("Sunday");
//                    break;
//
//            default:
//        System.out.println("Invalid input try again!");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a month: ");
//        String month= scanner.nextLine();
//        if(month.equals("December")|| month.equals("January")|| month.equals("February")){
//            System.out.println("It's winter-time to go skiing!");
//    } else if (month.equals("March")|| month.equals("April")|| month.equals("May")){
//            System.out.println("It's spring time to fall in love");
//        } else if (month.equals("June")|| month.equals("July")|| month.equals("August")){
//            System.out.println("It's summer- time to go to the beach");
//
//        } else if (month.equals("September")|| month.equals("October")||month.equals("November")){
//            System.out.println("It's fall- time to go hiking");
//        } else {
//            System.out.println("Invalid Month Try Again");
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int monthNumber= scanner.nextInt();
        if (monthNumber>0 && monthNumber<=12){
            switch(monthNumber){
                case 12:
                case 2:
                case 1:
                    System.out.println("Winter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Fall");
                    break;
                default:
                    System.out.println("Invalid Number! Please try again!");
            }
        }

    }
}



