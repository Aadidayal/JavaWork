package OOPs.Polymorphism;

public class Shapes {
    void area(){
        System.out.println("you are in shapes ");
    }
}
 class Circle extends Shapes{
    void area(){
        System.out.println("area is pie * r * r");
    }
}

 class Square extends Circle{
    @Override
    void area(){
        System.out.println("area is a*a ");
    }
}
 class Main {
    public static void main(String[] args) {
        Shapes shapes= new Shapes();
        Shapes square = new Square();
        Circle circle= new Circle();

       circle.area();
    }
}
