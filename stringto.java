import java.util.*;
import java.lang.Math;


public class stringto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:");
        int binaryNum = sc.nextInt();
        int numVal=0;
        int  i1 =0;
        int i2=0;
        StringBuilder s1= new StringBuilder();
        while (binaryNum>0){
            i1=binaryNum%10;
            for (int i;i>=i2;i++){
                
            }
            numVal=numVal+(i1*(Math.pow(2,i2)));
        }
        

        }        
    }

    
}
