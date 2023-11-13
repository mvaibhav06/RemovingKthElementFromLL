public class FindingKthElementFromLL {

    public static LinkedList.Node findingKthElement(int k, LinkedList.Node head){
        LinkedList.Node prev = head;
        LinkedList.Node after = head;

        for (int i=0; i<k; i++){
            if (after.next==null) return null;
            after = after.next;
        }

        if (after==null){
            return head.next;
        }

        while (after.next!=null){
            prev = prev.next;
            after = after.next;
        }
        return head;
    }

    public static void main(String[] args) {
        LinkedList mylist = new LinkedList(1);
        mylist.append(2);
        mylist.append(3);
        mylist.append(4);
        mylist.append(5);
        mylist.append(6);

        LinkedList.Node temp = findingKthElement(2,mylist.head);
        System.out.println(temp.value);
    }
}
