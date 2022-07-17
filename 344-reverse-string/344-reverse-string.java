class Solution {
    public void reverseString(char[] s) {
        revereseRecursive(s,0, s.length-1);
    }
    
    public void revereseRecursive(char[] s, int left, int right){
        if(left>=right)
            return;
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        revereseRecursive(s, left+1, right-1);
    }
}