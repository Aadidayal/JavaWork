package OOPs.StaticExample;
// outer class cant be static as it is not dependent on anything 


public class InnerStatic {
    // need to be static as it is dependent on InnerStatic 
  static  class Test{
       String name;
        
        Test(String name){
            this.name= name;
        }
        // if we take this class outside as a sepreate class it will print aadi dayal both time as it will replace 
        //test.name=name( seprate class h na )
    }


    public static void main(String[] args) {
        // without static , here Test class need a instance of innerclass to run 
        Test a= new Test("Aadi");
        a.name= "Aadi"; // will use constructor 
        Test b= new Test("Aadi Dayal");

        // System.out.println(a.name);
        System.out.println(b.name);
    }


}

