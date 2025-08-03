package Assignments;

public class DeleteHead {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    static Node convert(int[] arr) {
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
           current.next=temp;
           current=temp;
        }
        return head;
    }

    static int search(Node temp, int a) {
        while (temp != null) {
            if (temp.data == a) return 1;
            temp = temp.next;
        }
        return 0;
    }

    static void printLL(Node temp){
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

  Node DeleteHd(Node head){
        return head.next;

    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        Node head=convert(arr);
        printLL(head);
        System.out.println();
        DeleteHead del = new DeleteHead(); 
       head= del.DeleteHd(head);                
        
        printLL(head);
        
    }
}