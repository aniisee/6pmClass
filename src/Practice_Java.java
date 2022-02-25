import java.util.Locale;
import java.util.Arrays;
import java.util.Scanner;

public class Practice_Java {
    public static void main(String[] args) {
        //ask user to enter a char
        //write Java Program to find ASCII Value of a character
        //A=65

       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single char: ");
        char charfromuser= scanner.next().charAt(0);
        int value=(int)charfromuser;
        System.out.println("the value of " +  " " + " " + charfromuser+    "is" + " " +" " +   value);
*/
        //Ask user to enter a char
        //write a java code to check if the char is alphabet
        //A-Z or a-z

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single char:  ");
        char userinput = scanner.next().charAt(0);
        if (userinput >= 'a' && userinput <= 'z' || userinput >= 'A' && userinput <= 'Z') {
            System.out.println(userinput + "     is an alphabet");

        } else {
            System.out.println(userinput + "     is Not an alphabet");
        }*/

        ///Ask user to enter a string with numbers
        //write java code to separate chars and other values

       /* Scanner scanner = new Scanner(System.in);
        String chars="";
        String othervalues="";

        System.out.println("Enter a string :  ");
        String strFromUser= scanner.nextLine();
        for (int i=0; i<strFromUser.length(); i++){
            if(strFromUser.charAt(i)>='a'&& strFromUser.charAt(i)<='z'||strFromUser.charAt(i)>='A' &&  strFromUser.charAt(i)>='Z') {
                chars += strFromUser.charAt(i);
            }else{
                othervalues+=strFromUser.charAt(i);
            }
        }
        System.out.println("All char values:   " + chars);
        System.out.println("All other values : " +othervalues);
*/
        //how to convert a string into int?
//        String number="2022";
//        int year=Integer.parseInt(number +10);
//        System.out.println(year +10);

/*
        long year1=Long.parseLong(number);
        //int to string
        int x=2022;
        String xValue=String.valueOf(x);
        System.out.println(xValue + 20);*/


        //Write a java program code to check if 2 strings are palindrome
        // anna, level, civic, madam.
        //first way is with StringBuilder

        //#1 Way:

        /*String palindrome="civic".toLowerCase(Locale.ROOT);
        StringBuilder strBuilder=new StringBuilder(palindrome);
        strBuilder.reverse();
        if(palindrome.equals(strBuilder.toString())){
            System.out.println("Is a Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }*/
        /*String palindrome="Level".toLowerCase(Locale.ROOT);
        String reversedstring="";
        for (int i= palindrome.length()-1; i<=0; i--){
            reversedstring+=palindrome.charAt(i);
            if (palindrome.equals(reversedstring)){
                System.out.println("it is a palindrome");
            }else{
                System.out.println("not a palindrome");
            }*/
        //print Alphabet from A to Z
        // from a to z


    /*    String strChars = "";
        for (char c = 'A'; c <= 'Z'; c++) {
            strChars += c;
        }
        for (char c = 'a'; c <= 'z'; c++) {
            strChars+=c;

        }
            char[] charArr = strChars.toCharArray();
            System.out.println(charArr[12]+ ""+charArr[30]);*/


        //Write a Java program to check if two strings are anagram
        //angel-glean, arc-car

        String str1="angel".toLowerCase(Locale.ROOT);
        String str2="glean".toLowerCase(Locale.ROOT);
        if(str1.length()==str2.length()){
            char charArr1[]=str1.toCharArray();
            char charArr2[]=str2.toCharArray();

            Arrays.sort(charArr1);
            Arrays.sort(charArr2);
   if(Arrays.equals(charArr1,charArr2)){
       System.out.println("It is Anogram");
   }

        }else{
            System.out.println("Not an anagram");
        }

        }

    }

