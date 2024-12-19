import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class timeSolving {


    public static String timeConversion(String s) {
        // Write your code here

        DateTimeFormatter input = DateTimeFormatter.ofPattern("hh:mm:ssa");
        DateTimeFormatter output = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime t = LocalTime.parse(s,input);

        String format = t.format(output);


        return format;

    }
    public static void main(String[] args) {

        System.out.println(timeConversion("07:05:45PM"));


    }
}
