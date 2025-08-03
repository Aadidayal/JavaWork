package OOPs.AbstractDemo;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    abstract void Carrername();

    abstract void age();

}

class Son extends Parent {
    public Son(int age) {
        super(age);

    }

    void Carrername() {
        System.out.println(" i willbecom coder ");
    }

    void age() {
        System.out.println("my age is " + age);
    }

}

class daughter extends Son {
    public daughter(int age) {
        super(age);
    }

    @Override
    void Carrername() {
        System.out.println("i will becom doc");
    }

    @Override
    void age() {
        System.out.println("my age is " + age);
    }
}

class main {
    public static void main(String[] args) {
        Parent son = new Son(23);
        daughter her = new daughter(21);
        her.age();
        // son.age();
        her.Carrername();
        // son.age();
        // son.Carrername();

    }
}