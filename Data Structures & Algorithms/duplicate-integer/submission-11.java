class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Set<Integer> mapForNums = new HashSet<>();

        // for(int num : nums){
        //     if(mapForNums.contains(num)){
        //         return true;
        //     }
        //     mapForNums.add(num);
        // }
        // return false;

        Set<Integer> list = new HashSet<>();

        for(int v = 0; v < nums.length; v++){
            if(list.contains(nums[v])) return true;
            else list.add(nums[v]);
        }
        return false;
    }
}