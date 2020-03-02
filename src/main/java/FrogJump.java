
public class FrogJump {
    public static void main(String... args){
        FrogJump frogJump = new FrogJump();
        System.out.println(frogJump.solution(10, 85, 30));
    }

    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int distance = Y - X;
        int leftDistance = distance % D;
        int necessaryJmp = distance / D;
        int additionalJmp = leftDistance > 0?1:0;

        return necessaryJmp + additionalJmp;
    }
}
