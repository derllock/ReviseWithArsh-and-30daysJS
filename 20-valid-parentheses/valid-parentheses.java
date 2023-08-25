class Solution {
    public boolean isValid(String s){
        int equal=0,open=0,bracket=0;
        StringBuilder string=new StringBuilder(s);
        if(string.charAt(0)==')' || string.charAt(0)=='}' || string.charAt(0)==']') return false;
        for(int i=1; i<string.length();i++){
            if((string.charAt(i)==')' && string.charAt(i-1)=='(') ||
                        (string.charAt(i)=='}'&& string.charAt(i-1)=='{') ||
                        (string.charAt(i)==']' && string.charAt(i-1)=='[') ){
                            string.deleteCharAt(i);
                            string.deleteCharAt(i-1);
                            i=0;
                    }
                
                
        }
        System.out.print(string);
        if(string.toString().equals(""))return true;
        else return false;
    }
}    
    
