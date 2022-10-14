package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Dates.Test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(22,32,12);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

    }
}
