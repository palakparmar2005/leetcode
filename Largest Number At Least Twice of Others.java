class Solution {
    public int dominantIndex(int[] nums) {
        int largest = 0;
        int ind = -1;
      int n = nums.length;
      for(int i=0; i<n; i++){
        if(largest<nums[i]){
            largest = nums[i];
            ind = i;
        }
      }
      for(int i=0; i<n; i++){
        if(nums[i] == largest)continue;
        if(2*nums[i] > largest)return -1;

      }
      return ind;

    }
}
