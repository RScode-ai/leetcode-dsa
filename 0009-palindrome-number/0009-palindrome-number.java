class Solution {
    public boolean isPalindrome(int x) {
        int m = x;
        int pal = 0;
        while(m>0){
            int r = m%10;
            pal = pal * 10 + r;
            m = m / 10;
        }
        if(pal == x){
            return true;
        }
        else{
            return false;
        }
    }
}