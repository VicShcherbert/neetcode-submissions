class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> theList = new ArrayList<>();
        Arrays.sort(nums);
        // System.out.println(nums);
        // for(int a = 0; a < nums.length; a++){
        //     System.out.println(nums[a]);
        // }
        for(int v = 0; v < nums.length; v++){
            // int subtract = target - nums[v];
            if(v > 0 && nums[v] == nums[v - 1]){
                continue;
            }

            int left = v + 1, right = nums.length - 1;
            while(left < right){
                int threeSum = nums[v] + nums[left] + nums[right];
                
                if(threeSum > 0) right--;
                else if(threeSum < 0) left++;
                else {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[v]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    theList.add(list);
                    left++;
                    while(nums[left] == nums[left - 1] && left < right) {
                        left++;
                    }
                }
            }
        }
        return theList;
    }
}