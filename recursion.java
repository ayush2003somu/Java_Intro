class recursion{
    static void print(int i,int n){
        if (i==n+1){
            return;
        }
        System.out.println(i);
        print(i+1,n);
        
        }
    static int sum(int n){
            if (n==1){
                return 1;
            }
            return n+sum(n-1);
        }
    static int factorial(int n){
        if (n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    static void  fibonacci(int a,int b,int n){
        int c=a+b;
        System.out.println(c);
        if (n==0){
            return;
        }
        
        fibonacci(b, c, n-1);

        
    }
    static int callPower(int x, int n){
        if (n==1){
            return x;
        }

        return x*callPower(x, n-1);
        

    }
    static Boolean sorted(int[] arr ,int n){
        if (n==0) return true; 
        if (arr[n]<arr[n-1]){
            return false;
        }
        return sorted(arr, n-1);

    }
    static int binarySearch(int [] arr , int target, int beg, int end){
        
        if (beg<=end){
        int mid = (beg+end)/2;
        if (arr[mid]==target ){
            return mid;
        }
        else if (arr[mid]<target){
          return  binarySearch(arr, target, mid+1, end);

        }
        else if (arr[mid]>target){
            return binarySearch(arr, target, beg, mid-1);
        }
    }
        return -1;
    }
    public static void main(String[] args) {
    // for printing n numbers;
        print(1,5);        
        // for returning the sum of n numbers; 
        System.out.println(sum(5));

        // for returning factorial of n;;

        System.out.println("Factorial: "+factorial(5));

        //  for fibonacci sequence upto n;

        int a=0;
        int b=1;
        System.out.println("fibonacci series:-");
        System.out.println(a);
        System.out.println(b);
        int n=5;
        fibonacci(a, b, n-2);
        System.out.println("Power function test:: "+ callPower(0,3));

        //  ## to check if array is sorted or not ##
        int []arr = {0,1,2,3,4,5};
        System.out.println(sorted(arr,arr.length-1));
        System.out.println(binarySearch(arr, 2, 0, arr.length-1));


}
}