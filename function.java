import java.util.*;
public class function {
    
    public static int factorial(int i1){
        int a2=1;
        
        for (int i=1;i<=i1;i++){
            a2=i*a2;
            

        }
        return a2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1=0;
        for(int j=0;j<=a1;j++){
            b1=(j)/factorial(j)+b1;

        }
        System.out.println(b1);
    
    }
}
