package OOPs.Polymorphism;

public class OverloadDemo {
    int a ;
    OverloadDemo(int i){
        a=i;
    }
    OverloadDemo inc(){
        OverloadDemo temp = new OverloadDemo(a+10);
        return temp;
    }
}
class main{
    public static void main(String[] args) {
        OverloadDemo T1= new OverloadDemo(2);
        OverloadDemo T2;
        T2= T1.inc();
        System.out.println("T1 is " + T1.a);
        System.out.println("T2 is "+ T2.a);
    }
}

// ###############################################################################################################




// class Counter {
//     private int count;

//     public Counter(int count) {
//         this.count = count;
//     }

//     // Method returns Counter object (this) to enable chaining
//     public Counter increment() {
//         this.count++;
//         return this;
//     }

//     public Counter add(int value) {
//         this.count += value;
//         return this;
//     }

//     public int getCount() {
//         return count;
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Counter c = new Counter(5);
        
//         // Method chaining using return type Counter
//         c.increment().add(10).increment();

//         System.out.println("Count is: " + c.getCount());  // Output: 17
//     }
// }
