
public class FindingMiddleNodeInLinkedList {

    public LinkedList.Node middleNode(LinkedList.Node head) {
        LinkedList.Node fast = head;
        LinkedList.Node slow = head;

        while(fast.next != null  && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        if(fast.next==null){
            return slow;
        }
        slow = slow.next;
        return slow;
    }

    public static void main(String[] args) {
        System.out.println("This is a program to find out middle of linked list");
    }
}
