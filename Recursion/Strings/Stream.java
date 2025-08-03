package Recursion.Strings;

public class Stream {
    public static void main(String[] args) {
        // skip(" ", "klbahbalnd");
        // System.out.println(skip2("dnjanajnadjanansnajsnans"));

        // System.out.println(apple("NJDapplJDNapplejkandjdn"));
        System.out.println(removeAppNotapple("jkafnapple")); // will not remove apple
        System.out.println(removeAppNotapple("jkafnappeellll ")); // will remove app

    }

    static void skip(String neww, String weGet) {
        if (weGet.isEmpty()) {
            System.out.println(neww);
            return;
        }
        char ch = weGet.charAt(0);
        if (ch == 'a') {
            skip(neww, weGet.substring(1));
        } else {
            skip(neww + ch, weGet.substring(1));
        }

    }

    // WITH VARIABLE IN FUNCTIONS BODY

    static String skip2(String weGet) {
        if (weGet.isEmpty()) {
            return " ";
        }
        char ch = weGet.charAt(0);
        if (ch == 'a') {
            return skip2(weGet.substring(1));
        } else {
            return ch + skip2(weGet.substring(1));
        }
    }

    // IF you need to skip a string istead of just a letter

    static String apple(String weGet) {
        if (weGet.isEmpty()) {
            return " ";
        }
        if (weGet.startsWith("apple")) {
            return apple(weGet.substring(5));
        } else {
            return weGet.charAt(0) + apple(weGet.substring(1));
        }
    }

    // do not remove apple but if its not full word ex- appl.. just remove app from
    // the string

    static String removeAppNotapple(String weGet) {
        if (weGet.isEmpty()) {
            return " ";
        }
        if (weGet.startsWith("app") && !weGet.startsWith("apple")) {
            return removeAppNotapple(weGet.substring(3));
        } else {
            return weGet.charAt(0) + removeAppNotapple(weGet.substring(1));
        }
    }
}
