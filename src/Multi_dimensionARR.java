public class Multi_dimensionARR {
    public static void main(String[] args) {

        int[] [] number={{ 1, 2, 3 },{4,5,6} };
                        //index o         1
        /*System.out.println(number[1][0]);
        System.out.println(number [1][1]);*/
        char[][]charArray1={ {'a', 'b', 'c'}, {'z', 'y', 'z'}};
        char[][]charArr=new char[3][3];
        charArr[0][0]='a';
        charArr[0][1]='b';
        charArr[0][2]='c';
        charArr[1][0]='x';
        charArr[1][1]='y';
        charArr[1][2]='z';
        System.out.println(charArray1[0][0]+" "+charArr[0][0]);
        System.out.println(charArray1[1][0] + ""+charArr[1][0]) ;


        char[][]charArray2 ={{'A', 'B', 'C'},{'X', 'Y', 'Z'}};
        for (int i = 0; i < charArray2.length; i++){
            for( int j=0; j <=charArray2.length; j++){
                System.out.print(charArray2[i][j]);
            }
        }

    }
}
