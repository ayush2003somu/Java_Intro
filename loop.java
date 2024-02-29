import java.util.Scanner;

public class loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int i1 =sc.nextInt();
        
        for (int counter=0;counter<i1+1;counter=counter+1){
            String str = "x";
            String x = str.repeat(counter);
            System.out.print(x);
            System.out.println();
 }

//  int i= 1;
//  do {
//      System.out.println("Hello world");
//      i++;
//  } while(i<0)    ;

    //  sum of n numbers
    
        // System.out.print("Enter any number:");
        // int s1 = sc.nextInt();
        // int s3=0;
        // for (int s2=1;s2<(s1+1);s2=s2+1){
        //     s3=s3+s2; 
        // }
        // System.out.println(s3);

    // Print any table of n

    System.out.print("Enter any number:");
    int s1 = sc.nextInt();
    int s2=1;
    while (s2<11){
        int s4=s2*s1;
        System.out.print(s1);
        System.out.print("x");
        System.out.print(s2);
        System.out.print("=");
        System.out.println(s4);
        s2++;

    }    
           




    }


    
}
