import java.util.Locale;
import java.util.Scanner;

public class While_Loops {
    public static void main(String[] args) {
        //while loop

//        int i=0;
////        while(i<5){
////            System.out.println( i+ "  Hello");
////            i++;
//
//            while (i<=100){
//                System.out.print (i + ",");
//                i++;

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int startpoint=1;
//        int numberfromuser= scanner.nextInt();
//        while(startpoint<=numberfromuser){
//            System.out.print(  "  "+ startpoint + ",");
//            startpoint++;
//
//        int i=1;
//        while(i <=5){
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Please enter a number:");
//            int NumberFromUser = sc.nextInt();
//            if( NumberFromUser==5) {
//                System.out.println("Yay ! You got it right! Good Job!");
//                break;
//            } else if (NumberFromUser<5){
//                System.out.println("Enter a higher number!");
//            } else if (NumberFromUser>5){
//                System.out.println("Enter a lower number!");
//            }
//            i++;
//        int i=3;
//        while(i <=11){
//            System.out.print(i);
//            i+=2; //3,5,7,9,11

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a String here: ");
        String text=sc.nextLine().toLowerCase(Locale.ROOT);
        int i=0;
        int countA=0;
        while(i <= text.length()-1){
            if(text.charAt(i)=='a'){
                countA++;
            }

            i++;

        }
        System.out.println(countA+ "a exist ");

        }

        }





