// Bubble sort

import java.util.*;
public class bubbuleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int test[]=new int[10];
        for (int i=0;i<10;i++){
        System.out.println("enter "+i+"th element:");
         size = sc.nextInt();
         test[i]=size;

        }
        for (int i=0;i<10;i++){
            System.out.print(test[i]+",");
        }
        System.out.println();
        for (int i =1;i<10;i++){
            for (int j=0;j<9;j++){
                if (test[j]>test[j+1]){
                    test[j]=test[j]+test[j+1];
                    test[j+1]=test[j]-test[j+1];
                    test[j]=test[j]-test[j+1];
                }
                else{
                    continue;
                }
            
            }

            }  
            for (int i=0;i<10;i++){
                System.out.print(test[i]+" ");

        }
    }
}

