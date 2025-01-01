
public class mergeString {
    public static void main(String[] args){
        String word1= "abcdeqwr";
        String word2 = "pqrs";
        String merge="";
        if (word1.length()==word2.length()){
        for (int i =0; i<word1.length();i++){
            merge=merge.concat((word1.substring(i,i+1).concat(word2.substring(i,i+1))));
        }
        // System.out.println(merge);
        }
        else{
            for (int i =0; i<Math.min(word1.length(),word2.length());i++){
            merge=merge.concat((word1.substring(i,i+1).concat(word2.substring(i,i+1))));
            }
            // System.out.println(merge);
        }

        if (word1.length()>word2.length()){
            for (int i =(word2.length()); i<word1.length();i++){
                merge=merge.concat(word1.substring(i, i+1));
            }
            System.out.println(merge);
        }
        
        // int s1 = Math.max(s.length(),a.length());
    }
}