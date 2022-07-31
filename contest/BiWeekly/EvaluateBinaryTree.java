package BiWeekly;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class EvaluateBinaryTree {

    public static boolean f(TreeNode root) {
        if (root.val == 0 || root.val == 1) {
            return root.val == 1 ? true : false;
        }

        if (root.val == 2) {
            boolean l = f(root.left);
            boolean r = f(root.right);
            return l || r;
        } else {
            boolean l = f(root.left);
            boolean r = f(root.right);
            return l && r;
        }

    }

    public static boolean evaluateTree(TreeNode root) {
        return f(root);
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(0);
        

        System.out.println(evaluateTree(t));
    }
}
