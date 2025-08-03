package OOPs.Access;
public class Subclass extends A {

    Subclass(int num, String name){
        super(num, name);
    }
    public static void main(String[] args) {
        A obj = new A(23, "Aadi");
        int a= obj.num;
        System.out.println(a);
    }
}