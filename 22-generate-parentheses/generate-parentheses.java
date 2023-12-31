class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        StringBuilder sb=new StringBuilder();
        backtrack(list, sb, 0, 0, n);
        return list;
    }
    
    public void backtrack(List<String> list, StringBuilder str, int open, int close, int max){ //foundation backtracking
        
        if(str.length() == max*2){
            list.add(str.toString());
            return;
        }
        
        if(open < max)
            {str.append("(");
            backtrack(list, str, open+1, close, max);
            str.deleteCharAt(str.length() - 1);
            }
        if(close < open)
            {str.append(")");
            backtrack(list, str, open, close+1, max);
            str.deleteCharAt(str.length() - 1);
            }
    }
}