package baseProgram;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

/**
 * @author duke_coding@163.com
 * @date 2018/9/3 16:48
 */
public class date {
    public static void main(String[] args)
    {
//        System.out.println(new Date());
//        String s = new Date().toString();
//        System.out.println(s);

//        Date birthday = new Date();
//        System.out.println(birthday);
//        Date deadline;
//        deadline = new Date();
//        System.out.println(deadline);

//        Date deadline,birthday;
//        deadline = null;
//
//        if (deadline != null)
//            System.out.println(deadline);
//        birthday =null;
//        String s =birthday.toString();
//        Date deadline;
//        Date birthday = new Date();
//        deadline = birthday;
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2001,1,13));
        LocalDate newYearsEve = LocalDate.of(2001,1,13);
        LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);
        int year = aThousandDaysLater.getYear();
        int month = aThousandDaysLater.getMonthValue();
        int day = aThousandDaysLater.getDayOfMonth();
        System.out.print(year+"-"+month+"-"+day);









    }
}
