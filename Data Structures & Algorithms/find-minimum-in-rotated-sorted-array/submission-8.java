class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int minimum = nums[left];

        while(left <= right){
            if(nums[left] <= nums[right]) {
                if(nums[left] <= minimum){
                    minimum = nums[left];
                }
                break;
            }
            int mid = left + (right - left) / 2;

            if(nums[mid] <= minimum){
                minimum = nums[mid];
            }

            if(nums[mid] >= nums[left]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return minimum;
    }
}
