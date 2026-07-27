class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=1;
            int ele=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(ele==nums[j])return true;
            }
        }
        return false;
    }
}