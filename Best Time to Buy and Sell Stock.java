class Solution {
    public int maxProfit(int[] arr) {
        int min_price = 1000000000;
        int profit = 0;
        int ans = 0;
        int n = arr.length;

    for(int i=0; i<n; i++){
    if(min_price > arr[i]){
        min_price = arr[i];
    }    
     profit = arr[i] - min_price;
    if(ans < profit){
     ans = profit;
    }
    }
    
    return ans;    
    }
}
