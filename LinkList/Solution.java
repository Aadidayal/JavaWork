package LinkList;

import java.util.List;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast= head;
        ListNode slow = head;

        while(fast!= null && fast.next!= null){
            fast=fast.next.next;
            slow= slow.next;
            if(fast==slow){
                return true;
            }
           
        }
        return false;
    }

   

    public int  LengthCycle(ListNode head) {
        ListNode fast= head;
        ListNode slow = head;

        while(fast!= null && fast.next!= null){
            fast=fast.next.next;
            slow= slow.next;
            if(fast==slow){
                ListNode temp=slow;
                int length =0;
                do{
                    temp=temp.next;
                    length++;
                } while(temp!=slow);
                return length;
            }
        }
        return 0;
    }

    // #####################################  Cycle 2 leetcode #################################
    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode s= head ;
        ListNode f= head ;

        while(f!=null && f.next!= null){
            f= f.next.next;
            s= s.next;
            if(s==f){
                length = LengthCycle(s);
            }
        }
        if (length ==0){
            return null;
        }
        ListNode slow = head ;
        ListNode fast = head;

        while(length>0){
          slow=   slow.next;
          length--;
        }
        do{

            slow= slow.next;
            fast= fast.next;
        }while(slow!=fast);

        return slow;
    }



// ###################################### Cycle 2 better method ##############################################
    public class Cyclee2{
        public ListNode detectCycle(ListNode head) {
            if(head==null || head.next==null){
                return null;
            }
        ListNode slow=head;
        ListNode fast=head;
      // if(fast==null || fast.next==null){
          // return null;
      // }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
            break;
            }
        }
         if(fast==null || fast.next==null){
           return null;
       }
        ListNode temp=head;
    
        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }
            return slow;
        }
    }

// ######################### LinkList reverse 2 #######################################
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head ;
        }
         ListNode prev= null;
         ListNode current = head;
         for(int i= 0; current != null && i< left-1; i++){
            prev = current;
            current = current.next;
        }
        ListNode newLast= current;
        ListNode last = prev ;
         ListNode next= current.next;
         for(int i= 0; i< right -left+1; i++){
           current.next= prev;
           prev= current;
           current= next;
           next= next.next;
         }
         
         if(last!= null){
           last.next= prev;
         }else{
             head = prev;
         }
         newLast.next= current;
         return head;
    }

    // ############################# method 2 of reverse LinkList ############################
  
        public ListNode reverseBetween2(ListNode head, int leftVal, int rightVal) {
            if (leftVal == rightVal) return head;
    
            ListNode dummy = new ListNode(0);
            dummy.next = head;
    ListNode prev = dummy;
            ListNode leftNode = null;
            ListNode rightNode = null;
            ListNode current = dummy.next;


            while (current != null) {
                if (current.val == leftVal) {
                    leftNode = current;
                }
                if (current.val == rightVal) {
                    rightNode = current;
                }
                current = current.next;
            }
            if (leftNode == null || rightNode == null) {
                return head;
            }
            while (prev.next != leftNode) {
                prev = prev.next;
            }
                prev.next = rightNode;
            leftNode.next = rightNode.next;
    
            return dummy.next;
        }

// ############################ middle of list ##############################################?
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
    
            while(fast!=null && fast.next!=null){
                slow= slow.next;
                fast= fast.next.next;
            }
            return slow;
        }





        // ########################## reverse link lisrt #################################?
        public ListNode reverseList(ListNode head) {
            if(head==null){
                return head;
            }
            ListNode prev = null;
            ListNode curr = head;
            ListNode next= curr.next;
            while(curr != null){
                curr.next= prev;
                prev = curr;
                curr = next;
                if(next!=null){
                next= next.next;
                }
            }
            head = prev;
            return prev;
    
        }
    // ################################ REORDER OF LIST @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

    public void reorderList(ListNode head) {
    if(head == null && head.next == null){
        return ;
    }
    ListNode start = head ;
    ListNode end = middleNode(head);

        while (start != null && end != null) {
            ListNode temp = start.next;
            start.next = end ;
            start = temp;
            temp = end.next;
            end.next= start;
            end = temp;
        }
       

    }

}