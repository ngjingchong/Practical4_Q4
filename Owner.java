/**
 * @(#)Owner.java
 *
 *
 * @author 
 * @version 1.00 2020/7/23
 */


public class Owner {
	private String name;
	private String ic;
	
    public Owner(String name, String ic) {
    	this.name = name;
    	this.ic = ic;
    }
    
    public String toString() {
    	return String.format("%10s %10d %s",name,ic) ;
    }
}