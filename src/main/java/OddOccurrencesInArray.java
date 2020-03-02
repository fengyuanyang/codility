import java.util.HashMap;

public class OddOccurrencesInArray {
    public static void main(String... args){
        OddOccurrencesInArray oddOccurrencesInArray = new OddOccurrencesInArray();
        int[] A = {9,3,9,3,9,7,9};
        System.out.println(oddOccurrencesInArray.solution(A));
    }

    public int solution(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Boolean> intMap = new HashMap<Integer, Boolean>();
        int unpaired = 0;
        for (int a: A){
            intMap.put(a, intMap.containsKey(a)?!intMap.get(a): false);
        }
        for (Integer key : intMap.keySet()) {
            if (intMap.get(key) == false){
                unpaired = key;
                break;
            }
        }
        return unpaired;
    }
}
