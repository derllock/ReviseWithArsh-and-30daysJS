class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        else{
            int ddend=x;
            int remainder=0;
            while(ddend>0){
                remainder=remainder*10+ddend%10;
                ddend/=10;
            }
            System.out.println(remainder);
            if(remainder==x)return true;//oye
            else return false;
        }
    }
}