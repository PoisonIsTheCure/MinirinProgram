import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class DateTime {
    LocalDateTime datetime = LocalDateTime.now();
    DateTimeFormatter format = DateTimeFormatter.ofPattern("yy-MM-dd-HH-mm");

    String getDateTime(){
        return datetime.format(format);
    }

    void strToDateTime(String DateTime){
        this.datetime = datetime.parse(DateTime,format);
    }

    static long SubstractDT(DateTime dt1 , DateTime dt2){
        Duration duration = Duration.between(dt2.datetime,dt1.datetime);
        return duration.toMinutes();
    }

    static String SubTostr(DateTime dt1, DateTime dt2){
        long duree = SubstractDT(dt1,dt2);
        if (duree < 0 ) System.err.println("Found a Negatif duration : "+duree);
        long hours = (int) duree/60;
        long minutes = duree%60;
        return DurationToStr(hours,minutes);
    }
    static String DurationToStr(long hours , long minutes) {
        String hour = String.valueOf(hours);
        if (hour.length()==1) hour = "0".concat(hour);
        String minute = String.valueOf(minutes);
        if (minute.length()==1) minute = "0".concat(minute);
        String total = hour.concat(":").concat(minute);
        return  total;
    }
}
