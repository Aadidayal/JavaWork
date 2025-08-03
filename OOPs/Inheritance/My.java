package OOPs.Inheritance;

class Box {
    double l;
    double w;
    double h;

    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
    Box(double len, double wid, double hig) {
        this.l = len;
        this.w = wid;
        this.h = hig;
    }

    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

}

// Corrected class definition (NO parentheses after `extends Box`)
class BoxWeight extends Box {
    double weight;

    // Constructor
    BoxWeight(double len, double wid, double hig, double weight) {
        super(len, wid, hig); // Call the parent class constructor
        this.weight = weight;
    }
}

public class My {
    public static void main(String[] args) {

        // BoxWeight dimention = new Box(2.2, 21, 2); can not done as parent dont know
        // what does child have
        // see notes

        Box dimention = new Box(2,5,8);
        Box dimentions = new BoxWeight(2.2, 21, 2, 5);
        Box dia = new Box();
      System.out.println("l: " + dimention.l + ", w: " + dimention.w + ", h: " + dimention.h);

        System.out.println(dimention.l);
        System.out.println(dia.h);
    }
}
