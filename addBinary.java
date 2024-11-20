import java.util.*;
public class addBinary{
    public static void main(String[] args){
        String s1 ="101101" ;
        String s2= "1101010";
    
        int i1= Integer.parseInt(s1,2);
        int i2=Integer.parseInt(s2,2);
 
 
        String result = Integer.toBinaryString(i1+i2);
        System.out.println(result);
        int x=214748363;
        int count =0;
        for (int i=1;i*i<=x;i++){
           if (x%i==0 && i*i==x){
             System.out.println(i); 
             break;
               
           }
           else{ 
               count =i;
           }
   
        } 
System.out.println(count);

    }
}
