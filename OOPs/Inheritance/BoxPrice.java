package OOPs.Inheritance;

public class BoxPrice extends BoxWeight{
    double price;

    BoxPrice(){
        super();
        this.price= -1;
    }

    BoxPrice(BoxPrice other){
        super(other);
        price= other.price;
    }
    BoxPrice(double side, double weight , double price){
        super(side, weight);
        this.price= price;
    }
    BoxPrice(double l, double w, double h, double weight ){
        super(l, h, w, weight);
        this.price= price;
    }
}