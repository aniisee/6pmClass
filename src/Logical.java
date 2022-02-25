public class Logical {
    public static void main(Practice4[] args) {
        //Logical and  && operators:
                int x= 10;
                int y =30;
                int z =40;
                int q = 50;
                boolean result = x < y && x > z && x<q;
//        System.out.println(result);
//        System.out.println(5>4 && 7>6);
//        System.out.println(30<20 && 500>321);
//        System.out.println(40>=40&& 30!=29);
//        System.out.println(50<60 && 78>99);
//  Logical or|| :
//        System.out.println(x >y || z <q);
//        System.out.println(10 >7 || 7<10);
//        System.out.println(30<40 || 30<20);
//
//        System.out.println( (3 > 2  || 6<4)  && (4>2 || 8<9));
//        System.out.println( (60>50 && 40 !=30) && (70<60 ||50>90) );


        //Logical Not ! operator:

        System.out.println( !(5 > 4)||4 < 8);
        System.out.println(!( 10 > 5));
        System.out.println  (!(80>70 || 50<=50) && 3 > 2 );

    }
}
