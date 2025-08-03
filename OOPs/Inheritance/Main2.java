package OOPs.Inheritance;

 class Nim {
    int age ;
    char firstName;
    char secName;
     public Nim(int age) {
        this.age = age;
    }
     void setName(char first, char sec) {
        this.firstName = first;
        this.secName = sec;
        System.out.println("Name is: " + this.firstName + this.secName + " and age is: " + this.age+"is nim");
    }
}
class teacher extends Nim{
    public teacher (int age){
super(age);
    }
    @Override
    void setName(char first, char sec) {
        super.setName(first, sec); 
       System.out.println("Name is: " + first + sec + " and age is: " + this.age+"is teacher");
    }
}
class Dr extends teacher{
    public Dr (int age){
super(age);
    }
    @Override
    // void setName(char first, char sec) {
    //     super.setName(first, sec); 
    //    System.out.println("Name is: " + first + sec + " and age is: " + this.age+ "is DR");
    // }
   
void setName(char first, char sec) {
    this.firstName = first;
    this.secName = sec;
    System.out.println("Name is: " + first + sec + " and age is: " + this.age + " is DR");
}

}

 public class Main2{
    public static void main(String[] args) {
        Dr doc = new Dr(23);
        doc.setName('A','B');
    }
}