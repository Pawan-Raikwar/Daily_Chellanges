// problem : 242
class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character,Integer>hm=new HashMap<>();
    HashMap<Character,Integer>hm1=new HashMap<>();

     if(s.length()!=t.length()){
        return false;
     }
     for(int i=0;i<s.length();i++){
        hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        hm1.put(t.charAt(i),hm1.getOrDefault(t.charAt(i),0)+1);
     }
     if(hm.equals(hm1)){
        return true;
     }
    return false;
    }
}

/// class Solution {
    public String removeDuplicates(String s) {
        // code here
        int n=s.length();
        StringBuilder str=new StringBuilder();
        
        for(int i=1;i<n;i++){
            if(s.charAt(i-1)==s.charAt(i)){
                continue;
            }
            else if(s.charAt(i-1)!=s.charAt(i)){
                str.append(s.charAt(i-1));
            }
        }
        str.append(s.charAt(n-1));
        return str.toString();
    }
