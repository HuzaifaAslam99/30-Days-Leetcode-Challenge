class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    int count;
    int result;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        inorderTraversal(root);
        return result;
    }

    private void inorderTraversal(TreeNode node) {
        if (node == null) return;

        inorderTraversal(node.left);
        count--;
        if (count == 0) {
            result = node.val;
            return;
        }
        inorderTraversal(node.right);
    }
}