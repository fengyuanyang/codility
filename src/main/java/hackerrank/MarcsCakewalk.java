package hackerrank;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class MarcsCakewalk {
    // Complete the marcsCakewalk function below.
    static long marcsCakewalk(int[] calorie) {
        long sum = 0;
        Arrays.sort(calorie);
        long maxPow = 1;
        for (int i=calorie.length-1;i>=0;i--){
            sum = sum + maxPow*calorie[i];
            maxPow*=2;
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
//        int[] calorie = {504,378,291,380,728,630,797,212,32,792,895,635,850,853,859,127,653,655,476,748};
        int[] calorie = {819,701,578,403,50,400,983,665,510,523,696,532,51,449,333,234,958,460,277,347,950,53,123,227,646,190,938,61,409,110,61,178,659,989,625,237,944,550,954,439};
        System.out.println(marcsCakewalk(calorie));
    }
}
