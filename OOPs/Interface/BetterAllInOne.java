// package OOPs.Interface;

public class BetterAllInOne implements Engine, Breaks, media {
    // Implementing methods from engine and breaks interfaces
    public void start() {
        System.out.println("Car starts");
    }

    public void applyBrakes() { // Renamed from breaks() to applyBrakes()
        System.out.println("Car applies brakes");       
    }

    public void stop() {
        System.out.println("Car stops");
    }

    public void accelerate() {
        System.out.println("Car accelerates");
    }

    // Implementing methods from Media interface
    public void startMedia() {
        System.out.println("Media starts");
    }

    public void endMedia() {
        System.out.println("Media ends");
    }
}

interface Engine {
    static final int PRICE = 928290;

    void start();
    void stop();
    void accelerate();
}

interface Breaks {
    void applyBrakes();  // Renamed the method here too
}

interface media {
    void startMedia();  // Start media
    void endMedia();    // End media
}

class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Power engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Power engine accelerates");
    }
}

class ElectricEngine implements Engine{
    @Override
    public void start(){
        System.out.println("Elecctric car start");
    }
    @Override
    public void stop(){
        System.out.println("Elecctric car stoop");
    }
    @Override
    public void accelerate(){
        System.out.println("Elecctric car ACCELERATES");
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating an object of BetterAllInOne
        BetterAllInOne car = new BetterAllInOne();
        Engine car2 =  new ElectricEngine();
        Engine car3 = new PowerEngine();
        car3.start();
        car2.start();
        // Calling methods from the engine interface
        car.accelerate();  // Outputs: Car accelerates
        car.start();       // Outputs: Car starts
        car.applyBrakes(); // Outputs: Car applies brakes
        car.stop();        // Outputs: Car stops

        
        // Calling methods from the Media interface
        car.startMedia();  // Outputs: Media starts
        car.endMedia();    // Outputs: Media ends
    }
}
