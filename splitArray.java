public class splitArray {
    static Boolean vowel(String s){
        char cnt = s.charAt(0);
        char cnt2= s.charAt(s.length()-1);
            if ("aeiou".indexOf(cnt) != -1 && "aeiou".indexOf(cnt2) != -1) {
                return true;
            }
            return false; 
    }
    static int [] split(String [] s){
        int [] arr = new int[s.length];
        for (int i=0;i<arr.length;i++){
            if (vowel(s[i])==true){
                arr[i]=1;
            }

        }
        return arr;
    }
    public static void main(String[] args) {
        int [][] queries = {{0,2},{1,4},{1,1}};
        String [] words = {"aba","bcb","ece","aa","e"};
        // int [] ans = new int[queries.length];
        // int count = 0;
        // for (int i=0;i<queries.length;i++){
        //     for (int j = queries[i][0]; j<=queries[i][queries[i].length-1];j++){
        //         // System.out.println(i+" "+ j);
        //         if (vowel(words[j])){
        //             count++;
        //         }

        //     }

            
        //     ans[i]=count; 
        //     count=0;
        // }
        for (int i=0;i<queries.length;i++){
            
        }
        int [] arr2=split(words);
        for (int i : arr2){
            System.out.println(i); 
        }
    }
}