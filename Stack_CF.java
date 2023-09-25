// Implementation of Stack using Collection Framework

import java.util.*;
public class Stack_CF {
    public static void main(String[] args) {
        Stack<Integer>s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(! s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
