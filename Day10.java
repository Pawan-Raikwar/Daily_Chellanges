import java.util.*;
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        HashSet<Integer>hs=new HashSet<>();
        ArrayList<Integer>ans=new ArrayList<>();
        
        for(int i=0;i<A.length;i++){
            hs.add(A[i]);
        }
        
        int first=1;
        int last=A.length;
        
        while(first!=last+1){
            if(!hs.contains(first)){
                ans.add(first);
            }
            first++;
        }
       Arrays.sort(A);
        for(int i=0;i<last-1;i++){
            if(A[i]==A[i+1] && !ans.contains(A[i])){
                ans.add(A[i]);
            }
        }
        int a[]=new int[ans.size()];
        int j=0;
        for(int i=ans.size()-1;i>=0;i--){
            a[j++]=ans.get(i);
        }
      //  Arrays.sort(a);

         return a;   
    }
}
