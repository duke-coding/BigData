package baseProgram;
import java.util.*;
/**
 * @author duke_coding@163.com
 * @date 2018/8/24 15:47
 */
public class LotteryDrawing {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("本期中奖号码为多少个？");
        int k = in.nextInt();

        System.out.print("本期彩票大小最大不超过多少？");
        int n = in.nextInt();

        int[] numbers = new int[n];
        for (int i=0; i< numbers.length; i++)
            numbers[i] = i +1;

        int[] result = new int[k];
        for (int i=0; i<result.length; i++){
           int r = (int)(Math.random() * n);
           result[i] =numbers[r];
           numbers[r] = numbers[n-1];
           n --;
        }

        Arrays.sort(result);
        System.out.println("本期中奖号码如下：");
        for (int r: result)
            System.out.println(r);

    }
}
