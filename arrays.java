import java.util.*;

public class arrays {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array:");
    int size = sc.nextInt();
    int[] test = new int[size];
    

      for (int i=0;i<size;i++){
        System.out.print("Enter the "+i+"Th Number");
        int digit =sc.nextInt();
        test[i]=digit;   
        }
        System.out.print("Enter the number to find its index:"); 
        int x= sc.nextInt();
      System.out.print("The index of given number is:");
      for (int i=0;i<size;i++){
        if (x==test[i]){
          System.out.println(i);
        }

        else{
          continue;
        }
}
 }
}
