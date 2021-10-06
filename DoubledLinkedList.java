/**
 * Double Linked List node based on value
 */
public class DoubledLinkedList {
    static Node head;
     static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
           this.data = data;
        }
    }

    private void delete(int value){
         int  count= 0;
         Node temp = head;
         if(temp.data==value){
             //Node tmp = head.next;
             temp = temp.next;
             head = temp;
             return;
         }
         while(temp!=null){
             if(temp.data==value){
                 Node next  = temp.next;
                 Node prev =  temp.prev;
                 prev.next=next;
                 next.prev=prev;
                 break;
                 //count = count+1;
                 /*temp.next=next;
                 temp.prev=prev;*/
             }
             temp=temp.next;
         }
    }
    private void push(int value){
        Node new_node = new Node(value);
        new_node.next = head;
        new_node.prev = null;
        if(head!=null){
            head.prev=new_node;
        }
        head = new_node;

    }

     private void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        DoubledLinkedList list = new DoubledLinkedList();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(30);
        list.push(30);
        list.push(50);

        list.printList(head);
        list.delete(30);
        list.printList(head);
        list.delete(50);
        list.printList(head);

    }
}
