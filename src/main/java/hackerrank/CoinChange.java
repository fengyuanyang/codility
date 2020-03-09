package hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CoinChange {
    // Complete the marcsCakewalk function below.
    public static long getWays(int n, List<Long> c) {
        // Write your code here
        Collections.sort(c);
        for (Long l: c) {
            System.out.print(l);
        }
        return 1L;

    }
    public static long subWays(Long total, List<Long> type) {
        return 2L;
    }

    public static void main(String[] args) throws IOException {
//        int[] calorie = {504,378,291,380,728,630,797,212,32,792,895,635,850,853,859,127,653,655,476,748};

//        Long[] calorie = {2L,5,3,6};
        List<Long> list = new ArrayList<>();
        list.add(2L);
        list.add(5L);
        list.add(3L);
        list.add(6L);
        System.out.println(getWays(10, list));
    }
}
