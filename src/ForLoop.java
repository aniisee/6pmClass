public class ForLoop {
    public static void main(String[] args) {
//        int i=1;
//        while(i<=5){
//            System.out.println(i);
//            i++;
        //for loop:
//            for(int i =1; i<=5; i++){
//                System.out.println(i);

//        boolean flag=false;
//        while(flag){
//            System.out.println("Hello");
//            }

//        for (int i=1; i<=10; i++){
//            System.out.println(4 + "X "+i+"="+4*i);

//        for (int i=2; i<=80; i+=2){
//            System.out.println(i);
//        }
//        for( int i=80; i>=2; i-=2){
//            System.out.println(i);
//        }
//      for (int i=1; i<=99; i+=2){
//          System.out.print(i+ ",");


//        String str = "hello";
//        char ch=2;
//        System.out.println(str+ch);
//        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i)=='o');

//            for( int i=1; i<=50; i++){
//                System.out.print(i +",");
//            }

//
//        for(int i=0; i<=10; i++){
//
//            if(i==5){
//                break;
//            }
//            System.out.println(i);

//        }
//        String str="Welcome to 2022";
//        for (int i =0; i<str.length(); i++){
//            if(str.charAt(i)=='t'){
//                break;
//            }
//            System.out.print(str.charAt(i));

        for(int i=0; i<5; i++){
            System.out.println("  outer loop   " + i);
            outer:for(int j=0; j<5; j++){
                System.out.print("  inner loop  " + j);
                int l =0;
                inner: while(l<5){
                    System.out.println(" inner loop "+j);
                    l++;
                    if(i==3){
                       continue inner;
                    }
                }
            }
        }

        }
    }



