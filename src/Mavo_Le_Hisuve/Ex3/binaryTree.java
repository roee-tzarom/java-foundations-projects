// -----------------------------------------------------------------------------
// Binary-tree implementation used in the exercise. Nodes are arranged by key so
// traversal and lookup demonstrate the recursive tree structure clearly.
// -----------------------------------------------------------------------------

package Mavo_Le_Hisuve.Ex3;


import Mavo_Le_Hisuve.Ex3.pdfUtils.BinaryTree;
import Mavo_Le_Hisuve.Ex3.pdfUtils.BinaryTreeClass;


public class binaryTree {


    public static boolean checkTree(BinaryTree<Integer> T, int L){
        if(T == null && T.isEmpty()){
            return false;
        }
        return BinaryTreeHelper(T,0,L);
    }
    public static boolean BinaryTreeHelper (BinaryTree<Integer> node,int level ,int L){
        if (node == null) {
            return true;
        }


        if (node.isEmpty()) {
            return false;
        }
        if (level >= L) {
            if (node.getRoot() <= 10 || node.getRoot() % 2 != 0) {
                return false;
            }
        }
        boolean hesLeft = node.getLeft() != null && !node.getLeft().isEmpty();
        boolean hesRight =node.getRight() != null && !node.getRight().isEmpty();


        if(hesLeft != hesRight){
            return false;
        }


        boolean leftCheck = BinaryTreeHelper(node.getLeft(), level + 1, L);
        boolean rightCheck = BinaryTreeHelper(node.getRight(), level + 1, L);

