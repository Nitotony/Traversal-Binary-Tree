class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;

        left=right=null;

    }
}



public class Traversal {

    public void preorder(TreeNode node){
        if(node==null){
            return;
        }
        System.out.print(node.val+" ");
        preorder(node.left);
        preorder(node.right);
    }


    public void inorder(TreeNode node){
        if (node==null){
            return;
        }

        inorder(node.left);
        System.out.print(node.val+" ");
        inorder(node.right);
    }

    public void postorder(TreeNode node){
        if(node==null){
            return;
        }

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val+" ");
    }




    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(8);

        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.right.right.right=new TreeNode(10);
        root.right.right.left=new TreeNode(9);


      
        Traversal tree=new Traversal();

        System.out.println("preorder:");

        tree.preorder(root);
        System.out.println();

        System.out.println("inorder:");

        tree.inorder(root);

        System.out.println();

        System.out.println("postorder:");

        tree.postorder(root);


    }
}