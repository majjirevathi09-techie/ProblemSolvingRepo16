class Solution {
    public void rotate(int[] nums, int k) {
        int N = nums.length;
       k=k%N;
       reverseArray(nums, 0, N-1);
        reverseArray(nums, 0,k-1);
        reverseArray(nums, k, N-1);
       
    }
    public static int[] reverseArray(int[]A, int start, int end){
       
        while(start<end){
            int temp=A[start];
            A[start]=A[end];
            A[end]=temp;
            start++;
            end--;
        }
        return A;
    }
}