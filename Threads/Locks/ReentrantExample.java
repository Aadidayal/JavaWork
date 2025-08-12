import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    private final Lock lock = new ReentrantLock();
// since it is ReentrantLock, it can be locked multiple times by the same thread
    public void outerMethod(){
        lock.lock();
        //lock.lockInterruptibly(); // can throw InterruptedException
        try{
            System.out.println("OutterMethod");
            innerMethod();
        }finally{
            lock.unlock();
        }
    }

// already lock then locking again
    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("InnerMethod"); 

        }finally{
            lock.unlock(); 
        }
    }

   
    public static void main(String[] args) {
        ReentrantExample exp = new ReentrantExample();
        exp.outerMethod(); 

    }
}
