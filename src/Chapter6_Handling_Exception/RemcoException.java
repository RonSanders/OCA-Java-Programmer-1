package Chapter6_Handling_Exception;

import nl.cerios.blog.RemcoException;

public class RemcoException extends RuntimeException {
	try { 
		String i= null;
		i.getBytes();
	} catch (Exception errrrr){
		throw new RemcoException();
}
