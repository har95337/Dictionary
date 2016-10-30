/*
DictionaryTest.java
Harpreet Singh
hsingh18
This test will test the Dictionary class to see if it works. It is quite extensive, but in the end it is really a long and more extensive DictionaryClient. 
*/
public class DictionaryTest{

   public static void main(String[] args){
      Dictionary A = new Dictionary();
      Dictionary B = new Dictionary();
	  String v; 
	  
      A.insert("1","a");
      A.insert("2","b");
      A.insert("3","c");
      A.insert("4","d");
      A.insert("5","e");
      A.insert("6","f");
      A.insert("7","g");
	  A.insert("100","g");
	  //A.insert("7","g");
	  v = A.lookup("1");
      System.out.println("key=1 "+(v==null?"not found":("value="+v)));
      v = A.lookup("3");
      System.out.println("key=3 "+(v==null?"not found":("value="+v)));
      v = A.lookup("7");
      System.out.println("key=7 "+(v==null?"not found":("value="+v)));
      v = A.lookup("8");
      System.out.println("key=8 "+(v==null?"not found":("value="+v)));
	  System.out.println(A);
	  
	  
	  B.insert("G","2");
	  //B.insert("g","2");
	  B.insert("Rek","Sai");
	  B.insert("4","d");
      B.insert("5","e");
      B.insert("6","f");
      B.insert("7","g");
	  v = B.lookup("Rek");
      System.out.println("key=Rek "+(v==null?"not found":("value="+v)));
      v = B.lookup("4");
      System.out.println("key=3 "+(v==null?"not found":("value="+v)));
      v = B.lookup("7");
      System.out.println("key=7 "+(v==null?"not found":("value="+v)));
      v = B.lookup("8");
      System.out.println("key=8 "+(v==null?"not found":("value="+v)));	 
      System.out.println();
	  System.out.println(B);
	  
      System.out.println();
	  System.out.println(A.size());
      System.out.println();
      System.out.println(B.size());
	  System.out.println(); 
			if(A.size() == B.size()){
				System.out.println("A and B are the same size.");
			} else{
				System.out.println("They are not the same size.");
			}
      System.out.println();
	  A.delete("100");
	  A.delete("7");
	  //A.delete("8");
	  System.out.println(A);
	  System.out.println(A.size());
	  v = A.lookup("7");
      System.out.println("key=7 "+(v==null?"not found":("value="+v)));
	  
	  B.delete("Rek");
	  B.delete("G");
	  //B.delete("8");
	  System.out.println(B);
	  System.out.println(B.size());
	  v = B.lookup("Rek");
      System.out.println("key=Rek "+(v==null?"not found":("value="+v)));
	  
	  A.makeEmpty();
	  System.out.println(A.size());
	  System.out.println(A.isEmpty());
	  
	  B.makeEmpty();
	  System.out.println(B.size());
	  System.out.println(B.isEmpty());
   }
}