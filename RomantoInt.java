import java.util.*;
public class RomantoInt {
    public static int rom(char s){

        if (s== 'I'){
            return 1;
        }
        else if (s=='V'){
            return 5;
        }
        else if (s=='X'){
            return 10;
        }        
        else if (s=='L'){
            return 50;
        }        
        else if (s=='C'){
            return 100;
        }        
        else if (s=='D'){
            return 500;
        }
        else if (s=='M'){
            return 1000;
        }
        else{
            return 0;
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roaman string:-");
        String roman = sc.nextLine().toUpperCase();
        int[] arr = new int[roman.length()+1];
        int n1;
        char a1;
        for (int i=0;i<roman.length();i++){

            a1=roman.charAt(i);
            n1=rom(a1);
            arr[i]=n1;
        }

        n1=0;
        if (arr.length==1){
            System.out.println(arr[0]);
        }
        else{}
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                n1=n1+arr[i];
            }
            else if (arr[i]==arr[i+1]){
                n1=n1+arr[i+1];
            }
            else if (arr[i]<arr[i+1]){
                n1=n1+(arr[i+1]-arr[i]);
                 i++;
            
            } 
        }
        System.out.println(n1);
        }
        }


    
    
