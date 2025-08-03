public class Comparisions {
    public static void main(String[] args) {
        String a = "Aadi";
        String b= "Aadi";
        // System.out.println(a==b);

        String nuk = new String("Aadi");
        String nuk1 = new String("Aadi");
        System.out.println(nuk==nuk1);

        System.out.println(nuk.equals(nuk1));
    }
}
