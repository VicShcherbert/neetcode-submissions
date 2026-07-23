class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> toReturn = new HashMap<>();

        for(String theString : strs){
            //Need to get the frequency count array
            int[] freqArray = new int[27];
            for(char c : theString.toCharArray()){
                freqArray[c - 'a']++;
            }
            //Convert the freqArray to a string so we can store it as a key in the Map
            String key = Arrays.toString(freqArray);
            toReturn.putIfAbsent(key, new ArrayList<>());
            toReturn.get(key).add(theString);
        }

        return new ArrayList<>(toReturn.values());
    }
}
