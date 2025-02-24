import java.util.Arrays;

public class array2 {
    public static void main(String [] args){
        int[] nums1 = {1,2,3,0,0,0};
        int []  nums2 = {2,5,6};
        for (int i=0;i<nums2.length;i++){
            nums1[i+3]=nums2[i];
        }
        Arrays.sort(nums1);
        for (int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+",");
        }
        System.out.println(nums1);
    }
}   