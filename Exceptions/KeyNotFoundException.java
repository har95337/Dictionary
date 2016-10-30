/*
KeyNotFoundException.java
Harpreet Singh
hsingh18
Basically a RunTimeException error extension. Only activates if the key does not exist for delete() to work. 
*/
public class KeyNotFoundException extends RuntimeException{
	public KeyNotFoundException(String message){
		super(message); 
	}
}