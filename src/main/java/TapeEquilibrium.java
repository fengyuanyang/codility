import java.util.Arrays;

public class TapeEquilibrium {
    public static void main(String... args){
        TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();
        int A[] = {-200,2000, 200};
        System.out.println(tapeEquilibrium.solution(A));
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;
        for (int i = 0; i < A.length; i++)
            sum += A[i];

        int minDiff = Integer.MAX_VALUE;
        int subSum = 0;
        int next;
        // last value in array should be ignored
        for (int i=0;i<A.length-1;i++){
            subSum += A[i];
            next = sum - subSum;
            minDiff = Math.min(minDiff, Math.abs(subSum - next));
        }
        return minDiff;
    }
}
