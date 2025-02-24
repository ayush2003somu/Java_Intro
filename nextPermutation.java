class nextPermutation{
    static void reverse(int[] nums,int start , int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }   
    }    
    public static void main(String[] args) {
        int [] nums={2,3,1,3,3};
                int index=-1;
                for (int i=nums.length-2;i>=0;i--){
                    if (nums[i+1]>nums[i]){
                        index=i;
                        break;
                    }
                }
                    if (index==-1){
                        reverse(nums,0,nums.length-1);
                        return;
                    }

                for (int i=nums.length-1;i>=index;i--){
                    if (nums[i]>nums[index]){ 
                            int temp=nums[i];
                            nums[i]=nums[index];
                            nums[index]=temp;                
                            break;
                        
                    }
                }
                System.out.println(index);
                for (int i:nums) 
                {
                    System.out.print(i+",");
                    
            } System.out.println();
                reverse(nums,index+1,nums.length-1);
                for (int i:nums) 
                {
                    System.out.print(i+",");
            }        
            }
        }
