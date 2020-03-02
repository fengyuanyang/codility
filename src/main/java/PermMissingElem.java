import java.util.Arrays;

public class PermMissingElem {
    public static void main(String... args){
        PermMissingElem missingElem = new PermMissingElem();
        int A[] = {2,3,1,5};
        System.out.println(missingElem.solution(A));
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int current = 1;
        for (int i:A){
            if (i != current)
                return current;
            current++;
        }
        return current;
    }
}
