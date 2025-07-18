class Solution {
    public void moveZeroes(int[] nums) {
    
    int count = 0;
    ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] == 0){
                count++;
            }
            else{
                arr.add(nums[i]);
            }
        }
        for(int i=0; i<count; i++){
            arr.add(0);
        }
        for(int i=0; i<n; i++){
            nums[i] = arr.get(i);
        }
    }
}
