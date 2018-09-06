package baseProgram;

import java.util.Arrays;

/**
 * @author duke_coding@163.com
 * @date 2018/8/21 20:08
 */
public class array {
    public static void main(String[] args){
        // 不需要调用new
        int[] smallPrimes = {2,3,5,7,11,13,17};
        for (int element : smallPrimes)
            System.out.println(element);

        for (int element: new int[]{17,20,32,12,54})
            System.out.println(element);

        smallPrimes = new int[]{17,20,32,12,54};

        for (int element : smallPrimes)
            System.out.println(element);
        int[] luckyNumbers =smallPrimes;
        int[] copiedLuckNumbers = Arrays.copyOf(luckyNumbers,luckyNumbers.length);
        luckyNumbers = Arrays.copyOf(luckyNumbers,2 * luckyNumbers.length);
    }
}
