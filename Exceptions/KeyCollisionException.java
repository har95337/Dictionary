/*
KeyNotFoundException.java
Harpreet Singh
hsingh18
Basically a RunTimeException error extension. This occurs with insert if you try to insert duplicate keys. 
*/
public class KeyCollisionException extends RuntimeException{
	public KeyCollisionException(String message){
		super(message); 
	}
}