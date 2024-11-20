import java.util.*;

public class GCD {
    public static Long gcd(long a,long b){
        long n1=0;
        for (int i=1;i<= (a>b? a:b);i++){
           if (a%i==0 && b%i==0){
                n1=i;
            }
        }
        return n1;
    }
    public static void main(String[] args) {
        Long[] arr = new Long[2];
        long A =5;
        long  B =10 ;
        long lcm= (A*B/gcd(A,B));

        arr[0]=gcd(A, B);
        arr[1]=lcm;
        int i=0;
        while(i<2){
            System.out.println(arr[i]+"ayush");
            i++;
        }
    }
}