package Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

public class BankAccount {
    private int balance = 100;

    // If two threads access this method simultaneously, it can lead to inconsistent state (t1 paise nikalra and kuch dikkat aai to t1 bhi gya and t2 bhi)
//     public synchronized void  withdraw(int amount){
//   System.out.println(Thread.currentThread().getName() + " is trying to withdraw " + amount);
//   if(balance>=amount){
    // System.out.println(Thread.currentThread().getName() + " processing withdrawal " );
// try{
//     Thread.sleep(10000);
//   }catch(InterruptedException e){
//     throw new RuntimeException(e);
//   }
//   balance -= amount;
//   System.out.println(Thread.currentThread().getName()+ " Completed withdrawal. Remaining is "+ balance);
//     }  else{
//     System.out.println(Thread.currentThread().getName() + " insufficient funds ");
//   } 
private final Lock lock = new ReentrantLock();
public void withdraw(int amount){
    System.out.println(Thread.currentThread().getName()+ " Attempting to withdraw");
    boolean acquired = false;
    try{
        acquired = lock.tryLock(1000, TimeUnit.MILLISECONDS);
        if(acquired) {
            if(balance>=amount){
                System.out.println(Thread.currentThread().getName() + " processing withdrawal " );
                Thread.sleep(3000);
                balance -= amount;
                System.out.println(Thread.currentThread().getName()+ " Completed withdrawal. Remaining is "+ balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " insufficient funds ");
            }
        } else {
            System.out.println(Thread.currentThread().getName() + " could not acquire lock, exiting.");
        }
    }catch (Exception e) {
        System.out.println(Thread.currentThread().getName() + " encountered an error: " + e.getMessage());
        Thread.currentThread().interrupt(); 
        // Restore interrupted status
//         Why is it needed?
// Without it: If you just catch InterruptedException and do nothing, the thread “forgets” it was interrupted because the flag resets to false automatically.

// With it: You preserve the interruption status, so other parts of the program can detect that the thread was told to stop.

// 💡 Think of isInterrupted() like checking “Has someone tapped me on the shoulder saying ‘Stop whatever you’re doing’?”
// It doesn’t stop your thread automatically — it’s just a flag you can check.


    } finally {
        if(acquired) {
            lock.unlock();
        }
    }
    if(Thread.currentThread().isInterrupted()){
        System.out.println(Thread.currentThread().getName() + " was interrupted.");
    }
}

}

