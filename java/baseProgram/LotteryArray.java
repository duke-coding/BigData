package baseProgram;

/**
 * @author duke_coding@163.com
 * @date 2018/8/29 21:58
 */
public class LotteryArray
{
    public static void main(String[] args)
    {
        final int NMAX = 10;

        //分配三角形数组
        int[][] odds = new int[NMAX+1][];
        for (int n = 0; n <= NMAX; n++)
            odds[n] = new int[n + 1];

        //填充三角形区域
        for (int n=0; n < odds.length; n++)
            for (int k=0; k<odds[n].length ; k++)
            {
                //计算二项式系数 n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
                int lotteryOdds =1;
                for (int i=1 ; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n-i+1)/ i;

                odds[n][k] = lotteryOdds;
            }

            //打印三角区域
            for (int[] row : odds)
            {
                for (int odd : row)
                    System.out.printf("%4d",odd);
                System.out.println();
            }
    }
}
