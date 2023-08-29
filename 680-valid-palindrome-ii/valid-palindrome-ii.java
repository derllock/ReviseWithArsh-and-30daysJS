class Solution {
    public boolean validPalindrome(String s) {
        StringBuilder sbreverse=new StringBuilder(s);
        sbreverse.reverse();
        StringBuilder sb=new StringBuilder(s);
        int index=0;
        StringBuilder sb2=new StringBuilder(sb);
         StringBuilder sbreverse2=new StringBuilder(sbreverse);
        while(index<sb.length()){
            if(sb.charAt(index)!=sbreverse.charAt(index)){
                
                if(sb.deleteCharAt(index).compareTo(sbreverse.deleteCharAt(sbreverse.length()-1-index))==0)return true;
                else if(sb2.deleteCharAt(sb2.length()-1-index).compareTo(sbreverse2.deleteCharAt(index))==0)return true;
                else return false;
                }
            
            ++index;
        }
        return true;
    }
}