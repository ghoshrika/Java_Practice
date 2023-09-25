import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main(String[] args) {
        
        // create Integer ArrayList.
        ArrayList<Integer>list = new ArrayList<>();

        // add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("ArrayList is:: " + list);

        // Get element
        int element = list.get(0);
        System.out.println(element);

        //Add element at any index
        list.add(4,8);
        System.out.println("After adding one element: " + list);

        // Set Element. replece a element with new element.
        list.set(0,10);
        System.out.println("After Set an element: " + list);

        // Delete element
        list.remove(4);
        System.out.println("After Delete the element from Index 4: " + list);

        // Print the size of ArrayList.
        System.out.println("Size of ArrayList:: " + list.size());

        //Print elements using loops
        System.out.println("----------Elements----------");
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Sorting 
        Collections.sort(list);
        System.out.println(list);
    }
}
