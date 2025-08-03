package OOPs.Acess2;

import OOPs.Access.A;

 class Subclass extends A {
    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(23, "Aadi");

        int a = obj.num;
        System.out.println(a);
    }

}
class Subclass2 extends Subclass {
    public Subclass2(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {
        
    }
}