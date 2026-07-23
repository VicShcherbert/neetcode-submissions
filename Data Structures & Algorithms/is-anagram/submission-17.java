class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sString = new HashMap<>();
        Map<Character, Integer> tString = new HashMap<>();
        
        if(s.length() != t.length()) return false;
        for(int v = 0; v < s.length(); v++){
            char ss = s.charAt(v);
            char ts = t.charAt(v);

            sString.put(ss, sString.getOrDefault(ss, 0) + 1);
            tString.put(ts, tString.getOrDefault(ts, 0) + 1);
        }
        if(sString.equals(tString)) return true;
        return false;
    }
}
