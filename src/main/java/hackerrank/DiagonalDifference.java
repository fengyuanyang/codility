package hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    // Complete the marcsCakewalk function below.
    static long diagonalDifference(List<List<Integer>> arr) {
        int size = arr.size();
        int diagonalSum = 0;
        int reverseDiagonalSum = 0;

        for (int i = 0; i < size; i++){
            List<Integer> list = arr.get(i);
            diagonalSum += list.get(i);
            reverseDiagonalSum += list.get(size - i - 1);
        }
//        System.out.println(diagonalSum);
//        System.out.println(reverseDiagonalSum);

        return Math.abs(diagonalSum - reverseDiagonalSum);
    }

    public static void main(String[] args) {
        List<Integer> row1 = new ArrayList<>();
        row1.add(11);
        row1.add(2);
        row1.add(4);

        List<Integer> row2 = new ArrayList<>();
        row2.add(4);
        row2.add(5);
        row2.add(6);

        List<Integer> row3 = new ArrayList<>();
        row3.add(10);
        row3.add(8);
        row3.add(-12);

        List<List<Integer>> rows = new ArrayList<>();
        rows.add(row1);
        rows.add(row2);
        rows.add(row3);

        System.out.println(diagonalDifference(rows));
    }
}
