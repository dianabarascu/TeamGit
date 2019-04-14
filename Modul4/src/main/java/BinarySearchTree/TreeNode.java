package BinarySearchTree;

public class TreeNode {

    private final int key;
    private TreeNode left;
    private TreeNode right;
    private TreeNode parent;

    public TreeNode(int key) {
        this.key = key;
    }

    public TreeNode getLeft() {
        return left;
    }

    public int getKey() {
        return key;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
}
