package Recursion.Arrays;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int arr[] = { 1, 76, 4, 4, 56, 6, 7, 234, 3,4 };
        // boolean ans = FindEle(arr, 76, 0);
        // int ans= FindIndex(arr, 56, 0);
        // findAllIndex(arr, 4, 0);
        // System.out.println(list);
        // ArrayList<Integer>list = new ArrayList<>();
        // ArrayList<Integer>ans = findAllIndex(arr, 4, 0, list);
        // System.out.println(list);
        // both are correct to call array list 
        // ArrayList<Integer> ans1= findAllIndex(arr, 0, 0, list);
        // System.out.println(ans1);
        System.out.println(findAllIndex2(arr, 4, 0));

    
        // System.out.println(ans);
    }
    // static boolean FindEle(int arr[], int target, int index){
    // if(index==arr.length){
    // return false;
    // }
    // return arr[index]==target || FindEle(arr, target, index +1 );
    // }

    // if have to fine index of it
    static int FindIndex(int arr[], int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return FindIndex(arr, target, index + 1);
        }
    }

    // what is duplicates are given and you have to give both indicies
    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }


    //  taking arrayList in parameters 


    static ArrayList<Integer> findAllIndex(int arr[], int target, int index, ArrayList<Integer>list){ 
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr, target, index+1, list);
    }


    //  if you want to take arrryList in body of a function
    static ArrayList<Integer> findAllIndex2(int arr[], int target, int index){ 
        ArrayList<Integer> list= new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer>AnsOfBelow=  findAllIndex2(arr, target, index+1);
        list.addAll(AnsOfBelow);
        return list;
    }
}
