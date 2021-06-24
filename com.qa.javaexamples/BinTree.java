package com.qa.javaexamples;

public class BinTree {

  public static void main(String[] args) {
    TreeNode t1 = new TreeNode();
    TreeNode t2 = new TreeNode();
    t2.makeLeft();
    TreeNode t3 = new TreeNode();
    t3.makeLeft();
    t3.makeRight();
    t3.left().makeLeft();
    t3.left().makeRight();
    t3.right().makeLeft();
    t3.right().makeRight();
    System.out.println(perfectCheck(t1));
    System.out.println(perfectCheck(t2));
    System.out.println(perfectCheck(t3));
  }

  /*
   This is a function to check if a binary tree is perfect (i.e. all levels are filled).
   If there is a left child and no right child, or vice-versa then it fails.
   If there are no left or right children it passes at this level.
   If there are both left and right children, it checks that both the children are perfect.
  */
  private static boolean perfectCheck(TreeNode node) {
    if (node.left() == null && node.right() == null) {
      return true;
    } else if (node.left() == null || node.right() == null) {
      return false;
    } else {
      return perfectCheck(node.left()) && perfectCheck(node.right());
    }
  }
}

/*
A basic TreeNode class, has methods to make the left and right children and to return
left and right children. No values can be stored.
 */
class TreeNode {
  private TreeNode left;
  private TreeNode right;

  public void makeLeft() {
    this.left = new TreeNode();
  }

  public void makeRight() {
    this.right = new TreeNode();
  }

  public TreeNode left() {
    return this.left;
  }

  public TreeNode right() {
    return this.right;
  }
}
