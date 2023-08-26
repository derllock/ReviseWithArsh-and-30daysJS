class Solution {
    public String longestCommonPrefix(String[] strs) {
 
    if(strs.length==1)return strs[0];
    
    int minIndex=0,minLength=Integer.MAX_VALUE;
    for(int i=0;i<strs.length;i++){
        if(strs[i].length()<minLength){
            minIndex=i;
            minLength=strs[i].length();
        }

    }
    if(minLength==0)return "";
    
    String finalAns="";
    for(int i=0;i<minLength;i++){
        String subs=strs[minIndex].substring(i,i+1);
        for(int j=0;j<strs.length;j++){
            if(subs.equals(strs[j].substring(i,i+1))==false)return finalAns;
        }
        finalAns+=subs;
    }
    return finalAns;
            
           
    }
}