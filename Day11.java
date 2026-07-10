// leetcode 152
class Solution {
    public int maxProduct(int[] nums) {
       int n=nums.length;
       int dp[]=new int[n];
       int max=nums[0];
     
      for(int i=0;i<n-1;i++){
        dp[i]=nums[i];
        for(int j=i+1;j<n;j++){
            dp[j]=dp[j-1]*nums[j];
            max=Math.max(max,dp[j]);
        }
      }
      for(int i=0;i<n;i++){
        max=Math.max(nums[i],max);
      }
      return max;
    }
}
/// leetcode 42
class Solution {
    public int trap(int[] height) {
        int n=height.length;


        int left[]=new int[n];
        int right[]=new int[n];

        left[0]=height[0];
        right[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
             right[i]=Math.max(right[i+1],height[i]);
        }
        int ans=0;
        for(int i=1;i<n;i++){
                int waterLevel=Math.min(right[i],left[i]);
                ans+=waterLevel-height[i]*1;

        }

    return ans;
    }
}
