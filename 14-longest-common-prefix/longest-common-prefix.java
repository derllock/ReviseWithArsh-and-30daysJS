class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1)return strs[0];
        if(strs[0].length()==0)return "";
       String finall="";
        int i=0;
        while(i<200){
           if(i==strs[0].length())return finall; 
          String prefix=strs[0].substring(i,i+1);
           for(int j=0;j<strs.length;j++){
               if(i==strs[j].length()|| prefix.equals(strs[j].substring(i,i+1))==false){
                   return finall;
               }
               
           }
           finall=finall+prefix;
           i++;
            
         
        }
        return finall;
            
           
    }
}