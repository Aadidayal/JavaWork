package Threads.Synchronization;

public class Counter {
    private int count=0;

    // Increment the counter synchronized(always 2000 , without it any )
    // public synchronized   void inc(){
    //     count++;
    // }
    public    void inc(){
        synchronized(this){
            count++;
        }
     
    }
public int getCount(){
    return count ;
}
}
    