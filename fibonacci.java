public class fibonacci {
    public static int fi(int x){
        if (x<=1){
            return x;
        }
        else{
            return fi(x-1)+fi(x-2);
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println(fi(3));
    }
}
