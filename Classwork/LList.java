import java.io.*;
import java.util.*;


public class LList{
    private Node head;

    public LList(){
	head = null;
    }


/////
// Adds a new node to the front of the string
    public void add(String data){
	Node newnode = new Node(data , head);
	head = newnode;
  }



// Finds the memory location of the requested index.
// I can also think of it as the "next" value
// of the preceeding node. Only works right now for ideal
// situations, where the index actually exists.
// Assumes index starts at 1.
    public Node indexPointer(int index){
    int i = 1; //need to change to 0 if I change to an index starting at "0"
    Node pointer;
    pointer = head;
    while (i < index){
      pointer = pointer.getNext();
      i++;
    }//endwhile
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















public void addFront (String value){
//create the new node
  Node newnode = new Node(value , head);

//change the head to the location of the newmode
  head = newnode;

}


public boolean isEmpty (){

  if (head == null){
    return  true;
  }else{
    return false;
  }
}
// ALL of the statements above can be reduced to the following
// line  return head == null; ...as shown in
// Day 5 linked lists 2 at 6 minute mark



 public String get(int index){
   if ( index >= 0 && index <= length){
   int count = 1;
   Node tmp = head;
   while ( count < index){
      count = count + 1;
      tmp = tmp.getNext();
      }//end while

      return tmp.getData();

  } else{
        return "-1";
  }

}
/// Damn, forgot to use my indexPointer
//Can check out code on video day 06 linked lists 2
// @ 12:52 mark if this does not work. Very different organization
// I did not use the video at all so don't expect it to directly help.




  public void set(int index, String value){
  if ( index >= 0 && index <= length){
  Node temp = indexPointer(index);
  temp.setData(value);
  
  }

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
