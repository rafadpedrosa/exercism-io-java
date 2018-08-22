import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    LocalDateTime dateTime;

    Gigasecond(LocalDate birthDate) {
        dateTime = LocalDateTime.of(birthDate.getYear(), birthDate.getMonth(), birthDate.getDayOfMonth(), 0, 0);
    }

    Gigasecond(LocalDateTime birthDateTime) {
        dateTime = LocalDateTime.of(birthDateTime.getYear(), birthDateTime.getMonth(), birthDateTime.getDayOfMonth(), birthDateTime.getHour(), birthDateTime.getMinute(), birthDateTime.getSecond());
    }

    LocalDateTime getDate() {
        return dateTime.plusSeconds(1000000000);
    }


    // pretty solution 
    //    private final LocalDateTime gigadate;
    //
    //    Gigasecond(LocalDate birthDate) {
    //        this(birthDate.atStartOfDay());
    //    }
    //
    //    Gigasecond(LocalDateTime birthDateTime) {
    //        gigadate = birthDateTime.plusSeconds(1_000_000_000);
    //    }
    //
    //    LocalDateTime getDate() { return gigadate; }
}
