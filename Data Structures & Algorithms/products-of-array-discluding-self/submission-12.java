class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] toReturn = new int[nums.length];
        int prefix = 1;
        int postfix = 1;
        
        toReturn[0] = 1;
        for(int v = 0; v < nums.length - 1; v++){
            prefix = prefix * nums[v];
            toReturn[v + 1] = prefix;
        }

        for(int v = nums.length - 1; v > 0; v--){
            postfix = nums[v] * postfix;
            toReturn[v - 1] = toReturn[v-1] * postfix;
        }
        return toReturn;
    }
}  
