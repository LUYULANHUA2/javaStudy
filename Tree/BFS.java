package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 8, 11, 0, 13, 4, 7, 2, 0, 0, 5, 1 };
        TreeNode root = buildBFS(arr);
        show(root);
    }

    public static TreeNode buildBFS(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode root = new TreeNode(arr[0]);
        queue.offer(root);
        int index = 1;
        while (index < arr.length && !queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (index < arr.length && arr[index] != 0) {
                current.left = new TreeNode(arr[index++]);
                queue.offer(current.left);
            } else {
                index++;
            }
            if (index < arr.length && arr[index] != 0) {
                current.right = new TreeNode(arr[index++]);
                queue.offer(current.right);
            } else {
                index++;
            }
        }

        return root;
    }

    public static void show(TreeNode tree) {
        TreeNode root = tree;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        int step = 0;
        int key = 2;
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            if (current != null) {
                System.out.print(current.val + " ");
                // if(current.left!=null)queue.offer(current.left);
                // if(current.right!=null)queue.offer(current.right);
                queue.offer(current.left);
                queue.offer(current.right);
            } else
                System.out.print("null ");
            step++;
            if ((step + 1) == key) {
                System.out.println();
                key = key * 2;
            }

        }
    }
}
