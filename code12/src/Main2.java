import com.github.mfathi91.time.PersianDate;
import com.github.mfathi91.time.PersianDateTime;
import com.github.mfathi91.time.PersianMonth;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main2 {

    public static void main(String[] args) {
        // Instantiate
        PersianDate today = PersianDate.now();
        PersianDate persianDate1 = PersianDate.of(1396, 7, 15);
        PersianDate persianDate2 = PersianDate.of(1396, PersianMonth.MEHR, 15);
        System.out.println(today);

        // Convert
        PersianDate persianDate5 = PersianDate.of(1397, 5, 11);
        LocalDate gregDate = today.toGregorian();    // => '2018-08-02'
        System.out.println(gregDate);
        PersianDate persianDate6 = PersianDate.fromGregorian(gregDate);  //  => '1397/05/11'

        // Parse
        PersianDate persianDate3 = PersianDate.parse("1400-06-15");    // From the standard format
        PersianDate persianDate4 = PersianDate.parse("1400/06/15", DateTimeFormatter.ofPattern("yyyy/MM/dd"));    // From a desired format

        // Format
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        dtf.format(PersianDate.now());    // => e.g. '1396/05/10'

        // Instantiate
        PersianDateTime now = PersianDateTime.now();    // => 'now' will contain the instantiated date and time
        PersianDateTime persianDateTime2 = PersianDateTime.of(PersianDate.of(1400, PersianMonth.DEY, 15), LocalTime.of(17, 55, 19));
        PersianDateTime persianDateTime3 = PersianDateTime.of(1400, PersianMonth.DEY, 15, 17, 55, 19);

        // Parse
        PersianDateTime persianDateTime4 = PersianDateTime.parse("1401-06-10T08:35:11");    // From the standard format
        PersianDateTime persianDateTime5 = PersianDateTime.parse("1400-06-15_11-38-43", DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));    // From a desired format

        // Format
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        dtf.format(PersianDateTime.now());    // => e.g. '1396/05/10 14:05:11'
    }
}
