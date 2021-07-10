public class Driver{

    public static void main(String[] args){
        BSTree t  = new BSTree();

//    		t.seed(); this can be uncommented
//        to run a seeding method here in Driver.
//        The seed method also has to be uncommented.

        t.insert(10);
        t.insert(20);
        t.insert(5);
        t.insert(7);
        t.insert(8);
        t.insert(3);
        t.insert(25);

        t.traverse();




//      Code below checks to see if
//       search works

      	/*
    		int value;
    		value = t.search(10);
    		System.out.println(value);
    		value = t.search(15);
    		System.out.println(value);
    		try {
    			value = t.search(17);
    			System.out.println(value);
    		} catch (NullPointerException e) {
    			System.out.println("17 not in tree");
    		}
    		*/

        /*  this code below seeds and searches for values
        		t.seed();

                    		int value;
        		value = t.search(10);
        		System.out.println(value);
        		value = t.search(15);
        		System.out.println(value);
        		try {
        			value = t.search(17);
        			System.out.println(value);
        		} catch (NullPointerException e) {
        			System.out.println("17 not in tree");
        		}
        	*/





  }

}
