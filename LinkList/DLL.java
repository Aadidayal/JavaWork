package LinkList;

public class DLL {
    private Node head;

    private class Node{
        int value;
        Node next;
        Node priv;

        Node(int val){
            this.value=val;
        }
        Node(int val, Node next, Node priv){
            this.value =val;
            this.next= next;
            this.priv = priv;
        }
    }

    public void InsertFirst(int val){
        Node newNode= new Node(val);
        newNode.next= head;
        newNode.priv = null;
        if(head!=null){
            head.priv=newNode;
        }
        head= newNode;
    }

    public void InsertLast(int val){
        Node node= new Node(val);
        node.next= null;
        Node last= head ; 
        if(head==null){
           head= node;
            node.priv = null;
        }
        while(last.next!= null){
            last =last.next;
        }
        last.next= node;
        node.priv = last;   

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

    public void InsertMid(int after, int val){
        Node p = find(after);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node node= new Node(val,p.next, p);
        p.next=node;    
        // node.next= p.next;
        // p.next=node;
        // node.priv=p;
        if(node.next!=null){

            node.next.priv=node;
        }

    }

 

    public void Display(){
        Node temp= head ;
        Node last= null;
        System.out.println("forward");
        while(temp!=null){
            System.out.print(temp.value + " --> ");
            last= temp;
            temp=temp.next;
        }
        System.out.println("End");

        System.out.println("Revese form:     ");
        while(last!=null){
            System.out.print(last.value + " --> ");
            last= last.priv;
        }
        System.out.print("start");
    }


}
