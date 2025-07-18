class Solution {
    public int[] findErrorNums(int[] nums) {
      int n = nums.length;
      int[] count = new int[n+1];
      int duplicate = -1,missing = -1;

      for(int num : nums){
        count[num]++;
      }  
      for(int i=1;i<=n;i++){
        if(count[i] == 2){
            duplicate = i;
        }else if (count[i] == 0){
            missing = i;
        }
        }
        return new int[]{duplicate,missing};
      }
      public static void main(String[] args) {
        Solution sol = new Solution();
        int[] result = sol.findErrorNums(new int[]{1, 2, 2, 4});
        System.out.println("[" + result[0] + ", " + result[1] + "]");

        int[] result2 = sol.findErrorNums(new int[]{1, 1});
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");
      }
    }
