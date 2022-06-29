import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class DateTime {
    LocalDateTime datetime = LocalDateTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("yy-MM-dd-HH-mm");

    String CurrentDateTime(){
        return datetime.format(format);
    }

    void strToDateTime(String DateTime){
        this.datetime = datetime.parse(DateTime,format);
    }

    static long SubstractDT(DateTime dt1 , DateTime dt2){
        Duration duration = Duration.between(dt2.datetime,dt1.datetime);
        return duration.toMinutes();
    }
}
