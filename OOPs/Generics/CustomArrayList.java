package OOPs.Generics;

import java.util.Arrays;
//only storing int values but arrayList can add any dataypes, LETS USE GENERICS 
public class CustomArrayList { 

    private int data[];
    private static int DEFAULT_SIZE=10;
    private int size = 0;
// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html#createObjects


    public CustomArrayList(){
this.data = new int[DEFAULT_SIZE];
    }

    public  void add(int num){
        if (isFull()){
            resize();
        }
        data[size++]=num;
    }

private boolean isFull(){
    return size == data.length;
}

private void resize(){
    int [] temp= new int[data.length*2];
    // copy the current items in new array 
    for(int i=0; i<data.length; i++){
        temp[i]= data[i];
    }
    data=temp;
}
@Override
public String  toString(){
    return "CustomArrayList" + "data" + Arrays.toString(data)+ ",size " + size;
}
    public static void main(String[] args) {
        CustomArrayList list =  new CustomArrayList();
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        System.out.println(list);
    }
}
