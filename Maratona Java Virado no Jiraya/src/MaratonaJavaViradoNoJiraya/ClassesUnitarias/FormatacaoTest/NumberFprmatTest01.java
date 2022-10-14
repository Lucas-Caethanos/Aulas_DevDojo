package MaratonaJavaViradoNoJiraya.ClassesUnitarias.FormatacaoTest;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFprmatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localePT = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeIT);
        nfa[3] = NumberFormat.getInstance(localePT);

        double valor = 100_000.2130;

        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
            System.out.println();
        }


    }
}
