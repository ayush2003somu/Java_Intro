import java.util.*;
public class minDistance {
    public static void main(String[] args) {
    int [] arr = {32,1,3,5,4,3};
    int x=1;
    int y=2;
    HashMap<Integer,Integer> set = new HashMap<>();
    int ans =arr.length;
    for (int i =0;i<arr.length;i++){
        if (arr[i]==x || arr[i]==y){
            if (arr[i]==x  &&  set.containsKey(y)){
                if(ans >i-set.get(y)) {
                    ans = i-set.get(y);
                    set.put(arr[i],i);
            }
        }
            else if (arr[i]==y  &&  set.containsKey(x)){
               if(ans >i-set.get(x)){ 
               ans = i-set.get(x);
               set.put(arr[i],i);
            }
            }
            else{
                set.put(arr[i],i);
                System.out.println("index:"+i);
            }
        
    }
    System.out.println(ans);
}
    if (!set.containsKey(x) || !set.containsKey(y)) System.out.println(-1);
    else System.out.println(ans);
}
}