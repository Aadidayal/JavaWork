package Recursion.Permutations;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        // permutations("", "abc");
        // ArrayList<String> ans = permutationsList("", "abc");
        // System.out.println(ans);
        System.out.println(permutationsCount("", "abc"));

    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }

    }

    public static ArrayList<String> permutationsList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        // local to this call
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            ans.addAll(permutationsList(f + ch + s, up.substring(1)));
        }
        return ans;
    }

     static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p); // this will print the end result 
            return 1;
        }
        int count=0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
           int c= permutationsCount(f + ch + s, up.substring(1));
            count += c;

        }
return count;
    }
}
