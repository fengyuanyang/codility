package hackerrank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LuckBalance {
    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        List<Integer> intList = new ArrayList<>();

        int totalLuck = 0;
        for ( int i =0; i<contests.length; i++){
            if (contests[i][1] == 0)
                totalLuck += contests[i][0];
            else
                intList.add(contests[i][0]);
        }

        Collections.sort(intList);

        for (int i = 0; i < intList.size(); i++ ){
                totalLuck += intList.get(i);
            if (!(i >= intList.size() - k)){
                totalLuck -= 2*intList.get(i);
            }
        }

        return totalLuck;
    }

    public static void main(String[] args) {
        int[][] contests = {
                {5,1},
                {2,1},
                {1,1},
                {8,1},
                {10,0},
                {5,0}};
        System.out.println(luckBalance(3, contests));
    }
}