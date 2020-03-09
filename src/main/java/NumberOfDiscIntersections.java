import java.util.HashMap;

public class NumberOfDiscIntersections {
    public static void main(String... args){
        NumberOfDiscIntersections numberOfDiscIntersections = new NumberOfDiscIntersections();
//        System.out.println(frogRiverOne.solution(11,345,17));
        int A[] = {1,5,2,1,4,0};
        System.out.println(numberOfDiscIntersections.solution(A));
    }

//    56%
    public int solution(int[] A) {
        // write your code in Java SE 8
        int intersectionsCnt = 0;
        for (int i=0;i<A.length-1;i++){
            int lefti = i - A[i];
            int righti = i + A[i];
            for (int j=i+1;j<A.length;j++) {
                int leftj = j - A[j];
                int rightj = j + A[j];
                System.out.println("[" + i + "]" + lefti + " to " + righti +", " + "[" + j + "]" + leftj + " to " + rightj);
                if ((leftj >= lefti && leftj <= righti) || (lefti >= leftj && lefti <= rightj)){
                    System.out.println("*** " + "[" + i + "]" + lefti + " to " + righti +", " + "[" + j + "]" + leftj + " to " + rightj);
                    intersectionsCnt++;
                }
                if(intersectionsCnt > 10000000) return -1;
            }
        }
        return intersectionsCnt;
    }
}
