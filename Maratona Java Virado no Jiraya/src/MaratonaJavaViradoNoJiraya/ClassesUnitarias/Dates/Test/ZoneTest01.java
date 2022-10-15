package MaratonaJavaViradoNoJiraya.ClassesUnitarias.Dates.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        var shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");

        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime  zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        var zonedDateTime1 = nowInstant.atZone(tokyoZone);
        System.out.println(zonedDateTime1);

    }
}
