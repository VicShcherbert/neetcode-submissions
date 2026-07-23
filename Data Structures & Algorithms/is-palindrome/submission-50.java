class Solution {
    public boolean isPalindrome(String s) {
        // if(s.isBlank()) return true;
        // if(s == ".") return true;
        // String noExtraChars = s.replaceAll("[^A-Za-z]", "");
        // String allLower = noExtraChars.toLowerCase();
        // System.out.println("All Lower: " + allLower);


        // int left = 0, right = allLower.length() - 1;
        // boolean trueOrNot = false;

        // while(left <= right){
        //     if(allLower.charAt(left) == allLower.charAt(right)){
        //         trueOrNot = true;
        //     } else {
        //         return false;
        //     }
        //     left++;
        //     right--;
        // }
        // return trueOrNot;

        // Check if the string is empty
        if(s.isEmpty()) return false;
        if(s == ".") return true;
        //Remove all the whitespace
        String newString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0;
        int right = newString.length() - 1;
        System.out.println(newString);

        while(left <= right){
            if(newString.charAt(left) == newString.charAt(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}

// public boolean isLetter(char c){
//         if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) return true;

//         return false;
//     }





































