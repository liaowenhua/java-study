package com.lwh.algorithms;

public class BST {
    private Node root;
    
    public void setRoot (int val) {
        root = new Node(val, 1);
    }
    public int size (Node node) {
        return node.N;
    }
    
    public int size () {
        return size(root);
    }
    
    public Node put (int val) {
        return put(root, val);
    }
    
    public Node put (Node x, int val) {
        if (x == null) return new Node(val, 1);
        
        if (val < x.val) x.left = put(x.left, val);
        
        if (val > x.val) x.right = put(x.right, val);
        
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    }
    
    public boolean get (int val) {
        return get(root, val);
    }
    
    public boolean get (Node node, int val) {
        System.out.println("get " + node);
        if (node == null) return false;
        if (val == node.val) {
            return true;
        }else if (val < node.val) {
            return get(node.left, val);
        }else {
            return get(node.right, val);
        }
    }
    
    private class Node {
        private int val;
        private Node left, right;
        private int N = 0;//子节点的个数
        public Node (int val, int n) {
            this.val = val;
            this.N = n;
        }
        public int getVal() {
            return val;
        }
        public void setVal(int val) {
            this.val = val;
        }
        public Node getLeft() {
            return left;
        }
        public void setLeft(Node left) {
            this.left = left;
        }
        public Node getRight() {
            return right;
        }
        public void setRight(Node right) {
            this.right = right;
        }
        public int getN() {
            return N;
        }
        public void setN(int n) {
            N = n;
        }
        @Override
        public String toString() {
            return "Node [val=" + val + ", left=" + left + ", right=" + right + ", N=" + N + "]";
        }
        
        
    }
    
    public static void main(String[] args) {
        BST bst = new BST();
        bst.setRoot(1);
        bst.put(4);
        bst.put(3);
//        bst.put(2);
        
        System.out.println(bst.get(1));
        System.out.println(bst.get(4));
    }
}
