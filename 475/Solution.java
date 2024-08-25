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

 //Binary Postorder Traversal
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        return Traversal(root, arr);
    }
    public List<Integer> Traversal(TreeNode root, List<Integer> arr) {
        if(root != null) {
            Traversal(root.left, arr);
            Traversal(root.right, arr);
            int data = root.val;
            arr.add(data);
        }
        return arr;
    }
}