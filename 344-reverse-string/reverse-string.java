class Solution {
     
    //  int a=10; int b=20;
    
    //  a=a+b; b=a-b; a=a-b; //SWAP 2 nos using Math Oper

    //a=a^b; b=a^b; a=a^b; //SWAP using bitwise oper


    public void reverseString(char[] s) {
        //SWAP IS USED
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