package Stack;

import java.util.Stack;

public class Valid_Parenthesis {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;// if contain only closing brackets )))))}} hence stack is empty
                }
                if
                ((s.peek() == '(' && ch == ')') ||
                        s.peek() == '{' && ch == '}' ||
                        s.peek() == '[' && ch == ']') {
                    s.pop();
                } else {
                    return false;

                }
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String str="({})[]";
        String str1="[]";
        System.out.println(isValid(str1));

    }

}
