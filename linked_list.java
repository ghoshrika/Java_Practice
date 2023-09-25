public class linked_list {
    Node head;
    private int size;
    //constructor of our class and initialize size as 0.
    linked_list(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        // Create a constructor.
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Adding element in linkedlist(1st, last)
    public void addFirst(String data){
        // create a new node
        Node newNode = new Node(data);
        //Checking if there exit any node in linkedlist or not
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        // create a new node
        Node newNode = new Node(data);
        //Checking if there exit any node in linkedlist or not
        if(head == null){
            head = newNode;
            return;
        }
        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    // Print list
    public void printList(){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    // Delete element from linkedlist(1st, last)
    public void deleteFirst(){
        if(head == null){
            System.out.println("The List is Empty");
            return;
        }
        size--;
        head = head.next; //Head points to next node and connection from 1st node is cut
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("The List is Empty");
            return;
        }
        size--;
        if(head.next == null){ //If there is only one element in list. 
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        //Traverse the list.
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    //function to get size.
    public int getsize(){
        return size;
    }



    public static void main(String[] args) {
        // Create an object of linked_list class
        linked_list list = new linked_list();
        list.addFirst("Ghosh.");
        list.addFirst("Rika");
        list.addFirst("Hi");
        System.out.println("-----After add elements.-----");
        list.printList();

        list.addLast(" Age");
        list.addLast("24");
        list.addLast("I");
        list.addLast("am");
        System.out.println("-----After add elements in last-----");
        list.printList();

        list.deleteFirst();
        System.out.println("-----After delete First Element-----");
        list.printList();

        list.deleteLast();
        list.deleteLast();
        System.out.println("-----After delete last element-----");
        list.printList();

        System.out.println("-----Size of the list-----");
        System.out.println(list.getsize());
        list.addFirst("Hello!");
        list.printList();
        System.out.println("-----New Size of the list-----");
        System.out.println(list.getsize());
    }
}
