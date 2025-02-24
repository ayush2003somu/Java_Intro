import java.util.*;
public class quesHashMap {
    public static void main(String[] args) {
        Map<Integer,Integer> hash = new HashMap<>();


        //  ## RETURN THE ELEMENT WHICH OCCURS MORE THAN N/3 TIMES IN AN ARRAY ##

        // int [] arr = {1,3,2,5,1,3,1,5,1};
        // for (int i=0;i<arr.length;i++){
        //     if (!hash.containsKey(arr[i])){
        //         hash.put(arr[i], 1);
        //     }
        //     else{
        //         hash.put(arr[i],hash.get(arr[i])+1);
        //     }
        // }
        // System.out.println(hash);
        // for (Map.Entry<Integer,Integer> e : hash.entrySet()){
        //     if (e.getValue()>(arr.length/3)){
        //         System.out.println(e.getKey());
        //     }
            
        // }

        //  ## UNION OF TWO ARRAYS ##

        // int [] arr1 = {1,2,3,4,5};
        // int [] arr2 = {3,4,5,6,2,3,4,5,6,9,7,1,2,3,7};

        // for (int i=0;i<arr1.length;i++){
        //     hash.put(arr1[i], i);
        // }
        // for (int i=0;i<arr2.length;i++){
        //     hash.put( arr2[i], i);
        // }

        // int [] arr3 = new int[hash.size()];
        // int count = 0;
        // for(int i: hash.keySet()){
        //     arr3[count]= i;
        //     count++;
        // }
        // System.out.println(hash);
        // for (int i : arr3){
        //     System.out.print(i+",");
        // }


        // // ## INTERSECTION OF TWO ARRAYS ##
        // int [] arr1 = {1,21,4,11};
        // int [] arr2 = {3,4,5,6,2,11,3,4,5,6,9,7,1,2,3,7};
        // HashSet<Integer> hash2 = new HashSet<>();

        // for (int i=0;i<arr1.length;i++){
        //     hash.put(arr1[i], i);
        // }
        // for (int i=0;i<arr2.length;i++){
        //     if (hash.containsKey(arr2[i])){
        //         hash2.add(arr2[i]);
        //     }
        // }
        // System.out.println(hash2);

        //  ## RANSOM NOTE ##

        // HashSet <Character> arr = new HashSet<>();
        // String magazine ="aaish";
        // String ransomNote = "aa";
        // HashMap<Character,Integer> sto = new HashMap<>();
        // int count =0 ;

        // Map <Character,Integer> mag = new HashMap <>();
        // for (int i=0;i<magazine.length();i++){
        //     char c=magazine.charAt(i);
        //     if (mag.containsKey(c)){
        //         mag.put(c,mag.get(c)+1);
        //     }
        //     else{
        //         mag.put(c,1);
        //     }

        // }
        // for (int i=0;i<ransomNote.length();i++){
        //     char c= ransomNote.charAt(i);
        //     if (mag.get(c)>=1){
        //         mag.put(c,mag.get(c)-1);
        //         System.out.println("True");
        //     }
        //     else{
        //         System.out.println("False");
        //         break;
        //     }
        // }

        //  ## Maximum number of balloon ##

        String text = "loonbalxballpoon";
        HashMap <Character,Integer> set = new HashMap<>();

        System.out.println(set==set2);
        String s = "balloon";
        int cnt=-1;
        int count=0;
        for (int i =0;i<text.length();i++){
            char c =  text.charAt(i);
            if (set.containsKey(c)){
                set.put(c,set.get(c)+1);
            }
            else{
                set.put(c,1);
            }
        }
        System.out.println(set);
        
        
        while (true){
            cnt++;
            char c = s.charAt(cnt);
            
        if (set.containsKey(c) && set.get(c)>0){
            set.put(c,set.get(c)-1);
                if (cnt==6){
                    count++;
                    cnt=-1;
                    
                
            }
            
        }
            else{
                break;
            }
        }
        System.out.println(count);
        System.out.println(cnt);
    }
    }
