
public class firstPrefix{
    public static void main(String[] args) {
        String[] strs = {"flowers","flag","flight"};
        String prefix="";
        // System.out.println(prefix);

            // for (int j=0;j<2;j++){
            //     prefix=prefix+strs[0].charAt(j);
            //     System.out.println(prefix);
            // }

            // if (prefix.equals(strs[i].substring(0,2))){
            //     prefix=strs[i].substring(0,2);
            //     continue;

            // }
            // else{
            //     // System.out.println(strs[i].substring(0,2));
            //     prefix="";
            // }

        for (int i=0;i<strs.length;i++){
            if (i<=2){
            prefix=strs[0].substring(0,i);
            
            for (int j=0;j<strs.length;j++){
            if (prefix.equals(strs[j].substring(0,i))){

                continue;

            }
            else{
                prefix="";
            }
        }
            }
        }
        System.out.println(prefix);
        
    }
    
}
