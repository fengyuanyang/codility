import java.util.HashMap;
import java.util.Stack;

public class Brackets {
    public static void main(String... args){
        Brackets brackets = new Brackets();
//        System.out.println(frogRiverOne.solution(11,345,17));
//        int A[] = {1,5,2,1,4,0};
        System.out.println(brackets.solution("{[()()]}"));
        System.out.println(brackets.solution("([)()]"));

    }

    public int solution(String S) {
        // write your code in Java SE 8
        HashMap<Character, Character> reverse = new HashMap<>();
        reverse.put('}', '{');
        reverse.put(']', '[');
        reverse.put(')', '(');
        S.replace("IV", "");
        Stack<Character> stacks = new Stack<>();
        char[] chars = S.toCharArray();
        for (char character: chars){
            if (stacks.size() != 0 && reverse.containsKey(character) && stacks.peek() == reverse.get(character))
                stacks.pop();
            else
                stacks.push(character);
        }

        return stacks.size() == 0?1:0;
    }
}
