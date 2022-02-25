import java.util.Scanner;

public class ForLoopPart2 {
    public static void main(String[] args) {
//        for(int i=0; i<=100; i++){
//            System.out.println(i);
//        String str="Monday";
//        for(int i=0; i< str.length(); i++){
//            if(str.charAt(i)=='y'){
//                System.out.println(i);

        //loop through a string
        //check if the last 2 char of string is yz
        //if yes Print True
        //Else print false

//        String str="abc-tyyz";
//        for(int i =str.length()-1; i>=0; i--){
//           if (str.charAt(i) == 'z' &&  str.charAt(i)-1=='y'){
//               System.out.println(true);
//           }

        //ask user to enter a product name and it's price
        //after 5 items ask user a question yes or no
        //if yes ask for 5 more times
        //if no stop the program
        //ar the end print receipt price net to it
        // total  amount at the bottom of the receipt

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 5 items :");
        String product, product2, product3, product4, product5;
        double price, price2, price3, price4, price5;
        double totalprice = 0;

        String otherProduct1, otherProduct2, otherProduct3, otherProduct4, otherProduct5;
        double otherPrice1, otherPrice2, otherPrice3, otherPrice4, otherPrice5;
        for (int i = 1; i <= 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the product:" + i + ":");
            product = sc.nextLine();
            System.out.println("Enter the price:" + i + ":");
            price = sc.nextDouble();
            totalprice += price;
            System.out.println(product + "................. " + price);
            System.out.println("Total is : $" + totalprice);
            int i2 = 0;
            if (i == 5) {
                System.out.println("Do you want to buy more products? Y/N");
                String yn = scanner.nextLine();
                if (yn.equals("Y")) {
                    i = 1;
                } else {
                    break;
                }
            }


        }
    }
}



