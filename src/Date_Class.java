import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_Class {
    public static void main(String[] args) {
//        LocalDate date=LocalDate.now();
//        LocalTime time= LocalTime.now();
//        System.out.println(time.getHour()+ " "+time.getMinute());
//
//        System.out.println(date);
//        System.out.println(time.toString().substring(0,8));



//        System.out.println(dateTime.getDayOfMonth());
//        System.out.println(dateTime.getDayOfWeek());
//        System.out.println(dateTime.getDayOfMonth());

        // yyyy-MM-dd   2022-02-02
        //dd/MM/yyyy    02/02/2022
        //E, MMM dd yyyy  Wed, Feb 02, 2022



        LocalDateTime dateTime= LocalDateTime.now();
        DateTimeFormatter format=DateTimeFormatter.ofPattern(" E, MM-dd-yyyy HH:mm:ss");
        String dateFormat=dateTime.format(format);
//        System.out.println("before: "+dateTime);
        System.out.println(dateFormat);


    }
}
