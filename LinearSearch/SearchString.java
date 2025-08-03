public class SearchString {
    public static void main(String[] args) {
        String name = "Aadi Dayal";
        char target = 'y';
        boolean ans = search(name, target);
        System.out.println(ans);

    }

    static boolean search(String chr, char target) {
        if (chr.length() == 0) {
            return false;
        }

        for (int i = 0; i < chr.length(); i++) {
            if (target == chr.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}

// ######################################################################################################################

// IN FORM OF CHAR ARRAY

// import java.util.Arrays;

// public class SearchString {
//     public static void main(String[] args) {
//         String name = "Aadi Dayal";
//         char target = 'I';
//         System.out.println(Arrays.toString(name.toCharArray()));

//     }

//     static boolean search2(String chr, char target) {
//         if (chr.length() == 0) {
//             return false;
//         }

//         for (char ch : chr.toCharArray()) {
//             if (ch == target) {
//                 return true;
//             }
//         }
//         return false;
//     }

// }
