class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxone=0;
        int cursum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cursum++;
            }
            else{
                maxone=Math.max(cursum,maxone);
                cursum=0;
            }
        }
        maxone=Math.max(cursum,maxone);

        return maxone;
        
    }
}
