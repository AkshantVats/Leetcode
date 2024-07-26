/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null; // If the root is null, return null indicating no common ancestor
        }

        if (root == p || root == q) {
            return root; // If the root is either p or q, return the root as it is a common ancestor
        }

        TreeNode leftCommon = lowestCommonAncestor(root.left, p, q);
        TreeNode rightCommon = lowestCommonAncestor(root.right, p, q);

        // Check if both nodes are present in the current subtree
        if (leftCommon != null && rightCommon != null) {
            return root; // If both left and right subtrees have non-null common ancestors, root is the common ancestor
        }

        // Choose the non-null subtree if one of them is non-null
        return (leftCommon != null) ? leftCommon : rightCommon;
    }
}