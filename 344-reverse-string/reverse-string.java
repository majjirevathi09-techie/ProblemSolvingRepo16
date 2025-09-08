class Solution {
    public void reverseString(char[] s) {
        
        int N = s.length; //length
        int i=0;
        int j=N-1;
        while(i<j){
            char temp = s[i]; //creating temp
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }
}