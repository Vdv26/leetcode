#include <algorithm>
class Solution {
public:
    int majorityElement(vector<int>& nums) {
        int n = nums.size();
        int temp = 0;
        sort(nums.begin(), nums.end());
        int mid = n/2;
        int majority_element = nums[mid];
        return majority_element;
    }
};