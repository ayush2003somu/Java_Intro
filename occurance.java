import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class occurance {
    public static void main(String[] args) {
        int [] arr = {2,3,2,3,5};
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        
        Map<Integer,Integer> hash = new HashMap<>();
        
        for (int i=0;i<arr.length;i++){
            if (hash.get(arr[i])!=null){
                hash.put(arr[i],hash.get(arr[i])+1);
                System.out.println(i);
            }
            else{
                hash.put(arr[i],1);
            }
        }
        System.out.println(hash);
        for (int i=1;i<=arr.length;i++){
            if (hash.get(i)!=null){
                list1.add(hash.get(i));
                }
                else{
                    list1.add(0);
                }
            }
            for (int i =0 ;i<list1.size();i++){
            System.out.println(list1.get(i));
            }
    }
}
