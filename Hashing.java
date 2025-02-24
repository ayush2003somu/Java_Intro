import java.util.*;


public class Hashing {
    public static void main(String args[]){
        // int [] arr = {2,5,6,2,2,3,5,6};
        // Scanner sc = new Scanner(System.in);

        
        // Map<Integer,Integer> arrHash = new HashMap<>(0);
        // Map<Integer,Integer> Hash = new HashMap<>();
        // for (int i =0 ; i<6;i++){
        // Hash.put(i,i*i*i);

        // }
        // System.out.println(Hash);
        // Set<Integer> keys= Hash.keySet();
        // for (int i : keys){
        //     System.out.println(i+" " + Hash.get(i));
        // }
        // for (Map.Entry<Integer,Integer> e : Hash.entrySet()){
        //     System.out.println(e.getKey());
        // }

        // //  # frequency of occurance of elements of array into hashMap ; #
        // for (int i=0;i<arr.length;i++){
        //     if (arrHash.get(arr[i])!=null){
        //         arrHash.put(arr[i],arrHash.get(arr[i])+1 );
        //     }
        //     else{
        //         arrHash.put(arr[i],1 );
        //     }
            
        // }
        int[] nums = {1,2,2,4};

        // System.out.println(arrHash);
        Set<Integer> set = new HashSet<>();
        int[] arr=new int[2];
        int n=nums.length;
        for (int i=0;i<n;i++){
            if (set.contains(nums[i])){
                
                
            }
            else{
                set.add(nums[i]);
            }
        }
        System.out.println(set);
        for (int i=0;i<=n;i++){
            if (!set.contains(i)){
                arr[1]=i;
            }
            
        }
        
        System.out.println(arr[0]+" " + arr[1]);

    
    
}
}