package BinarySearchTree;


public class BinarySearchTree {

    private TreeNode root;

    public void add(int key){

        TreeNode newNode = new TreeNode(key);

        if(root == null){
            root = newNode;
            return;
        }

        TreeNode currentNode = root;

        while (true) {
            // Add second value
            if (currentNode.getKey() < key) {
                if(currentNode.getRight() != null){
                    currentNode = currentNode.getRight();
                    continue;
                }
                currentNode.setRight(newNode);
                newNode.setParent(currentNode);
                return;//Stop the loop
            }
            //Symetry
            else if (currentNode.getKey() > key) {
                if(currentNode.getLeft() != null){
                    currentNode = currentNode.getLeft();
                    continue;
                }
                currentNode.setLeft(newNode);
                newNode.setParent(currentNode);
                return;//Stop the loop
            }
        }

//        TreeNode currentTree = root;
//
//        if(key < currentTree.getKey()){
//            currentTree.setLeft(currentTree);
//        }
//        if(key > currentTree.getKey()){
//            currentTree.setRight(currentTree);
//        }

    }

    public void print (){
        print(root);
        System.out.println();
    }

     public void print(TreeNode node){
        if(node != null) {
            print(node.getLeft());
            System.out.println(node.getKey() + "");
            print(node.getRight());
        }
    }
    public void remove(int key){

    }
}
