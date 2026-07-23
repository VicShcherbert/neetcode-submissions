class Solution {
    public int lengthOfLongestSubstring(String s) {
        // int left = 0;
        // Set<Character> list = new HashSet<>();
        // int result = 0;

        // for(int right = 0; right < s.length(); right++){
        //     while(list.contains(s.charAt(right))){
        //         //remove the left
        //         list.remove(s.charAt(left));
        //         left++;
        //     }
        //     //add to the set
        //     list.add(s.charAt(right));
        //     if((right - left + 1) > result) result = right - left + 1;
        // }

        // return result;

        int left = 0;
        int right = 0;
        Set<Character> list = new HashSet<>();
        int max = 0;

        while(right < s.length() && left < s.length()){
            System.out.println("--");
            System.out.println(list);
            if(list.contains(s.charAt(right))){
                list.remove(s.charAt(left));
                left++;
                // list.add(s.charAt(right));
            } else {
                // System.out.println(s.charAt(right));
                list.add(s.charAt(right));
                int possibleMax = right - left + 1;
                System.out.println(possibleMax);
                if(possibleMax > max) max = possibleMax;
                right++;
            }
            System.out.println(list);
        }
        return max;
    }
}
