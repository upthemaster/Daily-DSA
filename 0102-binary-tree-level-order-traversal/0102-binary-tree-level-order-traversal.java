class Solution { //Level order Traversal
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        List<Integer> currentLevel = new ArrayList<>();

        while (!q.isEmpty()) {

            TreeNode currNode = q.remove();

            if (currNode == null) {

                result.add(currentLevel);
                currentLevel = new ArrayList<>();

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {

                currentLevel.add(currNode.val);

                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

        return result;
    }
}