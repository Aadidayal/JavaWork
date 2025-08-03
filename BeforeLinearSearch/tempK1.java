package BeforeLinearSearch;

import java.util.Scanner;
public class tempK1 {
    public static void main(String[] args) {
        System.out.println("Enter Temp in C: ");
        Scanner input = new Scanner(System.in);
        float TempC=  input.nextFloat();
        float TempF=  (TempC * 9/5)+ 32;
        System.out.println(TempF);
    }
}
