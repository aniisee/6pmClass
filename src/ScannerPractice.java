import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your grade: ");
        int grade=sc.nextInt();
        if (grade>=90){
            System.out.println("Excellent");
        }else if (grade>=80){
            System.out.println("Good");
        }else if (grade>=70){
            System.out.println("Average");
        }else if (grade>=60){
            System.out.println("Bad");
        }else{

            System.out.println("Error");
        }

    }
}
