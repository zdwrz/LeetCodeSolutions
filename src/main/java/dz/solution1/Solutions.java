package dz.solution1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Dawei on 5/18/14.
 */
public class Solutions {

    public int numTrees(int n) {
        int num = 0;
        if(n == 0){
            return 0;
        }
        if(n == 1){
           return 1;
        }
        for(int i = 1 ; i <= n ; i ++){
            for(int j = 0 ; j < i-1; j++){
                num += numTrees(j);
                num += numTrees(j);
            }
        }
        return num;
    }

    public int maxProfit(int[] prices) {
        int maxprof = 0;
        if(prices == null){
            return maxprof;
        }
        int start = 0;
        for(int i = 1 ; i < prices.length ; i ++){
            if(prices[i] < prices[i-1] ){
                maxprof += prices[i-1] - prices[start];
                start = i;
            }
            else if(i == prices.length - 1 && prices[i] > prices[start]){
                maxprof += prices[i] - prices[start];
            }

        }
        return maxprof;
    }

    public int reverse(int x) {
        int res = 0;
        while (true) {
            if (x / 10 == 0) {
                res += x;
                break;
            }
            int lastDigi = x % 10;
            x /= 10;
            int y = (res + lastDigi) * 10;
            res = y;
        }
        return res;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        boolean isSame = true;

        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }

        isSame =  isSameTree(p.right,q.right);
        if(isSame == false){
            return false;
        }
        isSame =  isSameTree(p.left,q.left);

        return isSame;

    }

    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int depth = 1;
        if(root.left == null && root.right == null){
            depth = 1;
        }else{
            int depthL = 0;
            int depthR = 0;
            if(root.left !=null){
                depthL = 1;
                depthL += maxDepth(root.left);
            }
            if(root.right !=null){
                depthR = 1;
                depthR += maxDepth(root.right);
            }
            depth = depthL>depthR?depthL:depthR;
        }

        return depth;
    }

    public int singleNumber(int[] A) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < A.length ; i++){
            if(map.get(A[i]) != null){
                map.put(A[i],2);
            }else{
                map.put(A[i],1);
            }
        }
        Iterator<Map.Entry<Integer,Integer>> ite = map.entrySet().iterator();
        while(ite.hasNext()){
            Map.Entry<Integer,Integer> entry = ite.next();
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return 0;
    }
}
