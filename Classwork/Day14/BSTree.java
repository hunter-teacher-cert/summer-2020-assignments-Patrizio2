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

private void traverse(TreeNode current){
  if (current == null){
    return;
  }
  //process the current node
    System.out.print(current.getData()+", ");

  //recursively print out the left subtree
  traverse(current.getLeft());

  //recursively print out the right subtree
  traverse(current.getRight());
}

public void traverse(){
  traverse(root);
  System.out.println();
}


public void insert(int key){

  TreeNode newNode = new TreeNode(key);
  TreeNode front = root;
  TreeNode trailer = root; //will keep track of the previous node
                    //memory location

   if (root == null){
     root = newNode;
     return;
   }

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

}//end insert method

////////////////////
//This method deletes a given value from the tree
////////////////////


public void delete(int key){

  TreeNode roottemp = root;
  TreeNode front = root;
  TreeNode trailer = root; //keeps previous nodes memory location
  TreeNode largestOffspring; //keeps previous nodes memory location
  TreeNode largestOffspringTrailer;
  TreeNode tempnode;
   while (front != null && front.getData() != key){
       int frontValue = front.getData();
       if (frontValue < key){
        trailer = front;
        front = front.getRight();
     } else {
        trailer = front;
        front = front.getLeft();
}
}//end while
    // if the key wasn't in the tree
    if (front == null){
      return;
    }

    //if we get here, "front" points to the node
    //we want to delete and trailer points to the
    //one above it.


    //case 1 -- the node we want to delete is a leaf
    if (front.getLeft() == null && front.getRight() == null){
      //decides which pointer of parent to change to null
      if (key < trailer.getData())
          trailer.setLeft(null);
      else
          trailer.setRight(null);
    return; //case 1 complete
     }

    //case 2 -- node we want to delete has one child
    else if (front.getLeft() == null || front.getRight() ==null){

      //Resets left pointer of trailer with the non null child side
      if (key < trailer.getData() && front.getLeft() != null)
          trailer.setLeft(front.getLeft());
      if (key < trailer.getData() && front.getRight()!= null)
          trailer.setLeft(front.getRight());

      //Resets right pointer of trailer with the non null child side
      if (key > trailer.getData() && front.getLeft() != null)
          trailer.setRight(front.getLeft());
      if (key > trailer.getData() && front.getRight()!= null)
          trailer.setRight(front.getRight());
      return; //case 2 complete
    }

    //case 3 -- node we want to delete has two children
              //no actual need for an else if statement
    else if (front.getLeft() != null && front.getRight() != null){



      // Finding the node of the largest offspring of the front node
      largestOffspring = front.getLeft();
      largestOffspringTrailer = front;
      while (largestOffspring !=null){
        largestOffspringTrailer = largestOffspring;
        largestOffspring = largestOffspring.getRight();
      } //end while


        ///special case where Node is removed

//        if (front == root)
//            front.setData()
/*
          if (key < trailer.getData() && key < root.getData())
          trailer.setLeft(null);
          if (key < trailer.getData() && key < root.getData())
          trailer.setLeft(null);
*/
          if (key > trailer.getData()){
          trailer.setRight(front.getLeft());
          largestOffspringTrailer.setRight(front.getRight());

          }
          else if (key < trailer.getData()){
          trailer.setLeft(front.getLeft());
          largestOffspringTrailer.setRight(front.getRight());

      }
  }


}//end delete method

/*


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
*/

}
