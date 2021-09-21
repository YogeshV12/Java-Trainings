public class ArrTree {
	class Node
    {
        int key;
        Node left, right;
 
        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }
	
	Node root;
	 
    
    ArrTree()
    {
         root = null;
    }
 
    void insert(int key)
    {
         root = insertRec(root, key);
    }
    
    Node insertRec(Node root, int key)
    {
 
        //empty
        if (root == null)
        {
            root = new Node(key);
            return root;
        }
 
        
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
        return root;
    }
    
    void inorder()
    {
         inorderRec(root);
    }
 
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    void Preorder()
    {
         PreorderRec(root);
    }
	
    void preorderRec(Node root)
    {
        if (root != null) {
            System.out.println(root.key);
            inorderRec(root.left);
            inorderRec(root.right);
        }
    }
    
    void postorder()
    {
         postorderRec(root);
    }
	
    void postorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            inorderRec(root.right);
            System.out.println(root.key);
        }
    }
	
    public Node BstSearch(Node root, int data)
    {
        if (root==null || root.key==data)
            return root;
        if (root.key < data)
            return BstSearch(root.right, data);
        return BstSearch(root.left, data);
    }
    
    
    public static void main(String[] args)
    {
        ArrTree tree = new ArrTree();
 
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();
    }
    
}
