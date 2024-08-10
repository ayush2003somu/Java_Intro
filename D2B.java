// IN this program you can conver a Decimal value into Binary.

import java.util.*;

public class D2B{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Decimal digit:");
        int binaryNum = sc.nextInt();
        int reminderNum=0;
        ArrayList<Integer> bit = new ArrayList<Integer>();
        while (binaryNum>0){
            reminderNum=binaryNum%2;
            binaryNum=binaryNum/2;
            bit.add(reminderNum);
        }
        System.out.println(bit);
        for (int i=bit.size()-1;i>=0;i--){
            System.out.print(bit.get(i));
        }
    }

}