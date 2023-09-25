//Implementation Stack Using ArrayList....


import java.util.*;
public class Stack_AL {
    static class Stack1{
        static ArrayList <Integer> L = new ArrayList<>();
        public static boolean isEmpty(){
            return L.size() == 0;
        }
        
        //Push function
        public static void push(int data){
            L.add(data);
        }

        //Pop function
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = L.get(L.size()-1);
            L.remove(L.size()-1);
            return top;
        }

        //Peek function
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return L.get(L.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack1 s1 = new Stack1();
        s1.push(5);
        s1.push(15);
        s1.push(25);
        s1.push(35);

         //Print Stack
         while(! s1.isEmpty()){
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}