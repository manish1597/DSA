package Stack;

import java.util.Stack;

public class Add_Bottom_of_Stack {

    public static void pushAtBottom(Stack<Integer>s,int data){
        //Base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s,4);
        while (!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
