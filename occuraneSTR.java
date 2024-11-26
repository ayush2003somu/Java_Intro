public class occuraneSTR {
    public static void main(String[] args) {
        String haystack="a";
        String needle = "a";
        int k1=-1;
        if (haystack.length()<needle.length()){
            System.out.println(k1);
        }
        for (int i=0;i<=haystack.length()-needle.length();i++){
            if (haystack.substring(i, i+needle.length()).equals(needle)){
                k1=i;
            }

        }           
        System.out.println(k1);
    }
}


        // if (haystack.charAt(i)==needle.charAt(0)){
        //     k=i;
        //     k1=i;
        //     for (int j=1;j<needle.length();j++){
                
        //         if (haystack.subst==needle){
        //             count++;
        //             // System.out.println(count);
        //             k++;
        //         }
        //         else{
        //             // System.out.println("hi helo");
        //             break;
                    
        //         }
        //     }
            
        //     }
        //     if (count==needle.length()){
        //         System.out.println("k1="+k1);
               
        //     }
        //         else{
        //             k1=-1;
        //             continue;
        //         }     
            
        // }
        // System.out.println(k1);