package dz.solution1;

/**
 * Created by Dawei on 5/18/14.
 */
public class TestMain {
    public static void main(String[] arg){
        Solutions sol = new Solutions();
        int[] prices = new int[]{1,5,2,7,10};
/*        int[] A = new int[]{1};
        System.out.print(sol.singleNumber(A));*/
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(5);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node3.left = node5;
        node5.right = node6;
      //  System.out.println(sol.maxDepth(root));
      //  System.out.println(sol.isSameTree(node5,node6));
      //  System.out.println(sol.reverse(-100));
      //  System.out.println(sol.maxProfit(prices));
        System.out.println(sol.numTrees(3));
    }

}
