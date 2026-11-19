class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList();
        int i=0;
        while (i < str.length()){
            int j = str.indexOf('#', i); //next delimiter
            int l = Integer.parseInt(str.substring(i, j));
            strs.add(str.substring(j+1,j+l+1));
            i=j+l+1;
            
        }
        return strs;
    }
}
