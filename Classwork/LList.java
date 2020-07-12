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



//My whole understanding of this comes from video help on Day 7 ll and exceptions 1
//at around the 2:38  mark. 2:58 explains difference between the head node and a
// node containing both data and a next. The head just doesn't have the data...yet.
//it never will...because we don't need it to and thus never fill it.

    public void remove(int index){
	// make two alias
  Node previous = indexPointer(index-1); // alias to Node preceeding the one to be removed.

  Node current = previous.getNext();     // alias to Node to be removed

//Sets up conditionals to handle boundry cases
//****REMEMBER******-These index assume starting at 1
// we will have to change the conditionals if we start at 0
    if (index > 1 && index < length){
  //sets the previous counter to skip over the current index
      previous.setNext(current.getNext());
    }
//  This is removing the head"
    else if (index = 1){
      head = current.getNext();
    }
//  This is removing the last node
    else if (index = length){
      previous.setNext(null);
    }
    }

}
