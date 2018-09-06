package baseProgram;
import java.time.*;
/**
 * @author duke_coding@163.com
 * @date 2018/9/4 14:53
 */
public class EmployeeTest {
    public static void main(String[] args)
    {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("刘甲",75000,1991,1,1);
        staff[1] = new Employee("刘乙",50000,1991,2,2);
        staff[2] = new Employee("刘丙",30000,1991,3,3);

        for (Employee e : staff)
            e.raiseSalary(5);

        for (Employee e : staff)
            System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireDay="+e.getHireDay());
    }
}

