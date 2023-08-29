class Solution {
    public boolean validPalindrome(String s) {
        StringBuilder sbreverse=new StringBuilder(s);
        sbreverse.reverse();
        StringBuilder sb=new StringBuilder(s);
        if(sb.compareTo(sbreverse)==0)return true;
        int index=0;
        StringBuilder sb2=new StringBuilder(sb);
         StringBuilder sbreverse2=new StringBuilder(sbreverse);
        while(index<sb.length()){
            if(sb.charAt(index)!=sbreverse.charAt(index)){
                
                if(sb.deleteCharAt(index).compareTo(sbreverse.deleteCharAt(sbreverse.length()-1-index))==0)return true; // for test case:cbcc if we 
                else if(sb2.deleteCharAt(sb2.length()-1-index).compareTo(sbreverse2.deleteCharAt(index))==0)return true;// encounter wrong char we have check both permutations
                else return false;
                }
            
            ++index;
        }
        return true;
    }
}