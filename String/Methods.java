import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Aadi Dayal Hello World";
        String as= "123";
        String ps= "12";
        String ans= as+ps;
        System.out.println(Arrays.toString(ans.toCharArray()));
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("     Aadiii    Dayal   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}