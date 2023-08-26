class Solution {
    public int strStr(String haystack, String needle) {
        int start=0,index=0;
        while(start+needle.length()<=haystack.length()){
            if(haystack.substring(start,start+needle.length()).equals(needle))return start;
            ++start;
        }
        return -1;
    }
}