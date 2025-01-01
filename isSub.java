public class isSub{
    public static void main(String[] args) {
        String s ="axd";
        String t = "abcd";
        int cnt = 0;
        int count=0;
        if (s.length()<t.length()){
         for (int j=0;j<s.length();j++){
         while (count<t.length()){
            if (s.substring(j,j+1).equals(t.substring(count,count+1))){
                cnt++;
                count++;
                break;
            }
            count++;

         }
         }
        }
        System.out.println(cnt);


        }
        
         


    }
