import java.util.*;
public class pattern_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // System.out.print("Enter any number:");
        // int a=sc.nextInt();
        // int b=0;

        // Number pattern Type-1
        
        // for (int i=1;i<=a;i++){
            
        //     for (int j=1;j<=i;j++){
        //           System.out.print(b);
        //           b++;

        //         }
                
        // System.out.println();
                
                


        //     }
        
        // System.out.println();    
        // }

        // Number pattern type 2.

        System.out.print("Enter any number:");
        int a=sc.nextInt();
        // int b=0;

        // for (int i=1;i<=a;i++){
        //     int c=0;
        //     for(int j=1;j<=i;j++){
        //         if(i%2==0){

                
        //         if (b==1){
        //             System.out.print("1");
        //             b=0;
        //         }
        //         else{
        //             System.out.print("0");
        //             b=1;
        //         }
        //         }
        //     else{
        //         if(c==1){
        //             System.out.print("0");
        //             c=0;
        //         }
        //         else{
        //             System.out.print("1");
        //             c=1;

                    
                    
                    
        //         }
                 
        //     }    
        //     }
        //     System.out.println();
        // }
         
        // for (int i=1;i<=a;i++){
        //     int b=a-i;
        //     for (int j=1;j<=b;j++){
        //         System.out.print(" ");

        //     }
        //     for (int j=1;j<=i;j++){
        //         System.out.print("x");
        //         System.out.print(" ");

        //     }
            // for (int j=1;j<=b;j++){
            //     System.out.print(" ");

            // }

            
        // System.out.println(); 

        // }
        // for (int i=a-1;i>=1;i--){
        //     int b=a-i;
        //     for (int j=1;j<=b;j++){
        //         System.out.print(" ");

        //     }
        //     for (int j=1;j<=i;j++){
        //         System.out.print("x");
        //         System.out.print(" ");

        //     }
        //     // for (int j=1;j<=b;j++){
        //     //     System.out.print(" ");

        //     // }
            
            
        // System.out.println(); 

        // }        

    
        // for (int i = 1; i <= a; i++) {
        //     // Calculate number of spaces for each row (equal on both sides)
        //     int spaces = a - i;

        //     // Print spaces
        //     for (int j = 0; j < spaces; j++) {
        //         System.out.print(" ");
        //     }

        //     // Print first asterisk
        //     System.out.print("*");

        //     // Print middle spaces (only for rows other than the first and last)
        //     if (i > 1 && i < a) {
        //         for (int j = 1; j <= (i - 2); j++) {
        //             System.out.print(" ");
        //         }
        //     }

        //     // Print last asterisk (except for the first row)
        //     if (i != 1) {
        //         System.out.print("*");
        //     }

        //     System.out.print(" ");
        //     System.out.println();    

        // }
        
// #Butterfly Pattern

        // for (int i=1;i<=a;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print("x");

        //     }
        //     int space=2*(a-i);
        //     for(int j=1;j<=space;j++){
        //         System.out.print(" ");

        //     }
        //     for (int j=1;j<=i;j++){
        //         System.out.print("x");

        //     }
        //     System.out.println();   
        // }
        // for (int i=a;i>=1;i--){
        //     for (int j=1;j<=i;j++){
        //         System.out.print("x");

        //     }
        //     int space=2*(a-i);
        //     for(int j=1;j<=space;j++){
        //         System.out.print(" ");

        //     }
        //     for (int j=1;j<=i;j++){
        //         System.out.print("x");

        //     }
        //     System.out.println();   
        // }     

// #pattern zig-zag
    // for (int i=1;i<=a;i++){
    //     for (int j=1;j<=a-i;j++){       
    //     System.out.print(" ");
    // }
    //     for (int j=1;j<=a;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }    
    
    // #EQULATRIAL TRIANGLE WITH SERIES OF NUMBER

    for (int i=1;i<=a;i++){
        for (int j=1;j<=a-i;j++){
            System.out.print(" ");

        }
        for (int j=1;j<=i;j++){
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
    }
         
}


    
}


