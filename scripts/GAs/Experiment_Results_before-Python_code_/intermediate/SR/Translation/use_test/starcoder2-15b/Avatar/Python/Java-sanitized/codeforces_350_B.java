class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.