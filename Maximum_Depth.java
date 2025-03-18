class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

// Change class name to "Solution" for LeetCode compatibility
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0; // Base case: empty tree

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }
}

