public class States extends Thread{
  @Override
    public void run(){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        States t1= new States();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();      
        System.out.println(t1.getState());
    }

}
