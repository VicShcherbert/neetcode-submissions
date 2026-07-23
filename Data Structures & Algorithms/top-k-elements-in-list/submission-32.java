class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Map<Integer, Integer> newMap = new HashMap<>();
        // List<List<Integer>> freqList = new ArrayList<>();
        // int[] toReturn = new int[k];

        // //Found how many times each int appears
        // for(int number : nums) {
        //     if(newMap.containsKey(number)) {
        //         newMap.put(number, newMap.get(number) + 1);
        //     } else {
        //         newMap.put(number, 1);
        //     }
        // }

        // //Initialize every list inside of the list, nums.length + 1 (+1 because I want to get the frequency of the last number as well)
        // for(int v = 0; v < nums.length + 1; v++){
        //     freqList.add(new ArrayList<>());
        // }

        // //For every element in the map, add the array ints inside the corresponding count 
        // for (Map.Entry<Integer, Integer> entry : newMap.entrySet()){
        //     freqList.get(entry.getValue()).add(entry.getKey());
        // }

        // int index = 0;
        // //Go backwards through the list and get the biggest number and do not exceed the size of the return array (size = k)
        // for(int v = freqList.size() - 1; v > 0; v--) {
        //     for(int a = 0; a < freqList.get(v).size(); a++) {
        //         if(index < k){
        //             toReturn[index++] = freqList.get(v).get(a);
        //         } else {
        //             return toReturn;
        //         }
        //     }   
        // }
        // return toReturn;

        Map<Integer, Integer> itemCounts = new HashMap<>();
        List<List<Integer>> frequencyList = new ArrayList<>();
        int[] toReturn = new int[k];

        for(int c : nums){
            itemCounts.put(c, itemCounts.getOrDefault(c, 0) + 1);
        }
        for(int v = 0; v < nums.length + 1; v++){
            frequencyList.add(new ArrayList<>());
        }
        for(Map.Entry<Integer, Integer> entry : itemCounts.entrySet()){
            frequencyList.get(entry.getValue()).add(entry.getKey());
        }
        int count = k;
        int index = 0;
        for(int v = frequencyList.size() - 1; v > 0; v--){
            for(int number : frequencyList.get(v)){
                if(count == 0) return toReturn;
                toReturn[index++] = number;
                count--;
            }
        }
        // System.out.println(frequencyList);
        return toReturn; 
    }
}
