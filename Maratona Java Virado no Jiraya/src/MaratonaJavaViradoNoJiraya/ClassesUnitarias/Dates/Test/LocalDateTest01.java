package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Dates.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2022, Month.JANUARY,27);
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfMonth());

    }
}
