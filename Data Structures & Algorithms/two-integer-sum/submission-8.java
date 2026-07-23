class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int leftPointer = 0;
        // int rightPointer = nums.length - 1;
        int[] numberList = new int[2];

        // while(leftPointer != rightPointer){
        //     if(nums[leftPointer] + nums[rightPointer] == target){
        //         numberList[0] = leftPointer;
        //         numberList[1] = rightPointer;
        //         return numberList;
        //     } else {
        //         if(nums[leftPointer] + nums[rightPointer] < target) leftPointer++;
        //         if(nums[leftPointer] + nums[rightPointer] > target) rightPointer--;
        //     }
        // }
        // return numberList;

        Map<Integer,Integer> newMap = new HashMap<>();

        for(int v = 0; v < nums.length; v++){
            int compliment = target - nums[v];
            if(newMap.containsKey(compliment)){
                numberList[0] = newMap.get(compliment);
                numberList[1] = v;
                return numberList;
            } else {
                newMap.put(nums[v], v);
            }
        }
        return numberList;
    }
}
