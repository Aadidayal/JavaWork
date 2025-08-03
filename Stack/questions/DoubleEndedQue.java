
class DequeNode {
    int data;
    DequeNode prev, next;

    DequeNode(int data) {
        this.data = data;
    }
}

class CustomDeque {
    private DequeNode front, rear;

    public void addFront(int data) {
        DequeNode node = new DequeNode(data);
        if (front == null) {
            front = rear = node;
        } else {
            node.next = front;
            front.prev = node;
            front = node;
        }
    }

    public void addRear(int data) {
        DequeNode node = new DequeNode(data);
        if (rear == null) {
            front = rear = node;
        } else {
            node.prev = rear;
            rear.next = node;
            rear = node;
        }
    }

    public void removeFront() {
        if (front == null) return;
        front = front.next;
        if (front != null) front.prev = null;
        else rear = null;
    }
  
    public void removeRear() {
        if (rear == null) return;
        rear = rear.prev;
        if (rear != null) rear.next = null;
        else front = null;
    }

    public void printDeque() {
        DequeNode current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class DoubleEndedQue {
    public static void main(String[] args) {
        CustomDeque deque = new CustomDeque();
        deque.addFront(10);
        deque.addRear(20);
        deque.addFront(5);
        deque.addRear(25);

        System.out.print("Deque: ");
        deque.printDeque();

        deque.removeFront();
        deque.removeRear();

        System.out.print("Deque after removals: ");
        deque.printDeque();
    }
}
