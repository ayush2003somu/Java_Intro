import java.util.*;
public class function {
    public static void factorial(int i1){
        int a2=1;
        
        for (int i=1;i<=i1;i++){
            a2=i*a2;
            

        }
        System.out.println(a2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        // int a2 = sc.nextInt();
        factorial(a1);
    
    }
}
