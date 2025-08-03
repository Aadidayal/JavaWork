package OOPs.Interface;

public class AllInOne implements engine, breaks { // cant user media because have same names , here in same file 
    //if had different files for each interface anf then implements it it would have taken all interfaces 

    public void start() {
        System.out.println("car starts");
    }

    public void breaks() {
        System.out.println(" car nbreks ");
    }

    public void stop() {
        System.out.println("car stops");
    }

    public void accelerate() {
        System.out.println(" car accelerates");
    }

}

interface engine {
    static final int PRICE = 928290;

    void start();

    void stop();

    void accelerate();

}

interface Media {
    void start();

    void end();

}

interface breaks {
    void breaks();

}
class main{
    public static void main(String[] args) {
       AllInOne caar = new AllInOne();

        caar.accelerate();
    }

}