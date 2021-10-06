public class singleLinkedListInsertion {
    static Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // adding push into list.
    public Node push(int new_Data) {
        Node new_node = new Node(new_Data);
        new_node.next = head; // first element in the list
        head = new_node;
        return head;
    }

    // delete node based on key in list.
    public Node delete(int key) {
        Node temp = head;
        Node prev = null;

        while (temp != null && temp.data == key) {
            temp.next = head.next;
            head = temp;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp != null) {
            prev.next = temp.next;
        }
        return head;
    }

    // length of a list.
    public static int count() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // search element in list.
    public boolean search(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return true;
            } else {
                temp = temp.next;
            }
        }
        return false;
    }

    /* Utility function to print a linked list */

    void printList(singleLinkedListInsertion.Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }

    // it return value at particular index.
    public int getNthNode(int value){
        int count =0;
        Node temp = head;
        while(temp!= null){
            count++;
            if(count == value){
                return temp.data;
            }
            temp = temp.next;
        }
        return 0;
    }

    /*
        This will return value with index from end of the list.
     */
    public int getValueFromEndOfList(int value){
        int count = count();
        int find =  count-value+1;
        int length = 0;
        Node temp = head;
        while(temp!=null){
            length++;
            if(find == length){
                return temp.data;
            }
            temp = temp.next;
        }
        return 0;
    }

    /**
     *
     * @return middle int value data
     */
    public int getMiddleElement(){
        int count = count();
        Node temp = head;
        if(count<1){
            return 0;
        }
        int length,find = 0;
        if(count%2==0){//even
            length = (count/2)+1;
        }else{
            length = (count/2)+1;
        }
        while(temp!=null){
            find++;
            if(find == length){
                return temp.data;
            }
            temp = temp.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        singleLinkedListInsertion list = new singleLinkedListInsertion();
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);

        list.printList(head);
        //list.delete(30);
        list.printList(head);
        /*list.push(30);
        list.printList(head);*/
        System.out.println(list.count());
        System.out.println(list.search(30)==true?"element found in list":"Not found");
        System.out.println(list.getNthNode(3)!=0?"element is :"+list.getNthNode(3):"Not found :"+0);
        list.printList(head);
        System.out.println(list.getValueFromEndOfList(4));
        System.out.println(list.getMiddleElement());
    }
}
