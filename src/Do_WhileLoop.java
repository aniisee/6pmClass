import java.util.Scanner;

public class Do_WhileLoop {
    public static void main(String[] args) {
        //do while loop

//            int i=0;
//        do {
//            System.out.println("Hello");
//        } while(i < 5);
//            System.out.println(i+ "hello");
//            i++;


//        int i = 10;
//        do {
//            System.out.println(i);
//            i-=2;
//        }while(i>=10);
//        int x=50;
//        do{
//            System.out.println(x);
//            x-=2;
//        }while(x>=10);


//int i=10;
//do{
//    System.out.println(i);
//    i+=5;
//
//}while(i<=100);


        //ask user to enter username
        //if username is correct ask for password
        //if username is invalid print invalid username
        //if username is correct but password is invalid print invalid password
        //print login success when correct username and password
        //ask user 3 times when username or password is invalid.

        String expectedUsername = "Admin123";
        String expectedPassword = "admin123$";
        int i = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your username: ");
            String actualUsername = sc.nextLine();
            if (actualUsername.equals(expectedUsername)) {
                System.out.print("Enter your password: ");
                String actualPassword = sc.nextLine();
                if (actualPassword.equals(expectedPassword)) {
                    System.out.println("Login Success! ");
                    break;
                } else {
                    System.out.println("Invalid Password");
                }
            } else {
                System.out.println("Invalid Username");
            }
            i++;
        }while(i<=3);
    }
}







//        }while (i < 3) ;
//          int i=1;
//        do{
//            System.out.println("Anisa");
//            i++;
//        } while(i<=20);
               // 5 multiplication until 11:
//         int i=1;
//        do{
//            System.out.println(5 + "X"+i + " = " +5 *i);
//            i++;
//        }while(i<12);
//
//    }















