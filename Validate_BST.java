class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class Solution {
    TreeNode prev = null;

    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }

    private boolean inorder(TreeNode node) {
        if (node == null) return true; // Base case

        // Check left subtree
        if (!inorder(node.left)) return false;

        // Check current node (values must be increasing)
        if (prev != null && node.val <= prev.val) return false;
        prev = node; // Update previous node

        // Check right subtree
        return inorder(node.right);
    }
}
