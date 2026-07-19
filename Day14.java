//Form the Largest Number

class Solution {
    public String findLargest(int[] arr) {
        // code here
        int n=arr.length;
        
        String element[]=new String[n];
        
        for(int i=0;i<n;i++){
            element[i]=Integer.toString(arr[i]);
        }
        
        Arrays.sort(element,new Comparator<String>(){
            public int compare(String a,String b){
                String first=a+b;
                String sec=b+a;
                return sec.compareTo(first);
            }
        });
        
        if(element[0].equals("0")){
            return "0";
        }
        StringBuilder Str=new StringBuilder();
        
        for(String val:element){
            Str.append(val);
        }
        return Str.toString();
    }
}