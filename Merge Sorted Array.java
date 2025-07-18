class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int s = 0;
        int f = 0;
       while(s<m && f<n){
        if(nums1[s] <= nums2[f]){
            arr.add(nums1[s]);
            s++;
        }
        else{
            arr.add(nums2[f]);
            f++;
        }
       }
        while(s<m){
            arr.add(nums1[s]);
            s++;

        }
        while(f<n){
            arr.add(nums2[f]);
            f++;
        }
        for(int i=0; i<nums1.length; i++){
            nums1[i] = arr.get(i);
        }
     
     }

    }
