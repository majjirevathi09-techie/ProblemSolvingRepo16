class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> hmap = new HashMap<Integer, Integer>();
        int complement=0;
        int[] result=new int[2];
        for(int i=0;i<nums.length;i++){
            complement = target-nums[i];
             if(hmap.containsKey(complement)){
                result[0]=hmap.get(complement);
                result[1]=i;
                //int result[]={hmap.get(complement),i};
                return result;
            }
            hmap.put(nums[i], i);   
        }
        return null;
    }
}