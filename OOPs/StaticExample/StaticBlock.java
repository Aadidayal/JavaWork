package OOPs.StaticExample;

public class StaticBlock {
    static int a=5;
    static int b;
// will run only once throughout the code 
    static{
        System.out.println("Im in static bloick");
        b= a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " "+ StaticBlock.b);

        StaticBlock.b +=3;
        System.out.println(StaticBlock.a + " "+ StaticBlock.b);
// to check the static block will run 1 or more time 
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " "+ StaticBlock.b);


    }
}
