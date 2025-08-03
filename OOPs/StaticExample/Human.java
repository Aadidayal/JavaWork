package OOPs.StaticExample;


public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;
    // static is used because population is common to all the objects of this class , so every time we make objects 
    // in this class it must add it to the population +=1, and show 
    // if static is not used it will show 1 for its own number  

    static void message() {
        System.out.println("Hello world");
//        System.out.println(this.age); // cant use this over here
    }

    public Human(int age, String name, int salary, boolean married) {
       
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
        // can also be accessed by this but it is good to use human 
    }
}