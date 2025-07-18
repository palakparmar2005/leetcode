/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.io.*;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.val = data;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;

        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}

public class Main {
    static TreeNode buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') return null;

        String[] ip = str.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(ip[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < ip.length) {
            TreeNode curr = queue.poll();

            if (!ip[i].equals("N")) {
                curr.left = new TreeNode(Integer.parseInt(ip[i]));
                queue.add(curr.left);
            }
            i++;
            if (i >= ip.length) break;

            if (!ip[i].equals("N")) {
                curr.right = new TreeNode(Integer.parseInt(ip[i]));
                queue.add(curr.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        TreeNode root = buildTree(input);

        Solution sol = new Solution();
        if (sol.isSymmetric(root)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
