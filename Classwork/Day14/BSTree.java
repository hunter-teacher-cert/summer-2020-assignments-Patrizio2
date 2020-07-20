import java.io.*;
import java.util.*;

  public class BSTree {
    private TreeNode root;

    public BSTree(){
	  root = null;
    }

    public int search(int key){
	     TreeNode current = root;

	      while (current != null){
	         int currentValue = current.getData();
	         if (currentValue == key){
		          return key;
	       } else if (currentValue < key){
		         current = current.getRight();
	       } else {
		      current = current.getLeft();
		}
	}//end while

  // do we really want to return -1?
	 return -1;
}//end search method



public void insert(int key){

  TreeNode newNode = new TreeNode(key);
  TreeNode front = root;
  TreeNode trailer = front; //will keep track of the previous node
                    //memory location


   while (front != null){
       int frontValue = front.getData();
       if (frontValue == key){
          return;
     } else if (frontValue < key){
        trailer = front;
        front = front.getRight();
     } else {
        trailer = front;
        front = front.getLeft();
}
}//end while
    //checks to see which side to add new node
    if (key < trailer.getData()){
      trailer.setLeft(newNode);
   }else{
      trailer.setRight(newNode);
   }

}//end search method










  public void seed(){
	TreeNode t;

	t = new TreeNode(10);
	root = t;
	t = new TreeNode(5);
	root.setLeft(t);
	t = new TreeNode(20);
	root.setRight(t);

	root.getLeft().setRight( new TreeNode(8));

	t = new TreeNode(15);
	root.getRight().setLeft(t);

	t = new TreeNode(22);
	root.getRight().setRight(t);

	}


}
