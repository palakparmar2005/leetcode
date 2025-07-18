class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[]nums = new int[n];

        int start = 0;
        int end = 0;

        while(end<n){
            if(arr[start] == 0){
                nums[end] = 0;
                end++;
               if(end>=n)break;
               nums[end] = 0;
               end++;
               start++;
            }
            else{
                nums[end] = arr[start];
                end++;
                start++;
            }
        }
        for(int i=0;i<n;i++){
arr[i] = nums[i];
        }
    }
}
