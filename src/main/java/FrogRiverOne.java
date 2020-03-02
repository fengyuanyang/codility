import java.util.HashSet;

public class FrogRiverOne {
    public static void main(String... args){
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        int A[] = {1,3,1,4,2,3,5,4};
        System.out.println(frogRiverOne.solution(5, A));
    }

    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> path = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X)
                path.add(A[i]);

            if (path.size() == X)
                return i;
        }

        return -1;
    }
}
