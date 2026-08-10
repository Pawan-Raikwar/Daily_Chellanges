//https://www.geeksforgeeks.org/dsa/convert-sentence-equivalent-mobile-numeric-keypad-sequence/
//Convert a sentence into its equivalent mobile numeric keypad sequence

class Solution {
    String printSequence(String S) {
        // code here
        HashMap<Character,Integer>num=new HashMap<>();
        HashMap<Character,Integer>hm=new HashMap<>();
        
        num.put('A',2);
                num.put('B',2);
        num.put('C',2);        num.put('D',3);  num.put('E',3);
        num.put('F',3);        num.put('G',4);
        num.put('H',4);        num.put('I',4);        num.put('J',5);
        num.put('K',5);        num.put('L',5);        num.put('M',6);
        num.put('N',6);        num.put('O',6);
        num.put('P',7);        num.put('Q',7);
        num.put('R',7);        num.put('S',7);
        num.put('T',8);        num.put('U',8);        num.put('V',8);
        num.put('W',9);        num.put('X',9);
        num.put('Y',9);        num.put('Z',9);

        
        hm.put('A',1); hm.put('B',2); hm.put('C',3);
        hm.put('D',1);hm.put('E',2);hm.put('F',3);hm.put('G',1);
        hm.put('H',2);hm.put('I',3); hm.put('J',1); hm.put('K',2); hm.put('L',3);hm.put('M',1);
        hm.put('N',2); hm.put('O',3); hm.put('P',1);hm.put('Q',2);hm.put('R',3);hm.put('S',4);
        hm.put('T',1); hm.put('U',2); hm.put('V',3); hm.put('W',1); hm.put('X',2); hm.put('Y',3);
        hm.put('Z',4);
        
        StringBuilder str=new StringBuilder();
        
        int n=S.length();
        for(int i=0;i<n;i++){
            char ch=S.charAt(i);
            if(ch==' '){
                str.append(0);
                continue;
            }
          
            if(ch=='*'){
                str.append("*");
            }
            int pri=num.get(ch);
            int run=hm.get(ch);
            
            while(run>0){
                str.append(pri);
                run--;
            }
            
        }
        return str.toString();
        
    }
}