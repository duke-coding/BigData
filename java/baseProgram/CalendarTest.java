package baseProgram;
import java.time.*;
/**
 * @author duke_coding@163.com
 * @date 2018/9/4 13:40
 */
public class CalendarTest {
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today-1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value =weekday.getValue();

        System.out.println("星期一 星期二 星期三 星期四 星期五 星期六 星期天");
        for (int i=1; i< value; i++)
            System.out.print("       ");
        while (date.getMonthValue() == month)
        {
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == today)
                System.out.print("*  ");
            else
                System.out.print("    ");
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 1) System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1) System.out.println();
    }
}
