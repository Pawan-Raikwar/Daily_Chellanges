class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        int n=nums.length;

        // first find pivot element
        for(int i=n-2; i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverse(nums);
            return;
        }
        // 2nd next larget element
        for(int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                swap(nums,i,pivot);
                break;
            }
        }
        // 3rd reverse from pivot+1 to n-1

        int i=pivot+1;
        int j=n-1;

         while(i<=j){
             swap(nums,i++,j--);
         }
    }
    public static void swap(int nums[],int a ,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static void  reverse(int nums[]){
        int left=0;
        int right=nums.length-1;

        while(left<right){
             swap(nums,left,right);
             left++;
             right--;
        }
    }
}