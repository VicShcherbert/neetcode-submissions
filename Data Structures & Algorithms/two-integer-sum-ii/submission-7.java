class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // if(numbers.length == 1) return numbers[0];
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
        // for(int leftPointer = 0; leftPointer < numbers.length - 1; leftPointer++){
        //     for(int rightPointer = 1; rightPointer < numbers.length; rightPointer++){
        //         System.out.println("LEFT: " + leftPointer + " RIGHT: " + rightPointer);
        //         if(numbers[leftPointer] + numbers[rightPointer] == target){
        //             intArray[0] = leftPointer+1;
        //             intArray[1] = rightPointer+1;
        //             return intArray;
        //         }
        //     }
        // }

        return intArray;
    }
}
