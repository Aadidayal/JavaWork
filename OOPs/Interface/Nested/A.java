package OOPs.Interface.Nested;

public class A {

        public interface  NestedOfA{
    boolean isOdd(int num);
}  
}

 class B implements A.NestedOfA{
@Override
public boolean isOdd(int num){
    return (num &1 )==1;
}
}

class main {
public static void main(String[] args) {
    B obj= new B();
}
    
}

