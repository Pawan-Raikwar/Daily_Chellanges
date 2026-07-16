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