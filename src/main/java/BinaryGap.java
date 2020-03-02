import sun.security.util.math.IntegerModuloP;

import java.util.StringTokenizer;

public class BinaryGap {
    public static void main(String... args){
        BinaryGap gap = new BinaryGap();
//        gap.solution(529 );
//        gap.solution(20 );
//        System.out.println(gap.solution(32 ));
        System.out.println(gap.solution(51712 ));

//        gap.solution(2147483647 );
//        gap.solution(1041);
//        System.out.println(gap.solution(6291457));
//        System.out.println((int)(Math.pow(2, 31) - 1));

    }

    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        String[] array = binaryString.split("1");
        int countOne = binaryString.length() - binaryString.replace("1", "").length();
        int maxZero = 0;
        int cnt =0;
        for (String str: array){
            if (cnt++ == countOne)
                break;
            maxZero = Math.max(maxZero, str.length());
        }
        return maxZero;
    }

}
