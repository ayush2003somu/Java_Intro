public class parenthesis {

public static Boolean count(int cout,String s4,String s2){
        int cnt=0;
        for (int i=0;i<s4.length();i++){
            String s3=s4.substring(i,i+1);
            if (s3.equals(s2)){
                cnt++;
                
            }


        }
        System.out.println(cnt);
        if (cnt==cout){
            return true;
        }
        else{
        return false;
        }
    }

    public static void main(String[] args) {
        String s = "[([]])";
        String s1;
        int count1=0;
        int count2=0;
        int count3=0;
        for (int i=0;i<s.length();i++){
            s1=s.substring(i,i+1);
            System.out.println(s1);
            if (s1.equals("(")){
                count1++;
            }
            else if (s1.equals("[")){
                count2++;
            }
            else if (s1.equals("{")){
                count3++;
            }
            
        }

        System.out.println(count1);
        System.out.println(count2);
        System.out.println("Return for (:"+count(count1,s,")"));
        System.out.println("Return for [:"+count(count2,s,"]"));
        System.out.println("Return for {"+count(count3,s,"}"));
        String str = s;
        String[] arr = new String[s.length()];
        String str1;
        Boolean flag = true;
        // s="([])"
        if (str.length()%2!=0){
            flag=false;
        }
        else if (s.substring(0,s.length()).equals("(")&& !(s.substring(s.length()-1,s.length()).equals(")"))){

                flag=false;
            

        }
        else if (s.substring(0,s.length()).equals("[") && (s.substring(s.length()-1,s.length()).equals(")"))){
           
                flag=false;
            
        }
        else if (s.substring(0,s.length()).equals("{")&& !(s.substring(s.length()-1,s.length()).equals("}"))){
  
                flag=false;
            

        }
        
        else{
        for (int i=0;i<str.length();i++){

            str1=str.substring(i,i+1);
            if (i==0 && (str1.equals(")") || str1.equals("}") || str1.equals("]"))){
                flag = false;
                break;
            }
            if (str1.equals("(") || str1.equals("[")||str1.equals("{")){
                arr[i]=str1;
            }
            else if (arr[i-1]!=null && str1.equals(")")){
                if (arr[i-1].equals("[") || arr[i-1].equals("{")){
                    flag=false;
                    break;

                }
                
                
            }
            else if (arr[i-1]!=null && str1.equals("]")){
                if (arr[i-1].equals("(") || arr[i-1].equals("{")){
                    flag = false;
                    break;

                }

            }
            else if (arr[i-1]!=null  && str1.equals("}")){
                if (arr[i-1].equals("[") || arr[i-1].equals("()")){
                   flag = false;
                   break;

                }
                

            }

    
    }
    
} 
if (count(count1, s, ")") && count(count2, s, "]") && count(count3, s, "}") && flag) {
    System.out.println("true hai");;
} else {
    System.out.println("False hai");
}

    }       


}
            


