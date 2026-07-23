class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        Set<Character> list = new HashSet<>();
        int result = 0;

        for(int right = 0; right < s.length(); right++){
            while(list.contains(s.charAt(right))){
                //remove the left
                list.remove(s.charAt(left));
                left++;
            }
            //add to the set
            list.add(s.charAt(right));
            if((right - left + 1) > result) result = right - left + 1;
        }

        return result;
    }
}
