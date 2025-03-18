class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true; // Both null -> Symmetric
        if (t1 == null || t2 == null) return false; // Only one null -> Not symmetric
        if (t1.val != t2.val) return false; // Values should match

        // Compare left of t1 with right of t2 AND right of t1 with left of t2
        return isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}

