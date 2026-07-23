class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] intArray = new int[2];

        int left = 0, right = numbers.length - 1;
        while(left < right){
            if(numbers[left] + numbers[right] == target){
                intArray[0] = left + 1;
                intArray[1] = right + 1;
                return intArray;
            }

            if(numbers[left] + numbers[right] > target) right--;
            else left++;
        }
        return intArray;
    }
}
