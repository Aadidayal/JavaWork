package questions;      
import java.util.Stack;
import java.util.EmptyStackException;

public class Questions {
   public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.push(1);
        queue.push(2);

        try {
            queue.remove(); // Removes 1
            queue.seek();   // Peeks at 2
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty!");
        }
    }
}

class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int item) {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        first.push(item);
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }

    public void remove() {
        if (first.isEmpty()) {
            throw new EmptyStackException();
        }
        first.pop();
    }

    public void seek() {
        if (first.isEmpty()) {
            throw new EmptyStackException();
        }
        System.out.println("Front of queue: " + first.peek());
    }

    public boolean isEmpty() {
        return first.isEmpty();
    }
}


//     public  void push(int item){
//            first.push(item);
//     }
//     public int remove() throws Exception{
//         while(!first.isEmpty()){
//                 second.push(first.pop());
//         }
//         int removed = second.pop();
//         while(!second.isEmpty()){
//             first.push(second.pop());
//         }
//         return removed;
//     }
//     public int seek()throws Exception{
//         while(!first.isEmpty()){
//             second.push(first.pop());
//     }
//     int seeked= second.pop();
//     while(!second.isEmpty()){
//         first.push(second.pop());
//     }
//     return seeked;
//     }
//     public boolean isEmpty() {
//         return first.isEmpty();
//     }
// }

