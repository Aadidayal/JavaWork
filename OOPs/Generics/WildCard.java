package OOPs.Generics;

import java.util.Arrays;
import java.util.List;
//only storing int values but arrayList can add any dataypes, LETS USE GENERICS 
public class WildCard<T extends Number>{ 

    private Object data[];
    private static int DEFAULT_SIZE=10;
    private int size = 0;

    public WildCard(){
this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list){

    }

    public  void add(T num){
        if (isFull()){
            resize();
        }
        data[size++]=num;
    }

private boolean isFull(){
    return size == data.length;
}

private void resize(){
    Object [] temp= new Object[data.length*2];
    // copy the current items in new array 
    for(int i=0; i<data.length; i++){
        temp[i]= data[i];
    }
    data= temp;
}
public T remove(){
    T removed= (T) (data[size--]);
    return removed;
}
public int size(){
    return size;
}

@Override
public String  toString(){
    return "CustomArrayList" + "data" + Arrays.toString(data)+ ",size " + size;
}
    public static void main(String[] args) {
        CustomGenArrayList<Integer> list =  new CustomGenArrayList();
        CustomGenArrayList <String> list2 = new CustomGenArrayList<>();
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
