class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] arr=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n){
            arr[k]=nums1[i];
            i++;
            k++;    
        }
        while(j<m){
            arr[k]=nums2[j];
            j++;
            k++;
        }       
        for(int a=0;a<arr.length;a++){
            for(int b=a+1;b<arr.length;b++){
                if(arr[a]>arr[b]){
                    int temp=arr[a];
                    arr[a]=arr[b];
                    arr[b]=temp;
                }
            }
        }
        int len=arr.length;
        if(len%2 == 1){
            return arr[len/2];
        }
        else{
            return (arr[len/2-1]+arr[len/2])/2.0;
        }
    }
}