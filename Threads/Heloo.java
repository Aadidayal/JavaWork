public class Heloo {
    public static void main(String[] args) {
        // World wor= new World();
        // wor.start();
        World wor= new World();
        Thread th= new Thread(wor);
        th.start();
        for(int i=0;i<1000;i++){
            System.out.println("hellow");
        }
    }
}
