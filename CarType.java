/**
 * @(#)CarType.java
 *
 *
 * @author 
 * @version 1.00 2020/7/23
 */


public class CarType {
	private String brand;
	private String model;
	private double capacity;
	
    public CarType(String brand, String model, double capacity) {
    	this.brand = brand;
    	this.model = model;
    	this.capacity = capacity;
    }
    
    public String toString() {
    	return String.format("%10s %10s %3.1lf",brand,model,capacity) ;
    }
}