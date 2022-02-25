public class Nested_Loop {
    public static void main(String[] args) {


//        for (int i=10; i>=1; i--){
//            for(int j =10; j>= i; j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        for (int i=1; i<=5; i++ ){
//            System.out.print(":"+(i) +":");
//            for( int j=1; j<=3; j++){
//                System.out.print(j);
//            }

//        String str="Hello";
//        for(int i=str.length()-1; i>=0; i--){
//            if (str.charAt(i)=='e'){
//                break;
//            }
//            System.out.print(str.charAt(i));
//        }
        //Palindrome
        // civic, anna, level

        String str = "Level";
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);

        }
        if (str.toLowerCase().equals(result.toLowerCase())) {
            System.out.println("This is Palindrome");
        } else {
            System.out.println("This is not Palindrome");

        }
    }
}

