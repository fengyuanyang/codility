package leetcode;

public class ImplementStrStr {
    public static void main(String... args){
        System.out.println(ImplementStrStr.implement("apple is not banana", "an"));
    }

    public static int implement(String haystack, String needle) {
        if ("".equals(needle) || needle == null)
            return 0;
        int hayLen = haystack.length();
        int needleLen = needle.length();

        char[] hayArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();

        for (int i=0;i< hayLen - needleLen + 1; i++) {
            boolean found = true;
            for (int j=0;j<needleLen;j++) {
                if (hayArray[i+j] != needleArray[j]){
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }
}
