class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> hmap= new HashMap<>();
        for(int n: arr){
            int remainder=n%k;
            if(remainder<0){remainder+=k;}
            hmap.put(remainder,hmap.getOrDefault(remainder,0)+1);
        }
        for (int key:hmap.keySet()){
            if(key==k-key || key==0){
                if(hmap.get(key)%2!=0)return false;
            }
            else if (!hmap.get(key).equals(hmap.getOrDefault(k-key,0))) return false;
        }
        return true;
    }
}