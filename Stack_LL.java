//Implementation of Stack using LinkedList....

public class Stack_LL {
    static class Node{
        int data;
        Node next;
        //Creating constructor
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack{
        public static Node head; //head of linkedlist and top of stack
        public static boolean isEmpty(){
            return head==null;
        }

        //push function
        public static void push(int data){
            //Create new node
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //pop function.
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek function
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }  
    }
    public static void main(String[] args) {
            Stack st = new Stack();
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            System.out.println("Pop Element: " + st.pop());
            System.out.println("Peek Element: " + st.peek());

            //Print Stack
            while(! st.isEmpty()){
                System.out.println(st.peek());
                st.pop();
            }
        }
}