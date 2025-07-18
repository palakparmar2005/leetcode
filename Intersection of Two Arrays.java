class Solution {
   public int[] intersection(int[] nums1, int[] nums2) {
   int[] arr1 = new int[1001];
   int[] arr2 = new int[1001];
   int n = nums1.length;
    int m = nums2.length;

    for(int i=0; i<n; i++){
    int ele = nums1[i];
    arr1[ele]++;
    }
    for(int i=0; i<m; i++){
    int ele = nums2[i];
    arr2[ele]++;
    }
    ArrayList<Integer> vec = new ArrayList<>();
    for(int i=0; i<=1000; i++){
    if(arr1[i]>0 && arr2[i]>0){
    vec.add(i);
        }
    }
    int k = vec.size();
    int [] ans = new int[k];
    for(int i=0; i<k; i++){
        ans[i] = vec.get(i);
    }
    return ans;
    }
}
