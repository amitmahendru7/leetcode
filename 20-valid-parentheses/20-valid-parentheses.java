class Solution {
    private HashMap<Character, Character> mappings;
    public Solution(){
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')','(');
        this.mappings.put('}','{');
        this.mappings.put(']','[');
    }
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            //Check for the CLosing bracket
            if(this.mappings.containsKey(c)){
                char topElement = stack.isEmpty() ? '#': stack.pop();
                if(topElement != this.mappings.get(c))
                    return false;
            }
            else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}