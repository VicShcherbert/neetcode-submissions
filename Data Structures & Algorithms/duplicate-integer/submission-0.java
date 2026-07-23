class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> mapForNums = new HashSet<>();

        for(int num : nums){
            if(mapForNums.contains(num)){
                return true;
            }
            mapForNums.add(num);
        }
        return false;
    }
}