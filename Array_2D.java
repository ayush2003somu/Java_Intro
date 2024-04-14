import java.util.*;
public class Array_2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row:");
        int row=sc.nextInt();
        System.out.print("Enter the coloumn:");
        int col=sc.nextInt();
        int[][] testArray = new int[row][col];

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print("values:");
                int num =sc.nextInt();
                testArray[i][j]= num;
                
            }

        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(testArray[i][j]+",");
            }
            System.out.println();
        } 
        System.out.print("Enter the number to find its index:");
        int numAsk = sc.nextInt();
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (testArray[i][j]==numAsk){
                    System.out.print(numAsk+" found at location"+"("+i+","+j+")");
                }
                else{
                    continue;
                }
                
            }
            

        }        
        
        

    }
}
