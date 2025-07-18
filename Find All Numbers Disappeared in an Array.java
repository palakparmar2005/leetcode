class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       int n = nums.length;
       int[]arr = new int[n+1];
     
     for(int i=0; i<n; i++){
        int ele = nums[i];
           arr[ele]++;
        }
        ArrayList<Integer> vec= new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(arr[i] == 0){
                vec.add(i);
            }
        }
     
     return vec;
    }
}
