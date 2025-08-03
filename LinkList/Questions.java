package LinkList;

public class Questions {
    private Node head;
    private Node tail;
    private int size;

    Questions() {
        this.size = 0;
    }

    private class Node {
        int value;
        Node next;

        Node(int val) {
            this.value = val;
        }

        Node(int val, Node next) {
            this.value = val;
            this.next = next;
        }
        Node (){

        }
    }

    public void FirstPositionOnly(int val) {
        Node Newnode = new Node(val);
        Newnode.next = head;
        head = Newnode;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void LastPOsitionInsert(int val) { // O(1) operation
        if (tail == null) {
            FirstPositionOnly(val);
            return;
        }

        Node Newnode = new Node(val);
        tail.next = Newnode;
        tail = Newnode;
        size++;
    }

    // ################################ Leetcode 83: Remove Duplicates ################################
    public void RemoveDuplicates() {
        Node node = head;
        while (node != null && node.next != null) { // Prevent NullPointerException
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
        tail = node;
        if (tail != null) {
            tail.next = null;
        }
    }

    // ################################## Leetcode 21: Merge Two Sorted Lists ##################################
    public static Questions Merge(Questions first, Questions second) {
        Node f = first.head;
        Node s = second.head;
        Questions Merged = new Questions();

        while (f != null && s != null) {
            if (f.value < s.value) {
                Merged.LastPOsitionInsert(f.value);
                f = f.next;
            } else {
                Merged.LastPOsitionInsert(s.value);
                s = s.next;
            }
        }

        while (f != null) {
            Merged.LastPOsitionInsert(f.value);
            f = f.next;
        }

        while (s != null) {
            Merged.LastPOsitionInsert(s.value);
            s = s.next;
        }

        return Merged;
    }

// #################################lEETCODE ONLY Node NEEDED NOT FULL LIST################################
    public Node mergeTwoLists(Node list1, Node list2) {
        Node Merged = new Node();
        Node temp = Merged;    
        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                temp.next= list1;
                list1 = list1.next;
            } else {
            temp.next= list2;
                list2= list2.next;
            }
            temp= temp.next;
        }

        while (list1!= null) {
            temp.next = list1;
            temp = temp.next;
            list1= list1.next;
        }

        while (list2!= null) {
            temp.next= list2;
            temp = temp.next;   
    list2 = list2.next;
        }

        return Merged.next;
    }
    // ################################## Leetcode 141:  Linked List Cycle ##################################
    public class Solution {
        public boolean hasCycle(Node head) {
            Node fast= head;
            Node slow = head;
    
            while(fast!= null && fast.next!= null){
                fast=fast.next.next;
                slow= slow.next;
                if(fast==slow){
                    return true;
                }
            }
            return false;
        }
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " --> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        Questions first = new Questions();
        Questions second = new Questions();

        first.LastPOsitionInsert(1);
        first.LastPOsitionInsert(3);
        first.LastPOsitionInsert(5);

        second.LastPOsitionInsert(1);
        second.LastPOsitionInsert(2);
        second.LastPOsitionInsert(9);
        second.LastPOsitionInsert(14);

        Questions Merged = Questions.Merge(first, second);
        Merged.Display();  
    }
}
