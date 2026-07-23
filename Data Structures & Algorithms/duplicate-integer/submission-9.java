class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Boolean> theMap = new HashMap<>();

        for(int v = 0; v < nums.length; v++){
            //check in the map
            if(theMap.get(nums[v]) != null) return true;

            theMap.put(nums[v], false);
        }

        //Try to traverse the Map:

        for(Map.Entry theElement : theMap.entrySet()){
            System.out.println("Key: " + theElement.getKey()); 
            System.out.println("Value: " + theElement.getValue()); 
        }
        return false;
    }
}