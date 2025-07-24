
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {


       List<List<Integer>> ans = new ArrayList<>();
        
         Deque<TreeNode> dq = new ArrayDeque<>();

    if(root == null){
        return ans;
    }

    dq.addLast(root);

    boolean flag = true;

    while(!dq.isEmpty()){
        int siz = dq.size();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0;i<siz;i++){
           TreeNode temp = dq.removeFirst();

            if(temp.left != null){
                dq.addLast(temp.left);
            }

            if(temp.right != null){
                dq.addLast(temp.right);
            }

            arr.add(temp.val);
        }

        List<Integer> curr = new ArrayList<>();

        if(flag == true){
            for(int i=0;i<siz;i++){
              curr.add(arr.get(i));
            }
        }
        else{
            for(int i=siz-1;i>=0;i--){
                curr.add(arr.get(i));
            }
        }

        ans.add(curr);

      
    }
    return ans; 
    }
}
