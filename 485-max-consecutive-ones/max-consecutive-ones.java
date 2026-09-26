class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0;
        int count1 = 0;
        int result = 0;
        for(int i =0; i<n; i++) {
            if(nums[i] == 1) {
                count++;
                if(count > count1) {
                count1 = count;
                }
                
            }
            else {
                count = 0;
            }
            
           
        }
        
        return count1;
        
    }
}