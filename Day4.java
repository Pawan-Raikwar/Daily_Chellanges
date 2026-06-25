class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n=arr.length;
        int second=-1;
        int firstLargest=-1;
        
        for(int i=0;i<n;i++){
            
            if(arr[i]>firstLargest){
                second = firstLargest;
                firstLargest=arr[i];
            }else if(arr[i]<firstLargest && arr[i]>=second){
                second=arr[i];
            }
        }
        return second;
    }
}