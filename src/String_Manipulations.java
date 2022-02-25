import java.util.Locale;
import java.util.Scanner;

public class String_Manipulations {
    public static void main(String[] args) {
        //Literal String;
//        String str1="Hello";
//        String str2="How are you?";
//        System.out.println(str1 + " "+ str2);
//
//        //with new keyword
//        String text2= new String("Hello World!");
//        System.out.println(text2);
//        System.out.println(str2.length());String str1="Hello";
////        String str2="How are you?";
////        System.out.println(str1 + " "+ str2);
////
////        //with new keyword
////        String text2= new String("Hello World!");
////        System.out.println(text2);
////        System.out.println(str2.length());

        //chatAt();
//        String text="Good Bye";
//        System.out.println(text.charAt(7));
//        //Equals();
////        System.out.println(text.equals("Good Bye"));
////        //EqualsIgnoreCase();
////        System.out.println(text.equalsIgnoreCase("Good bye"));
////        String str="Java is fun";
////        System.out.println(str.length());
////
////        Scanner in = new Scanner(System.in);
////        System.out.println("Please enter your text here: ");
////        String userText=in.nextLine();
////        int numberOfchars=userText.length();
////        System.out.println( "Your number of chars are:"+ "  "+numberOfchars);
//
////        //isEmpty:
////        String str2="";
////        String str3="Hi";
////        System.out.println(str2.isEmpty());
//
//        //contains();
////        String str="Naj likes to sleep early and wake up early, he also likes to drink tea " +"to establish his  like in a high quality performance" +"he goes to gym everyday";
////        boolean contains=str.contains("early, h");
////        System.out.println(contains);
//
//        String str="Hello and Good Bye";
//        boolean startsWith=str.startsWith("hello");
//        System.out.println(startsWith);
//        //endsWith:
//        boolean endsWith=str.endsWith("ye");
//        System.out.println(endsWith);
//
//        String text="Hello Naj, Bye Naj";
//        System.out.println(text);
//        System.out.println(text.toLowerCase());
//
//        String toUpperCase="Hello, welcome to 2022!";
//        System.out.println(text);
//        System.out.println(toUpperCase.toLowerCase());
//
//        //Index of();
//        text="Welcome";
//        int indexNumber=text.indexOf("w");
//        System.out.println(indexNumber);
//
//        //lastIndexof();
//        int lastIndexNumber=text.lastIndexOf("m");
//        System.out.println(lastIndexNumber);
//
//        //replace();
//        String name="John Smith";
//        String newName=name.replace("i","oo");
//        String newName2=name .replace("oo","i");
//        String newName3=name.replace("John","Bobo");
//        System.out.println(newName);
//        System.out.println(newName2);
//        System.out.println(newName3);
//
//        System.out.println("==========================================");
//        //substring:
//        System.out.println(name.substring(5));
//        System.out.println(name.substring(0,9));
//
//        //Trim();
//        String txt="          Java        is      fun";
//        System.out.println(txt);
//        System.out.println(txt.trim());

        //compare to()
//        String txt="123";
//        String text2="128 ";
//        System.out.println(text2.compareTo(txt));

        //Literal String:

//        String str="Hello";
//
//        //with a new keyword:
//
//        String str2=new String ("Hello");
//        System.out.println(str);
//        System.out.println(str2);
//
//        //String methods;
//        // length(); ==>
//        int charNumber=str.length();
//        System.out.println(charNumber);
//
//        //UpperCase();
//        String upperCaseStr=str.toUpperCase();
//        System.out.println(upperCaseStr);
//
//        //LowerCase();
//        String LowerCaseStr=str.toLowerCase();
//        System.out.println(LowerCaseStr);
//
//        //charAt();
//        char charStr=str.charAt(4);
//        System.out.println(charStr);
//
//        //equals();
//        boolean boolStr=str.equals("Hello");
//        System.out.println(boolStr);
//
//        //equalsIgnoreCase();
//        boolean boolStr1=str.equalsIgnoreCase("hello");
//        System.out.println(boolStr1);
//
//        //trim();
//        String trimStr=str.trim();
//        System.out.println(trimStr);
//
//        //substring();
//        String subStr=str.substring(3);
//        System.out.println(subStr);
//
//        String text="Hello and Welcome";
//        String subText=text.substring(6,9);
//        String subText2=text.substring(10,17);
//        String subText3=text.substring(0,7);
//        System.out.println(subText);
//        System.out.println(subText2);
//        System.out.println(subText3);
//
//        String pageTitle = "Your Loan Application Details";
//        String expectedResult ="Your Loan Application Details";
//        System.out.println(pageTitle.equals(expectedResult));
//        System.out.println(pageTitle.contains("Your Loan Application Details"));
//
//        // is Empty();  (returns boolean)
//        System.out.println(pageTitle.isEmpty());
//
//        //startsWith();
//        System.out.println(pageTitle.startsWith("Y"));
//
//        //endsWith();
//        System.out.println(pageTitle.endsWith("s"));
//
//        //replace();
//        System.out.println(pageTitle.replace(         "Your",              "New"));
//
//
//        //Your Personal Application Page:
//
//        String newPageTitle=pageTitle.replace(    "Loan",      "Personal");
//        String newPageTtitle2=newPageTitle.replace(    "Details",     "Page");
//        System.out.println(newPageTitle.concat(newPageTtitle2));
//
//        //indexOf();
//        int charTitle=pageTitle.indexOf("A");
//        int charTitle2=pageTitle.indexOf("O");
//        System.out.println(charTitle);
//        System.out.println(charTitle2);
//
//        //latsIndexOf(); returns integer
//        int lastIndexOf=pageTitle.indexOf("o");
//        System.out.println(lastIndexOf);
//
//String name="Hi";
//        System.out.println(name.hashCode());
//
//        //ask user to enter a text
//        //return: replace if String
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Your Text Here: ");
//        String text1=sc.nextLine();
//        if (text1.contains("a") || text1.contains("A")){
//            String newtext=text1.toUpperCase();
//           String  converted=text1.replace("A,","O,");
//            System.out.println(converted);
//            System.out.println("Numberof chars are:"+converted.length());
//        }
//        else{
//            System.out.println("Text does not contain a or A");
//        }



     //StringBuilder:

        StringBuilder str=new StringBuilder("Welcome");
        System.out.println(str);

        //append();
//        String str2="Hello";
//        //str.concat(str2); this can be used as well
//       System.out.println(str.append(str2));
//
//        //deleteCharAt():
//        //System.out.println(str.deleteCharAt(0));
//        System.out.println(str.substring(0));
//        System.out.println(str2.replace("H","Y"));
//        System.out.println(str.substring(2,4));
//        System.out.println(str.delete(8, 12));

        //reverse():
//        System.out.println(str.reverse());
//
//        //how to convert stringBuilder into String?
//        String convertedFromStringBuilder=str.toString();
//        System.out.println(convertedFromStringBuilder);
//        System.out.println(str);
//
//        String name="John";
//        System.out.println(name.toUpperCase());
//        System.out.println(name);
//
//        // insert():
//        StringBuilder newstr=new StringBuilder("Java is fun to learn");
//        System.out.println(newstr.insert(8,"not always   "));

        //how to convert String to stringBuilder?

//        String str2="Java is fun";
//        StringBuilder str3=new StringBuilder(str);
//        System.out.println(str);
//        System.out.println(str3.reverse());

        //ask user yo enter a text
        // return reverse version

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter a text please");

//        StringBuilder userinput=new StringBuilder(scanner.nextLine());
//        System.out.println(userText.reverse());
//        String userText=scanner.nextLine();
//        StringBuilder converted=new StringBuilder(userText);
//        System.out.println(converted.reverse());


        //if() { Else statement {:
        //ask user to enter name
        //add Welcome before name

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        StringBuilder userName= new StringBuilder(scanner.nextLine());
//        System.out.println(userName.insert (0,"Welcome,  "));
//        System.out.println(userName.toString().concat("      nice to have you here! "));
        System.out.println(userName.insert(0,"Welcome, ").append(" nice to have you here!  ").toString().toUpperCase());
    }
}
