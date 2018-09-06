package baseProgram;

import java.util.Arrays;

/**
 * @author duke_coding@163.com
 * @date 2018/8/24 18:50
 */
public class CompoundInterest {
    public static void main(String[] args){
//        int [][] magicSquare = {
//                {21,32,13,24},
//                {35,16,27,48},
//                {19,10,11,12},
//                {13,14,15,16}
//        };
//        for (int[] row : magicSquare)
//            for (int value: row)
//                System.out.println(value);
//
//         System.out.println(Arrays.deepToString(magicSquare));

        final double STARTRATE =10;
        final int NRATES = 6;
        final int NYEARS = 10;

        // 设置利率从10~15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;

        double[][] balances = new double[NYEARS][NRATES];

        //设置初始结余为10000
        for (int j = 0; j < balances[0].length; j++)
            balances[0][j] = 10000;

        //计算未来年数的利率
        for (int i = 1; i < balances.length; i++)
        {
            for ( int j = 0; j <balances[i].length ; j++)
            {
                //从上一行得到去年的余额
                double oldBalance = balances[i-1][j];

                //计算利率
                double interest = oldBalance * interestRate[j];

                //计算这一年的结余
                balances[i][j] = oldBalance + interest;
            }
        }

        // 打印利率
        for (int j = 0; j < interestRate.length ;j++)
            System.out.printf("%9.0f%%",100 * interestRate[j]);

        System.out.println();

        //打印结余表
        for (double[] row : balances)
        {
            //打印表行
            for (double b : row)
                System.out.printf("%10.2f",b);
            System.out.println();
        }
    }
}
