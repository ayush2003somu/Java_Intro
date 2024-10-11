
public class removeDuplicate {
    public static void main(String[] args) {
        int[] nums = {-1,0,0,1,1,2};
        int[] expectedNums = new int[nums.length];
        expectedNums[0]=nums[0];
        int k=nums[0];
        int x=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]!=k){
                expectedNums[x++]=nums[i];
                k=nums[i];
                
            }
            else{
                k=nums[i];
                continue;
            }
            
        }

        k=x;
        for(int i=1;i<expectedNums.length;i++){
            nums[i]=expectedNums[i];
            System.out.println(nums[i]);
        }
        System.out.println(k);
    }
    
}