// package OOPs.EXceptionHandling.java;

public class Demo {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 0;

        try {
            // int c= a/b;
            // divide(a, b);
            String name = "Aadi";
            if (name.equals("Aadi")) {
                System.out.println("Im good");
                throw new MyException("My name is aaadi");

            }
            // }catch(Exception r){

            // System.out.println("normal expression ");

            // }
            // cant be used brfore , more strict rules if want to add ,
            // must come 1st becux if not it will bw already caught in this
        } catch (ArithmeticException r) {

            System.out.println(r.getMessage());

        } catch (Exception r) {

            System.out.println("normal expression ");
            System.out.println(r.getMessage());  


        } finally {
            System.out.println("this will always run");
        }

    }
    // static int divide (int a , int b)throws ArithmeticException{
    // if (b==0){
    // throw new ArithmeticException(" do not divide by 0");
    // }
    // return a/b;
    // }
}
