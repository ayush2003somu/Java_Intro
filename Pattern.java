import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Rectangle pattern code 
        // System.out.print("Enter Number of rows:");
        // int i1 = sc.nextInt();
        // System.out.print("Enter number of coloumn");
        // int i2 = sc.nextInt();
        // String s1 ="";
        // for (int i3=0;i3<i1;i3++){
        //     s1 = s1+"*";
        //  }
        // for(int i=0;i<i2;i++){
        //     System.out.println(s1);
        // }
        // System.out.print("no. of rows:");
        // int a = sc.nextInt();
        // System.out.print("No. of column");
        // int b = sc.nextInt();
        
        
        // //                             ****
                                //        *  *
        //   Print pattern like this -->  *  *
        //                                **** 
        // System.out.print("A");
        // int a= sc.nextInt();
        // System.out.print("B");
        // int b= sc.nextInt();
        // for(int i=1;i<=a;i++){
        //     for (int j=1;j<=b;j++){
        //         if (i==1 || j==1||i==a||j==b){
        //            System.out.print("x");
                    
        //             }
        //         else{
        //             System.out.print(" ");
        //         } 
                 
                
        //     }
        //     System.out.println();    
            
                
        // }
        // pyramid pattern

        System.out.print("A");
        int a= sc.nextInt();        
        // String s1="";
        // for (int i=1;i<=a;i++){
        //     for (int j=1;j<=i;j++){
        //         s1=s1+"x";
        //     }
        // System.out.println(s1);
        // s1="";    
            

        // }
    //    reverse pyramid
       
    // String s1="";
        // for (int i=a;i>=1;i=i-1){
        //     for (int j=1;j<=i;j=j+1){
        //         System.out.print("x");
        //     }
        //  System.out.println();
        // s1="";    
        // }

        // (pattern)- x
        //           xx
        //          xxx
        //         xxxx
        //        xxxxx   

        for (int i=1;i<=a;i++){
            int a1=a-i; //no. of spaces
            
            
            
                
                for (int k=1;k<=a1;k++){
                    System.out.print(" ");
                    


                }
                for (int j=1;j<=i;j++) {
                    System.out.print("x");
                }
             System.out.println();   
            
                

                
            }
                    
        }

    }


