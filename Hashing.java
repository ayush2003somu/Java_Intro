import java.util.*;


public class Hashing {
    public static void main(String args[]){
        int [] arr = {2,5,6,2,2,3,5,6};
        Scanner sc = new Scanner(System.in);

        
        Map<Integer,Integer> arrHash = new HashMap<>(0);
        Map<Integer,Integer> Hash = new HashMap<>();
        for (int i =0 ; i<6;i++){
        Hash.put(i,i*i*i);

        }
        System.out.println(Hash);
        Set<Integer> keys= Hash.keySet();
        for (int i : keys){
            System.out.println(i+" " + Hash.get(i));
        }
        for (Map.Entry<Integer,Integer> e : Hash.entrySet()){
            System.out.println(e.getKey());
        }

        //  # frequency of occurance of elements of array into hashMap ; #
        for (int i=0;i<arr.length;i++){
            if (arrHash.get(arr[i])!=null){
                arrHash.put(arr[i],arrHash.get(arr[i])+1 );
            }
            else{
                arrHash.put(arr[i],1 );
            }
            
        }
        System.out.println(arrHash);


    
    
}
}