import java.util.Scanner;



public class FunCoding {
    public static void main(Practice4[] args) {
        Scanner sc =new Scanner(System.in);
//        System.out.print("Enter Your Age Please:");
//        int userAge = sc.nextInt();
//        int x = 2022-userAge;
//
//        System.out.print("Based on what you entered your Year of Birth is:"+x);
//        System.out.println(" Please enter your temperature in F:");
//        int temFahrenheit = sc.nextInt();
//        double tempCelsius =((temFahrenheit-32)*5/9);
//        System.out.println(temFahrenheit + "F is"+tempCelsius + "C");

        System.out.print("Enter your Weight in lbs:");
        double Weightlbs= sc.nextDouble();
        double Weightkg= (Weightlbs /2.205);

        System.out.print(  "Your weight in  is " +  Weightkg+ "kg" );



    }
}
