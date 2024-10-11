public class divisorCount{
    public static void main(String[] args) {
        int N=4;
        int count=0;
        int count1=0;
        for (int j=1;j<=N;j++){
            count=0;
            for (int i=1;i<=j;i++){
            
            if (j%i==0){
                count=count+i;   
            }
            else{
                continue;
            }
        }    
        count1=count1+count;
        }
        System.out.println("ayush");
        System.out.println(count1);
        
    }
}
