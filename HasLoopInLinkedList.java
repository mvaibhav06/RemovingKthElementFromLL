public class HasLoopInLinkedList {

    public boolean hasLoop(LinkedList.Node head){
        if (head==null) return false;
        LinkedList.Node fast = head;
        LinkedList.Node slow = head;
        //1 2 3 4 5 6
        while (fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("This is a program to detect if there is a cycle in the linked list");

    }
}
