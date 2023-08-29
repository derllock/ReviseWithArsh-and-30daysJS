class Solution {
    public boolean validPalindrome(String s) {
        if(s.length()==1)return true;
        StringBuilder sbreverse=new StringBuilder(s);
        sbreverse.reverse();
        StringBuilder sb=new StringBuilder(s);
        int anomaly=0;
        int index=0;
        while(index<sb.length()){
            if(sb.charAt(index)!=sbreverse.charAt(index)){
                StringBuilder sb2=new StringBuilder(sb);
                StringBuilder sbreverse2=new StringBuilder(sbreverse);
                if(sb.deleteCharAt(index).compareTo(sbreverse.deleteCharAt(sbreverse.length()-1-index))==0)return true;
                else if(sb2.deleteCharAt(sb2.length()-1-index).compareTo(sbreverse2.deleteCharAt(index))==0)return true;
                else return false;
                }
            
            ++index;
        }
        return true;
    }
}