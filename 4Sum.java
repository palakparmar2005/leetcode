import java.util.*;
import java.io.*;
class Solution {
   public List<List<Integer>> fourSum(int[] nums, int target) {
       // Write your code here
       List<List<Integer>> ans = new ArrayList<>();

       Arrays.sort(nums);

       int n= nums.length;
       
       long T = target;

       for(int i=0; i<n-3; i++){

        if(i>0 && nums[i] == nums[i-1]){
            continue;
        }

        for(int j=i+1; j<n-2; j++){

            if(j>i+1 && nums[j]==nums[j-1]){
                continue;
            }
            long a = nums[i];
            long b = nums[j];

            long sum = a+b;
            long need = T -sum;

            int start = j+1;
            int end = n-1;

            while(start<end){
                long c = nums[start];
                long d = nums[end];
                long curr = c+d;

                if(curr<need){
                    start++;
                }

                else if(curr>need){
                    end--;
                }

                else{
                    List<Integer> fans = new ArrayList<>();
                    fans.add(nums[i]);
                    fans.add(nums[j]);
                    fans.add(nums[start]);
                    fans.add(nums[end]);

                    ans.add(fans);
                    start++;

                    while(start<end && nums[start] == nums[start-1]){
                        start++;
                    }
                }
            }
        }
       }
       return ans;
   }
}

public class Main
{
	    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int k = sc.nextInt();
        Solution Obj = new Solution();
        List<List<Integer>> res = Obj.fourSum(nums, k);

      
        for(int i= 0; i<res.size(); i++){
           Collections.sort(res.get(i));
        }

     
        Collections.sort(res, new Comparator<List<Integer>>() {
               public int compare(List<Integer> frst, List<Integer> scnd) {
                    int i=0;
                    while(frst.get(i)==scnd.get(i)) i++;
                    return frst.get(i)-scnd.get(i);
                    }
                });

        for(int i=0; i<res.size(); i++){   
            for(int j=0; j<4; j++){
                System.out.print(res.get(i).get(j) + " ");
            } 
            System.out.println("");
        }
        sc.close();
	}
}
