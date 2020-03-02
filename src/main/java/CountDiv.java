public class CountDiv {
    public static void main(String... args){
        CountDiv frogRiverOne = new CountDiv();
//        System.out.println(frogRiverOne.solution(11,345,17));
        System.out.println(frogRiverOne.solution(6,11,2));
    }

    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int start = K*(A%K > 0?A/K+1:A/K);
        int count = (B - start) / K;
        if (start >= A && start <= B)
            count++;
        return count;
//        another solution
//        return (B/K) - (A/K) + (A%K == 0 ? 1 : 0);
    }
}
