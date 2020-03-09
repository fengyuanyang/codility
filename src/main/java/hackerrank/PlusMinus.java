package hackerrank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int zeroCnt = 0;
        int positiveCnt = 0;
        int negativeCnt = 0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]<0)
                negativeCnt++;
            else if (arr[i]>0)
                positiveCnt++;
            else
                zeroCnt++;
        }

        DecimalFormat df = new DecimalFormat("0.000000");
        double zeroFraction = (double)zeroCnt / arr.length;
        double positiveFraction = (double)positiveCnt / arr.length;
        double negativeFraction = (double)negativeCnt / arr.length;


        System.out.println(df.format(positiveFraction));
        System.out.println(df.format(negativeFraction));
        System.out.println(df.format(zeroFraction));
    }

    public static void main(String[] args) {
        int[] A = {-4,3,-9,0,4,1};
        plusMinus(A);
    }
}
