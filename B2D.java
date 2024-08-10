// Readme
// Thsi program is for Changing Binary Number to Decimal.
import java.util.*;
public class B2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any BInary digit:");
        int binaryNum = sc.nextInt();
        int a1=0;
        int b1=binaryNum;
        int a3=1;
        int b3=0;
        while (binaryNum>0){
        
        b1=binaryNum%10;
        binaryNum=binaryNum/10;
        a1++;

        for (int j=0;j<a1;j++){
        if (j==0){
            a3=1;
        }     
        else{
        a3=a3*2;
        } 
        }
        b3=b3+(b1*a3);
            
        a3=1;

        }
        
        
System.out.println(b3);
                
            }
            
        }
        

        
