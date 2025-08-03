package LinkList;

public class LL1st {
    private Node head;
    private Node tail;
    private int size;

    LL1st() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void FirstPositionOnly(int val) {
        Node Newnode = new Node(val);
        Newnode.next = head;
        head = Newnode;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void LastPOsitionInsert(int val) { // constant o(n)
        if (tail == null) {
            FirstPositionOnly(val);
            return;
        }

        Node Newnode = new Node(val);
        tail.next = Newnode;
        tail = Newnode;
        size++;
    }

    public void InsertAtMid(int val, int index) {
        if (index == 0) {
            FirstPositionOnly(val);
            return;
        }
        if (index == size) {
            LastPOsitionInsert(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size++;
    }



// ##############################################################################
public void insertRec(int val, int index){
head = InserRec(val, index, head);
}
private Node InserRec(int val, int index, Node node){
    if(index==0){
        Node temp = new Node(val,node);
        size++;
        return temp;
    }
   node.next= InserRec(val, index--, node.next);
   return node; 
}


    public int DeleteFirst() {
        int val = head.value; // to return the value that is being removed
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    // FOR DELETE LAST WE NEED TO REACH TILL 2ND LAST
    public Node get(int index) {
        Node Newnode = head;
        for (int i = 0; i < index; i++) {
            Newnode = Newnode.next;
        }
        return Newnode;
    }

    public int DeleteLast() {
        if (size <= 1) {
            return DeleteFirst();
        }
        Node SecondLast = get(size - 2);
        int val = tail.value;
        tail = SecondLast;
        tail.next = null;
        return val;
    }

    // OR FOR DeleteLast we can do in 1 single function
    public int DeleteLast2() {
        if (size <= 1) {
            return DeleteFirst();
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        int val = tail.value;
        tail = temp;
        tail.next = null;
        size--;

        return val;
    }

    public int Delete(int index) {
        if (index == 0) {
            return DeleteFirst();
        }
        if (index == size - 1) {
            return DeleteLast();
        }
        Node prev = head;
        for (int i = 1; i < index; i++) {
            prev = prev.next;
        }
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node find(int value) {
        Node temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

}
