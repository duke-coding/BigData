package baseProgram;
import java.util.*;

/**
 * @author duke_coding@163.com
 * @date 2018/8/21 10:12
 */
public class Retirement {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("挣多少钱退休？");
        double goal = in.nextDouble();

        System.out.println("年薪能到多少？");
        double payment = in.nextDouble();

        System.out.println("税率是 % ");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years=0;
        // 普通while循环
        while (balance < goal){
            balance += payment;
            double interrest = balance * interestRate/100;
            balance += interrest;
            years ++;
        }

        System.out.println("你可以在"+years+"年后退休！");
    }
}
