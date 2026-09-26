import java.util.*;
class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int a = Integer.MAX_VALUE;
        int b = 0;
        for(int i =0; i<n; i++) {
            if(nums[i] < a) {
                a = nums[i];
            }
            if(nums[i] > b) {
                b = nums[i];
            }
        }
        if(b==0) {
            return a;
        }
        while(b!=0) {
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
}