class Solution {
    public int maxNumberOfBalloons(String text1) {
        int n=text1.length();
        boolean ans=true;
        HashMap<Character,Integer>hm=new HashMap<>();

        for(int i=0;i<n;i++){
            char ch=text1.charAt(i);
            if(ch=='b' || ch=='a' || ch=='l' || ch=='o' || ch=='n'){
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
        }
        String str="balloon";
         n=str.length();
        int i=0;
        int text=0;
        while(ans){

           if(i==n){
                text+=1;
                i=0;
                continue;
           }
           char ch1=str.charAt(i);
           if(hm.getOrDefault(ch1, 0) <= 0){
            ans=false;
            break;
           }
          hm.put(ch1,hm.getOrDefault(ch1,0)-1);
           i++;
        }
        return text;
    }
}