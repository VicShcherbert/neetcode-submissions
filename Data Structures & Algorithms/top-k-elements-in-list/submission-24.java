class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> newMap = new HashMap<>();
        List<List<Integer>> freqList = new ArrayList<>();
        // int[] freqArr = new int[nums.length];
        int[] toReturn = new int[k];


        for(int number : nums) {
            if(newMap.containsKey(number)) {
                newMap.put(number, newMap.get(number) + 1);
            } else {
                newMap.put(number, 1);
            }
        }

        int biggestKey = 0;
        int biggestValue = 0;

        for(int v = 0; v < nums.length + 1; v++){
            freqList.add(new ArrayList<>());
        }
        System.out.println("Size: " + freqList.size());
        for (Map.Entry<Integer, Integer> entry : newMap.entrySet()){
            System.out.println("KEY: " + entry.getKey() + ", VALUE: " + entry.getValue());
            freqList.get(entry.getValue()).add(entry.getKey());
        }

        int index = 0;
        for(int v = freqList.size() - 1; v > 0; v--) {
            for(int a = 0; a < freqList.get(v).size(); a++) {
                if(index < k){
                    toReturn[index++] = freqList.get(v).get(a);
                } else {
                    return toReturn;
                }
            }   
        }
        System.out.println(freqList);

        System.out.println(toReturn);
        return toReturn;
    }
}
