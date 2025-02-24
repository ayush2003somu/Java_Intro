import java.util.ArrayList;
import java.util.Collections;

public class medianArray {
    public static void main(String[] args) {
        int []nums1={1,2},nums2={3,4};
        double ans=0;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i:nums1){
            list.add(i);
        }
        for (int i:nums2){
            list.add(i);
        }
        Collections.sort(list);
        System.out.println(list);
        int temp=list.size()/2;
        if (list.size()%2==0){
            ans=(double)(list.get(temp)+list.get(temp-1))/2;
            System.out.println("list.get(temp)"+list.get(temp));
            System.out.println("list.get(temp-1)"+list.get(temp-1));
            System.out.println(temp);
        }
        else{
            ans=list.get(temp);
        }
        System.out.println(ans);
    }
}
