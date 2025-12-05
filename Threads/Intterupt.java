public class Intterupt extends Thread {

    public Intterupt(String name) {
        super(name);
    }

    @Override
    public void run() {
        // Interrupt

        // try{
        // Thread.sleep(1000);
        // System.out.println("Thread is running....");
        // }catch(Exception e ){
        // System.out.println("Thread interrupted: " + e);

        // }

        // Yield ()
        // give priority to other by themself
        // for(int i=0; i<10; i++){
        // System.out.println(Thread.currentThread().getName()+ "Is Running ");
        // Thread.yield();
        // }

        // Deamon Thread
        while (true) {
            System.out.println(" Hi Aadi ");
        }
    }

    public static void main(String[] args) {
        // Intterupt in = new Intterupt("In1 is running ");
        // Intterupt in2= new Intterupt("In2 is Running ");
        // in.start();
        // in2.start();
        // in.interrupt();

        Intterupt in = new Intterupt("In1 is running ");
        in.setDaemon(true);
        Intterupt in2 = new Intterupt("In2 is Running ");
        in2.setDaemon(true);
        in2.start();
        in.start();
        System.out.println("Main Done");

    }
    // If only daemon threads are running and no user (non-daemon) threads are
    // alive, the JVM will exit automatically.
}
