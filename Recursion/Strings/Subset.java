package Recursion.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        ArrayList<ArrayList<Integer>> ans = sub(arr);
        for (ArrayList<Integer> list : ans) {
            System.out.println(list);
        }
    }

    static ArrayList<ArrayList<Integer>> sub(int arr[]) {
        ArrayList<ArrayList<Integer>> outter = new ArrayList<>();

        outter.add(new ArrayList<>());

        for (int num : arr) {
            int n = outter.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> inner = new ArrayList<>(outter.get(i));
                inner.add(num);
                outter.add(inner);
            }
        }
        return outter;

    }

    static List<List<Integer>> subsetDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if current and previous element is same, s = e + 1
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }

}
