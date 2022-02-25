import java.util.Locale;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
//        String day1 = "Monday";
//        String day2 = "Tuesday";
//        String day3 = "Wednesday";
//        String day4 = "Thursday";
//        String day5 = "Friday";
//        String day6 = "Saturday";
//        String day7 = "Sunday";

        //Arrays:
//        String daysofWeek[]={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
//        System.out.println(daysofWeek[6]);
//        System.out.println(daysofWeek[1]);

//        String[]daysofWeek = new String[7];
//        daysofWeek[0]="Monday";
//        daysofWeek[1]="Tuesday";
//        daysofWeek[2]="Wednesday";
//        daysofWeek[3]="Thursday";
//        daysofWeek[4]="Friday";
//        daysofWeek[5]="Saturday";
//        daysofWeek[6]="Sunday";
//        System.out.println(daysofWeek[5]);
//        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        System.out.println(number[4]);

//        int[]number2=new int[9];
//        number2[0]=1;
//        number2[1]=2;
//        number2[2]=3;
//        number2[3]=4;
//        number2[4]=5;
//        number2[5]=6;
//        number2[6]=7;
//        number2[7]=8;
//        number2[8]=9;
//        System.out.println(number2[5]);
//
//        boolean[] bool=new boolean[2];
//        bool[0]=true;
//        bool[1]=false;
//        System.out.println(bool[1]);

//        String fruits[] = {"Pomegranade", "Apple", "Orange", "Mango", "Banana", "Cherries", "Pineapple"
//        };
//        System.out.println(fruits[0]);
//        System.out.println(fruits[1]);
//        System.out.println(fruits[2]);
//        System.out.println(fruits[3]);
//        System.out.println(fruits[4]);
//        System.out.println(fruits[5]);
//        System.out.println(fruits[6]);

//        String[] cities = new String[6];
//        cities[0] ="New York";
//        cities[1]="Miami";
//        cities[3]="Chicago";
//        cities[4]="Staten Island";
//        cities[5]="Brooklyn";
//
//        System.out.println(cities[0]);
//        String[]daysofWeek = new String[7];
//        daysofWeek[0]="Monday";
//        daysofWeek[1]="Tuesday";
//        daysofWeek[2]="Wednesday";
//       daysofWeek[3]="Thursday";
//        daysofWeek[4]="Friday";
//        daysofWeek[5]="Saturday";
//        daysofWeek[6]="Sunday";
//        for (String day: daysofWeek){
//            System.out.println(day.toUpperCase(Locale.ROOT));
//
//        for(int i=0; i < daysofWeek.length(); i++){
//            if(daysofWeek[i].equals("Saturday")|| day.equals("Sunday"))
//            System.out.println(daysofWeek[i]);


//        char[]charar={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'G', 'A'};
//        int total=0;
//       for(int i=0; i<charar.length; i++){
//           if(charar[i]=='A'|| charar[i]=='a'){
//               total++;
//           }
//       }
//        System.out.println(total);

        int[] number = {12, 23, 11, 46, 342, 1434, 435, 128, 1997};
        int max = 0;
        for (int i : number) {
            if (max < i) {
                max = i;
            }
        }
            System.out.println("max is"  + " " + max);

                int min=1997;
                for (int i :number){
                    if (min>i){
                        min=i;
                    }
                } System.out.println("min is"+ " "+ min);

    }
}

