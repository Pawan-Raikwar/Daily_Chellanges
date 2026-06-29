// problem number 1967
class Solution {
    public int numOfStrings(String[] patterns, String str) {
        int count=0;
        int n=patterns.length;
        for(int i=0;i<n;i++){
            if(str.contains(patterns[i])){
                count++;
            }
        }
        return count;
    }
}