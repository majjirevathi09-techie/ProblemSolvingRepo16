class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int copy=x;
        int lastDigit;
        int result=0;
        while(x!=0){
            lastDigit = x%10;
            result = (result*10)+lastDigit;
            x/=10;
        }
        if(result==copy){
            return true;
        }
        return false;
    }
}