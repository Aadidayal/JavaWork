package LinkList;

public class CLL {
    private Node head;
    private Node tail;

    CLL() {
        this.head = null;
        this.tail = null;
    }

    private class Node {
        int value;
        Node next;

        Node(int val) {
            this.value = val;
        }
    }

    public void Insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void DeleteInMid(int val) {
        Node node = head;
        if (head == null) {
            return;
        }
        if (node.value == val) {
            head = head.next;
            tail.next = head;
        }

        do {
            Node n = node.next;
            if (n.value == val) {
                node.next = n.next;
                break;
            }
            node = node.next;
        } while (node != head);
    }

    public void Display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        } while (temp != head); // Stop when we reach the head again

        System.out.println("(Back to Head)");
    }

}
