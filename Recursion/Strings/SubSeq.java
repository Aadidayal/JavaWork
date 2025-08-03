package Recursion.Strings;

import java.util.ArrayList;     

import javax.print.DocFlavor.STRING;

public class SubSeq {
    public static void main(String[] args) {
       seq(" ", "abc");
    }
    static void seq(String neWw, String weGet){
        if(weGet.isEmpty()){
            System.out.println(neWw);
            return;
        }
        char ch = weGet.charAt(0);

        seq(neWw + ch , weGet.substring(1));
        seq(neWw, weGet.substring(1));
    }

    


    static ArrayList<String> Listseq(String neWw, String weGet){
        if(weGet.isEmpty()){
            ArrayList <String> list = new ArrayList<>();
            list.add(neWw);
            return list ;
        }
        char ch = weGet.charAt(0);

        ArrayList <String> left=  Listseq(neWw + ch , weGet.substring(1));
       ArrayList <String> right =  Listseq(neWw, weGet.substring(1));

    left.addAll(right);
    return left;
    }

    


    static void subseqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseqAscii(p + ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch+0), up.substring(1));
    }

}
