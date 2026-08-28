class Solution {
    public String minWindow(String s, String t) {
        HashMap <Character,Integer> h1=new HashMap<>();
        HashMap <Character,Integer> h2=new HashMap<>();
        for(char ch:t.toCharArray()){
            h2.put(ch,h2.getOrDefault(ch,0)+1);
        }
        int l=0;
        String minimum="";
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            h1.put(ch,h1.getOrDefault(ch,0)+1);
            while(isValid(h1,h2)){
                String curr=s.substring(l,r+1);
                if(curr.length()<minimum.length() || minimum.equals("")){
                    minimum=curr;
                }
                char remove=s.charAt(l);
                h1.put(remove,h1.get(remove)-1);
                l++;
            }
        }
        return minimum;
    }
    public static boolean isValid(HashMap <Character,Integer> h1,HashMap <Character,Integer> h2){
        for(char k:h2.keySet()){
            if(!(h1.containsKey(k)) || h1.get(k) < h2.get(k)){
                    return false;
            }
        }
        return true;
    }
}