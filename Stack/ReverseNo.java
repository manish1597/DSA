package Stack;

import java.util.Stack;

public class ReverseNo {
    public static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse(s);
        insertAtBottom(s, top);
    }

    private static void insertAtBottom(Stack<Integer> s, int value) {
        if (s.isEmpty()) {
            s.push(value);
            return;
        }
        int top = s.pop();
        insertAtBottom(s, value);
        s.push(top);
    }


    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);


        reverse(s);
        while (!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
