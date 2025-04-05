package org.example.arrays.easy;

public class ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        // Helper function to build the tree
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBSTHelper(int[] nums, int left, int right) {
        // Base case: if there are no elements to process, return null
        if (left > right) {
            return null;
        }

        // Find the middle element to make it the root
        int mid = left + (right - left) / 2;
        TreeNode root = new TreeNode(nums[mid]);

        // Recursively build the left and right subtrees
        root.left = sortedArrayToBSTHelper(nums, left, mid - 1);
        root.right = sortedArrayToBSTHelper(nums, mid + 1, right);

        return root;
    }

    // Optional: A helper function to print the tree in Preorder for validation
    public void printPreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    public static void main(String[] args) {
        ConvertSortedArrayToBST solution = new ConvertSortedArrayToBST();

        // Example 1:
        int[] nums1 = {-10, -3, 0, 5, 9};
        TreeNode root1 = solution.sortedArrayToBST(nums1);
        System.out.println("Preorder traversal of BST1:");
        solution.printPreOrder(root1);  // To verify the tree structure

        System.out.println();

        // Example 2:
        int[] nums2 = {1, 3};
        TreeNode root2 = solution.sortedArrayToBST(nums2);
        System.out.println("Preorder traversal of BST2:");
        solution.printPreOrder(root2);  // To verify the tree structure
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
