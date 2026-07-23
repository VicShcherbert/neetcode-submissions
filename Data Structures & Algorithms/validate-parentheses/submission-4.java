class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        Map<Character, Character> symbols = new HashMap<>();
        symbols.put('}', '{');
        symbols.put(']', '[');
        symbols.put(')', '(');

        Stack<Character> charStack = new Stack<>();
        //stack.push('');

        for(int v = 0; v < s.length(); v++){
            //checking the last half means we won't be adding anymore into the stack
            //if the element is in the list, then that means we are now in the second half of the string
            if(symbols.containsKey(s.charAt(v))){
                //check for the value to be on the top of the stack
                if(!charStack.empty() && symbols.get(s.charAt(v)) == charStack.peek()){
                    charStack.pop();
                } else {
                    return false;
                }
            } else {
                charStack.push(s.charAt(v));
            }
        }

        if(charStack.empty()){
            return true;
        } else {
            return false;
        }
    }
}
