package MaratonaJavaViradoNoJiraya.ClassesUnitarias.FormatacaoTest;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        //pt-BR
        Locale localeJapão = new Locale("ja", "JP");
        Locale localeCH = new Locale("it", "CH");
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeJapão);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeCH);
        System.out.println("Japão: " + df1.format(calendar.getTime()));
        System.out.println(localeJapão.getDisplayCountry(localeJapão));
        System.out.println("Suiça: " + df2.format(calendar.getTime()));
        System.out.println(localeCH.getDisplayCountry(localeCH));
    }
}
