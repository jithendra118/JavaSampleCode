
public class LinkedListImpl {
    static LinkedListImpl.Node head1, head2;
    public static void main(String[] args) {
        LinkedListImpl list  = new LinkedListImpl();
        list.head1 = new Node(1);  // 1 -> 2 -> 3
        list.head1.next = new Node(2);
        list.head1.next.next = new Node(3);

        list.head2 = new Node(4); // 4 -> 5 -> 6
        list.head2.next = new Node(5);
        list.head2.next.next = new Node(6);

        System.out.println(addLinkedList(head1, head2));

    }

    private static Node addLinkedList(Node node, Node node1) {
        int sum = 0;
        Node res=null;
        Node temp = null;
        Node prev = null;
        //Node second = null;
        while (node != null && node1 != null) {
            sum = node.data + node1.data;
            //temp.data = sum;
            //temp.next = temp;

            temp=new Node(sum);
            if (res == null) {
                res = temp;
            }

            // If this is not the first
            // node then connect it to the rest.
            else {
                prev.next = temp;
            }
            prev = temp;  // prev  value should be used in next iteration and this value should be current value at time of assigning
            node = node.next;
            node1 = node1.next;
            //temp=temp.next;
        }

        return res;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }
}