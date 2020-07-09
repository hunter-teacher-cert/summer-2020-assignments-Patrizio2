import java.io.*;
import java.util.*;


public class LList{
    private Node head;

    public LList(){
	head = null;
    }

    public void add(String data){
	Node newnode = new Node(data);

	// first point the new node to the beginning
	newnode.setNext(head);

	// point head to the new node
	head = newnode;

    }
// Finds the pointer of the requested index.
// The pointer is the "next" associated with
// the index. Only works right now for ideal
// situations, where the index actually exists.
// Assumes index starts at 1.
    public Node indexPointer(int index){
    int i = 1; //need to change to 0 if I change to an index starting at "0"
    Node pointer;
    pointer = head;
    while (i < index){
      pointer = pointer.getNext();
      i++;
    }
    return pointer;
    }




    public String toString(){
	String s = "";

	Node tmp;
	tmp = head;
	while (tmp != null){
	    s = s + tmp.getData()+"-->";
	    // how can we now move tmp to the next node
	    // this is the magic linked list idiom!!!!
	    // this moves a pointer to the next node!!!
	    // It's analagous to i=i+1 for an array (for loop)
	    tmp = tmp.getNext();
	}

	s = s + "null";
	return s;
    }

    public int length(){
	int l = 0;

	Node tmp = head;
	while (tmp != null){

	    l = l + 1;

	    // how can we now move tmp to the next node
	    // this is the magic linked list idiom!!!!
	    // this moves a pointer to the next node!!!
	    // It's analagous to i=i+1 for an array (for loop)
	    tmp = tmp.getNext();
	}

	return l;
    }

    public void insert(int index, String value){
	// make new node

	// make a tmp node

	// move temp down the list until it's right BEFORE the insertion point

	// insert
    }

public boolean isEmpty (){
  return head == null;
}





    public void remove(int index){
	// make a tmp node
  Node previous = indexPointer(index-1); // alias to Node preceeding the one to be removed.
  Node current = previous.getNext();   //indexPointer(index-1); // alias to Node to be removed
  setNext(previous) =  previous =   current.setNext(fu);
//Wow!! Discovery!! Variables created here are only to give us a "handle"
// or "identifier" to the Node
  Node fu = previous.getNext().indexPointer(index));

  current.setNext(fu);

  previous.s current
  current.setNext()
previous.set
current.setNext

//  previous.setNext(getNextcurrent.setNext = new Node;
//  previous =

//  previous.setNext(getNext(indexPointer(index));
     current.setsetNext(indexPointer(index)
	// move tmp down the list until it's BEFORE the node we want to delete
//  this.(indexPointer(index).set);

	// change tmp's next pointer to skip the node we are deletin
    }

}
