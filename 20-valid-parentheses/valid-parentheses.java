class Solution {
    public boolean isValid(String s){
        int equal=0,open=0,bracket=0;
        StringBuilder string=new StringBuilder(s);
        
        for(int i=1; i<string.length();i++){
            if(string.charAt(0)==')' || string.charAt(0)=='}' || string.charAt(0)==']') return false;
            if((string.charAt(i)==')' && string.charAt(i-1)=='(') ||
                        (string.charAt(i)=='}'&& string.charAt(i-1)=='{') ||
                        (string.charAt(i)==']' && string.charAt(i-1)=='[') ){
                            string.deleteCharAt(i);
                            string.deleteCharAt(i-1);
                            i=i-2;
                    }
                    if(string.length()==1)return false;
                
                
        }
        System.out.print(string);
        if(string.toString().equals(""))return true;
        else return false;
    }
}    
    
