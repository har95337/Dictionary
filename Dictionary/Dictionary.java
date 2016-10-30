/*
Dictionary.java
PA3
Harpreet Singh
hsingh18
This program makes a Dictionary class that uses a singly linked list to achieve its goals. 
Each node in this list holds 2 values (key,value) the value part can be anything, but keys cannot conflict in the list.
i.e ("1","2") and ("2","2") is perfectly fine but ("1","2") and ("1","3") will throw a unique KeyCollisionException. 
This program can check if the list is empty, add to the list, delete from the list, find a key in the list, lookup a value in the list using the key, delete the entire list, and checks the size of the list. 
*/
public class Dictionary implements DictionaryInterface{

   private class Node {
      String key;
	  String value;
      Node next;
      Node(String k, String v){
         key = k;
		 value = v;
         next = null;
      }
   }
   private Node head;     
   private int numKeys; 
   
   public Dictionary(){
	   head = null;
	   numKeys = 0;
   }
    // I will be using a singly head linked list. 
   private Node findKey(String key){
      Node N = head;
      for(; N != null; N = N.next){
		  if(N.key == key){
		  return N;
		  }
		}
		return null;
	}

	
   public boolean isEmpty(){
      return(numKeys == 0);
   }
   public int size() {
      return numKeys; 
   }
   public String lookup(String key){
	  Node V = findKey(key);
	  if (V!= null){ // if the key exists it will return the value of that key. 
		  return V.value;
	  }else{
		  return null;// otherwise it returns null
	  }
   }
   public void insert(String key, String value)
	   throws KeyCollisionException{
		   if( lookup(key) != null ){
			   throw new KeyCollisionException("Can't insert duplicate key "+key); // throws exception if the key that you are inserting already exists. 
			}
			if(head == null){ // This if statement will insert the node at the head if this is the first key/value going in. 
				Node N = new Node(key, value);
				N.next=head;
				head = N;// the head is now equal to N so now the rest of the function can go to the else clause. 
			}else{ // This clause inserts the key/value nodes into the rest of the list after head.
				Node P = new Node(key, value);
				Node Q = head;
				for(; Q.next != null; Q = Q.next); // Right here Q.next will become the new Node P once Q.next reach null.
				Q.next = P;	
			}
			numKeys++;// Increment numKeys as we are adding nodes to the linked list.  
		}
public void delete(String key)
	   throws KeyNotFoundException{
		   if( lookup(key) == null ){
			   throw new KeyNotFoundException("Can't delete non-existent key "+key); // throw an exception if the key is not found.
			}
			if(head.key == key){ // This checks the value of key against what the head key was assigned. 
				Node N = head; // Make the node N the value of head.
				head = head.next; 
				N.next = null; // Nullify the head. 
			}else{ // if the Node containing the key not head. 
				Node N = findKey(key); // find the key and assign it a node.
				Node P = head; // make P the head.
				Node R = P; //Make R the P aka the head. 
				for(;P!=N;P=P.next){ // Go down the linked list until P is next to N. 
					R = P; 
				}
				R.next = N.next; // make R.next skip over the Node N and go all the way to the next node in the list. 
				N = null; // Make N null because it is no longer part of the linked list. 
				}
			numKeys--; // Decrement numKeys because you are removing a Node from the linked list. 
		}
   public void makeEmpty(){
      head = null;
      numKeys = 0;
   }
   public String toString(){
	  StringBuffer sb = new StringBuffer();
      Node N = head;

      for( ; N!=null; N=N.next) {
		  sb.append(N.key).append(" ").append(N.value).append("\n");
	  }
      return new String(sb);
	}
}