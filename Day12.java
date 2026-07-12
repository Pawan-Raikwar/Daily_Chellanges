// leetcode problem :153
// 152 OP solution dekhana hai

// sum of the sorted and rotetad array
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
       HashSet<Integer>hs=new HashSet<>();
       
       
       int n=arr.length;
       
       for(int i=0;i<n;i++){
           int rem=target-arr[i];
           
           if(hs.contains(rem)){
               return true;
           }else{
               hs.add(arr[i]);
           }
       }
       return false;
    }
}

/// maximum water of the array
class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int n=height.length;
        int left=0;
        int right=n-1;

        while(left<=right){
            int min=Math.min(height[left],height[right]);
            int width=right-left;
            max=Math.max(max,min*width);
           
           if(height[left]<height[right]){
              left++;
           }else{
            right--;
           }
        }
    return max;
    }
}

// Kth Smallest

class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int i=1;
        int ans=0;
        while(i!=k+1){
            ans=pq.remove();
            i++;
        }
        return ans;
    }
}

//Overlapping Intervals


class Solution {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        
        if(arr==null || arr.length==0){
            return new ArrayList<>();
        }
        
        Arrays.sort(arr, Comparator.comparingInt(row -> row[0]));
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        int n=arr.length;
        int start=arr[0][0];
        int end=arr[0][1];
        
        for(int i=1;i<n;i++){
            
          if(end>=arr[i][0]){
              end=Math.max(arr[i][1],end);
              //end=arr[i][1];
          }else{
              ArrayList<Integer>list=new ArrayList<>();
              list.add(start);
              list.add(end);
              ans.add(list);
              start=arr[i][0];
              end=arr[i][1];
          }
            
        }
         ArrayList<Integer> list = new ArrayList<>();
        list.add(start);
        list.add(end);
        ans.add(list);
        
        return ans;
    }
}