class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String st:strs){
            char ch[] = st.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            List<String> val=map.getOrDefault(s,new ArrayList<>());
            val.add(st);
            map.put(s,val);
        }
        return new ArrayList<>(map.values());
    }
}