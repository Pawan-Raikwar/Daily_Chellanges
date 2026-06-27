// problme number 3737
class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int temp[]=new int[n];

        if(nums[0]==target){
            temp[0]=1;
        }
        for(int i=1;i<n;i++){
            if(nums[i]==target){
                temp[i]=temp[i-1]+1;
            }else{
                temp[i]=temp[i-1];
            }
        }

        int count=0;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int freq;

                if(i==0){
                    freq=temp[j];
                }else{
                    freq=temp[j]-temp[i-1];
                }
                int len=j-i+1;
                if(freq>len/2){
                    count++;
                }
            }
        }
        return count;
    }
}