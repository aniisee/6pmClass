import java.util.Arrays;

public class Arr_Part2 {
    public static void main(String[] args) {
//        int [] numbers=new int[3];
//        numbers[0]=10;
//        numbers[1]=20;
//        numbers[2]=30;
//
//        numbers[1]=40;
//
//        System.out.println(numbers[1]);
//
//
//        //int numbers2[]={10, 20 , 30, 40,50};
//
//
//        char[]chaArr={'a', 's', 't', 'Q','A'};
//
//        double [] doubleArr=new double[5];
//        doubleArr[0]=10.10;
//        doubleArr[2]=330.10;
//        doubleArr[3]=14.10;
//        doubleArr[4]=1330.10;
//        doubleArr[5]=15.50;


       /* //for loop
        String []names={"Anisa", "Naj", "Adam", "Jack","Dan"};

        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        //for each
        for(String name:names){
            System.out.println(name);
        }*/

        /*int []nums={ 1, 2, 45, 65, 88, 98, 32, 21};
        for (int i:nums){
            Arrays.sort(nums);
            System.out.println(i);
        }

        char[]charArr={ 'a', 's','t','Q', 'A', 'b', 'r'};
        Arrays.sort(charArr);
        for (char c : charArr)
        System.out.println(c);*/

       /* int[] numbs = {4, 5, 8, 1, 3, 1, 9, 2, 6, 4, 0};
        //How to sort an array in a way that sorts even and odd numbers:
        int oddArr =1;
        int evenArr = 0;
        Arrays.sort(numbs);
        for (int i: numbs){
            if(i%2==0){
                evenArr =i;
                System.out.println(evenArr+ " ");
        }
            if(i%2!=0){
                oddArr=i;
                System.out.println(oddArr+ " ");
            }


    }*/


        int [] numbs={3, 4, 8, 9,7,22,44};
       /*int  max= 0;
        for(int i :numbs){
            if(i>max){
                max=i;
            }*/
        Arrays.sort(numbs);
        for(int i :numbs){
            System.out.println(i+ ",");
        }
        System.out.println("Min is "+ numbs[0]);
        System.out.println("Max is" + numbs[numbs.length-1]);

        }

}







