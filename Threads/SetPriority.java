public class SetPriority extends Thread {
    public SetPriority(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            // Use StringBuilder for efficient string concatenation in a loop
            StringBuilder a = new StringBuilder();
            for (int j = 0; j < 10000000; j++) {
                a.append("ab");
            }
            System.out.println(Thread.currentThread().getName() + "-Priority: " + Thread.currentThread().getPriority()
                    + "-count" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // It's good practice to handle or at least log exceptions
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        SetPriority t1 = new SetPriority("Low Priority ");
        SetPriority t2 = new SetPriority("mid Priority ");
        SetPriority t3 = new SetPriority("high Priority ");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        // Just gives the hint to the JVM to run on these priorities 
        // actual priority will also depends on your code , JVM and methods 
        t1.start();
        t2.start();
        t3.start();
    } 
}
