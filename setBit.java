// IN this program you can conver a Decimal value into Binary.

import java.util.*;

public class setBit{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter any Decimal digit:");
    //     int binaryNum = sc.nextInt();
    //     System.out.print("ENter the position:");
    //     int Pos =sc.nextInt();
    //     int reminderNum=0;
    //     ArrayList<Integer> bit = new ArrayList<Integer>();
    //     while (binaryNum>0){
    //         reminderNum=binaryNum%2;
    //         binaryNum=binaryNum/2;
    //         bit.add(reminderNum);
    //     }
    //     if (Pos>bit.size()-1){
    //         System.out.println("Not Set Bit");
    //     }
    //     else{
    //     for (int i=0;i<bit.size();i++){
    //         if (bit.get(Pos)==0){
    //             System.out.println("Not Set Bit");
    //             break;

    //         }
    //         else if  (bit.get(Pos)==1){
    //             System.out.println("Set Bit");
    //             break;
    //         }
    //     }

    //     }

    //     System.out.println("Reversed List of Binary NUmber"+bit);
    //     System.out.print("Binary Number:");
    //     for (int i=bit.size()-1;i>=0;i--){
    //         System.out.print(bit.get(i));
    //     }


    // // COUNT THE NUMBER OF SET BIT
    // System.out.println("Enter any Number");
    //   int bit1=sc.nextInt();
    //   int cnt = 0;
    //   while (bit1!=0){
    //     bit1=(bit1&bit1-1);
    //     cnt++;
    //   }
    //   System.out.println(cnt);
    
    //   Minimum Bit Flips to convert to anumber:

    System.out.print("ENter the start no.:");
    int Start=sc.nextInt();
    System.out.print("ENter the end number:");
    int end = sc.nextInt();
    int Num1=0;
    ArrayList<Integer> strt = new ArrayList<Integer>();
    ArrayList<Integer> end1 = new ArrayList<Integer>();
    while (Start>0){
        Num1=Start%2;
        Start=Start/2;
        strt.add(Num1);
}   
    System.out.println(strt); 
    int Num2=0;
    while (end>0) {
        Num2=end%2;
        end=end/2;
        end1.add(Num2);
}
System.out.println(end1);
int count=0;
        for (int i =0;i<strt.size();i++){
            
                if (strt.get(i)==end1.get(i)){
                    continue;
                }
                else{
                    count++;
                    
                }
            }
            System.out.println("No. of bit :"+count);
        }
       
}
