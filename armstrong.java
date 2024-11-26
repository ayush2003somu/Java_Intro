import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int num = sc.nextInt();
        int n1=0;
        int num1=num;
        ArrayList<Integer> arr =new ArrayList<Integer>();
        while (num>0){     
           n1=num%10;
           num=num/10;
           arr.add(n1); 
        }
        n1= arr.size();

        int count=0;
        for (int i=n1-1;i>=0;i--){
            int pow=1;
            for (int j=0;j<n1;j++){
            pow= arr.get(i)*pow;
            
            }
            count=pow+count;
            System.out.println(count);
        }
        if (count==num1){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }

    }
}
