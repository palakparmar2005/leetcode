class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        long t = 0;

        for(int i=0;i<n-2;i++){
            if(i!=0 && nums[i] == nums[i-1]){
                continue;
            }

            long a = nums[i];
            long need = t-a;

            int start = i+1;
            int end = n-1;

            while(start<end){
                long c = nums[start];
                long d = nums[end];

                long sum = c+d;

                if(sum<need){
                    start++;
                }

                else if(sum>need){
                    end--;
                }

                else{
                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[start]);
                    arr.add(nums[end]);

                    ans.add(arr);

                    start++;

                    while(start<end && nums[start] == nums[start-1]){
                        start++;
                    }
                }
            }
        }

        return ans;
    }
}
