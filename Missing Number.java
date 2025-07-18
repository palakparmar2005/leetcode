class Solution {
    public int missingNumber(int[] nums) {
        int sum_arr = 0;
        int sum_n = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum_arr = sum_arr+nums[i];
        }
        for(int i=0;i<=n;i++){
            sum_n = sum_n + i;
        }
        int ans = sum_n - sum_arr;
        return ans;
       }
    }
