class Solution {
    public int reverse(int x) {
        int lastDigit;
        int reverseNumber=0;
        while(x!=0){
            lastDigit=x%10;
        //check for overflow
        if(reverseNumber > Integer.MAX_VALUE/10 || reverseNumber == Integer.MAX_VALUE/10 && lastDigit>7){
            return 0;
        }
        //check for underflow
        if(reverseNumber < Integer.MIN_VALUE/10 || reverseNumber == Integer.MIN_VALUE/10 && lastDigit<-8){
            return 0;
        }

            reverseNumber = reverseNumber*10+lastDigit;
            x=x/10;
        }
        return reverseNumber;
    }
}