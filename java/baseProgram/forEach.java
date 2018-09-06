package baseProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author duke_coding@163.com
 * @date 2018/8/21 15:10
 */
public class forEach {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i=0; i<100; i++)
            a[i] = i;
        // 普通for循环
        for (int i=0; i <100 ; i++)
            System.out.println(a[i]);
        // foreach循环会遍历数组中的每个元素，而不需要使用下标值
        for (int element: a)
            System.out.println(element);
        // Arrays的toString方法可以返回一个包含数组元素的字符串
        System.out.println(Arrays.toString(a));

    }
}