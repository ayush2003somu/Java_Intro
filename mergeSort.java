import java.util.*;
class mergeSort {
    void merge(int arr[],int l,int mid,int r){
    List<Integer> temp = new ArrayList<>();
    int left = l;
    int right=mid+1;
    while(left<=mid && right<=r){
        if (arr[left]<=arr[right]) {
            temp.add(arr[left]);
            left++;
        }
        else{
            temp.add(arr[right]);
            right++;
        }
    }
    while (left<=mid){
        temp.add(arr[left]);
        left++;
    }
    while(right<=r){
        temp.add(arr[right]);
        right++;
    }
    for (int i=0;i<temp.size();i++){
        arr[i]=temp.get(i);
    }
}
    void mergeSort(int arr[], int l, int r) {
        
        if (l==r) return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
        
    }
}
