class Solution {
    public void moveZeroes(int[] nums) {
        int putNonZeroValuesHere=0;
        int temp;
        for(int current=0;current<nums.length;current++){
            if(nums[current]!=0){
                //swap
                temp = nums[putNonZeroValuesHere];
                nums[putNonZeroValuesHere] = nums[current];
                nums[current]=temp;
                putNonZeroValuesHere++;
            }
        }
    }
}