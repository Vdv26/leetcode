class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sum_even = 0;
        for(int i =0; i<=2*n; i+=2) {
            sum_even+= i;
        }
        int sum_odd = 0;
        for(int i =1; i<=2*n-1; i+=2) {
            sum_odd += i;
        }
        while(sum_odd != 0) {
            int temp = sum_even%sum_odd;
            sum_even = sum_odd;
            sum_odd = temp;
        }
        return sum_even;
    }
}