public class buySellStock {
    public static void main(String[] args) {
        int [] prices = {7,6,4,3,8};
        int cnt = prices[0] ;
        int mid = 0;
        int max =0;
        for (int i=0;i<prices.length;i++){
        if (prices[i]>cnt){
            max=Integer.max(max,prices[i]-cnt);
        }
        cnt=Integer.min(cnt,prices[i]);
        
        }
        System.out.println(max);
    }

}
