package tree;

public class Tree {
    Node root;
    Node insertNodes(Node root, int data){
        if(root==null){
            return new Node(data);
        }
        if(root.data>data){
            insertNodes(root.left,data);
        }
        else{
            insertNodes(root.right,data);
        }
        return root;
    }
}
