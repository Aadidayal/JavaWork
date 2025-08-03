// package OOPs.Interface.ExtendsInterface.java;


// when an interface extends anot can use both  then it  can use both the porperties 
public class Extend {

    public interface A {
    void fun ();
    } 
    
    public interface B extends A  {
    void greet();
    }

    public class main implements B{
        @Override 
      public   void fun(){
        }
        public void greet(){

        }
    }

    public static void main(String[] args) {
        
    }
}
