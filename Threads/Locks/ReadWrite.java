package Threads.Locks;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWrite {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();

        Thread reader1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Reader 1: Counter value is: " + counter.getValue());
                sleep(500);
            }
        }, "Reader-1");

        Thread reader2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Reader 2: Counter value is: " + counter.getValue());
                sleep(500);
            }
        }, "Reader-2");

        Thread writer = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                counter.increment();
                System.out.println("Writer: Incremented counter to: " + counter.getValue());
                sleep(1500);
            }
        }, "Writer");

        reader1.start();
        reader2.start();
        writer.start();
    }

    private static void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { }
    }
}

class SharedCounter {
    private int count = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    public int getValue() {
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is reading counter");
            sleep(1000);
            return count;
        } finally {
            System.out.println(Thread.currentThread().getName() + " finished reading");
            lock.readLock().unlock();
        }
    }

    public void increment() {
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is incrementing counter");
            sleep(2000);
            count++;
        } finally {
            System.out.println(Thread.currentThread().getName() + " finished incrementing");
            lock.writeLock().unlock();
        }
    }

    private void sleep(long ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) { }
    }
}