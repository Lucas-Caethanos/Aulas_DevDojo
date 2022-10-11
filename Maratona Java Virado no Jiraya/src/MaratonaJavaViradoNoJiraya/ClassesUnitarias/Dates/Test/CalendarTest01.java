package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Dates.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); //É uma classe abstrata

        if(c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o 1° dia da semana");
        }

        Date date = c.getTime();
        System.out.println(date);

    }
}
