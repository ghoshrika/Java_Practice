//Implementation of Linked List using Collections Framework.....

import java.util.*;

public class linked_list1 {
    public static void main(String[] args) {
        LinkedList<String>L1 = new LinkedList<String>();

        L1.addFirst("Ghosh");
        L1.addFirst("Rika");
        L1.addFirst("Hii");
        System.out.println("-----List-----");
        System.out.println(L1);

        L1.addLast("From");
        L1.addLast("Bankura");
        System.out.println("-----New List-----");
        System.out.println(L1);

        System.out.println("Size of LinkedList: " + L1.size());

        //Print the LinkedList using for loops.
        for(int i=0; i<L1.size(); i++){
            System.out.print(L1.get(i) + "->");
        }
        System.out.println("NULL");
        
        L1.removeFirst();
        System.out.println("-----After removing first element-----");
        System.out.println(L1);

        L1.removeLast();
        System.out.println("-----After removing last element-----");
        System.out.println(L1);

        L1.remove(2);
        System.out.println(L1);
    }
}
