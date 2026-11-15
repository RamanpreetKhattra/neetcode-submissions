class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res= new ArrayList();
        Map<String,List<String>> map= new HashMap();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            int count[]=new int[26];
            for(int j=0;j<s.length();j++){
                count[s.charAt(j)-'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for(int j=0;j<26;j++){
                sb.append(count[j]);
                sb.append("#");
            }
            if(map.containsKey(sb.toString())){
                List<String> lst=map.get(sb.toString());
                lst.add(s);
            }else{
                List<String> lst = new ArrayList<>();
                lst.add(s);
                map.put(sb.toString(),lst);
            }
        }

        res.addAll(map.values());
        return res;
    }
}
