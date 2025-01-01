/**
 * rough
 */
class rough{
    public static int fun(int i1,int i,int n){
        if (i<=n){          
            i1=i1+((i*i)*i);
            fun(i1,i+1,n);
            
            
        }
        return i1;
    }
    public static void main(String[] args) {
        System.out.println(fun(0,1,5));
    }
}
