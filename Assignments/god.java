package Assignments;

import java.util.Scanner;

public class god {
    public static int main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j] && i < j) {
                    count++;
                }
            }

        }
        return count ;

    }
}
