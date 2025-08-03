package OOPs.StaticExample;

public class Main {
    public static void main(String[] args) {
        // Human kunal = new Human(22, "Kunal", 10000, false);
        // Human rahul = new Human(34, "Rahul", 15000, true);
        // Human arpit = new Human(34, "arpit", 15000, true);

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);
        // these Sout can be used even it there are no objects because of static

        // greeting();
        // can not be accesed as funvtion is not static and we are calling it in static
        // function
        // both must be either static or non static

        Main callFun = new Main();
        callFun.fun2();
    }

    // we know that something which is not static, belongs to an object
    // this is not dependent on objects
    static void fun() {
        // greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        // you cannot access non static stuff without referencing their instances in
        // a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();

    }

    void fun2() {
        greeting();
    }

    void greeting() {
        System.out.println("hellow");
    }
    
}