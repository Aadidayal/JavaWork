package Recursion.Permutations;

public class dice {
public static void main(String[] args) {
        Dice("",4);
}

public static void Dice(String s, int target ){
    if(target ==0){
    System.out.println(s);
    return ;
    }
    for(int i=0; i<=6&& i> 0;i++){
        Dice(s+i, target-1);
    }
}

// If dice have given 7 or 8 or custom number of faces 

public static void DiceFace(String s, int target , int face ){
    if(target ==0){
    System.out.println(s);
    return ;
    }
    for(int i=0; i<=face && i> 0;i++){
        DiceFace(s+i, target-1,face);
    }
} 
}