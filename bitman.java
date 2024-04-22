import java.util.Scanner;

public class bitman {
    public static void main(String[] args) {
// Bit Manupulation

    // Get Bit 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();//Binary number (0101)
        System.out.print("Enter the position number:");
        int pos =sc.nextInt(); // bit or position like (3rd bit (2nd position) )
        int num3 = 1<<pos;
        if ((num & num3)==0){
            System.out.println("0 is present at "+pos+".");
        }
        else{
            System.out.println("1 is present at "+pos+".");
        }

    // Set Bit
    
   
    }
}
