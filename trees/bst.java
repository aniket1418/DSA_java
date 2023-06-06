package trees;

import java.util.LinkedList;
import java.util.Queue;

public class bst {
    //Node structure.
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Tree tranverse
    public static class BinaryTree{
        static int indx = -1;
        public static Node buildTree(int nodes[]){
            indx++;
            if(nodes[indx]== -1){
                return null;
            }
            Node newNode = new Node(nodes[indx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    //preorder tranverse
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data + "");
        preorder(root.left);
        preorder(root.right);
    }

    //inorder tranverse
    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.println(root.data + "");
        inorder(root.right);
    }

    //post order tranverse
    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + "");
    }

    //Level order Tranverse
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node currNode =q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+ "");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    //Count the nodes of a tree
    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int left = countNode(root.left);
        int right = countNode(root.right);
        return left + right + 1;

    }

    //Sum of nodes 
    public static int sumOfNodes(Node root){

        if(root == null){
            return 0;
        }
        int left = sumOfNodes(root.left);
        int right = sumOfNodes(root.right);
        return left + right + root.data;
    }

    // Height of a tree.
    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        int myheight = Math.max(leftHeight, rightHeight) + 1;
        return myheight;
    }
    //main method
    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        preorder(root);
        System.out.println("In order tranverse");
        inorder(root);
        System.out.println("Post Order");
        postOrder(root);
        System.out.println("Level tranversal");
        levelOrder(root);
        System.out.println("Count the no. nodes");
        System.out.println(countNode(root));
        System.out.println("Sum of nodes");
        System.out.println(sumOfNodes(root));
        System.out.println("Height of a tree");
        System.out.println(heightOfTree(root));
    }
}
