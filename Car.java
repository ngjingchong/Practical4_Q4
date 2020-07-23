/**
 * @(#)Q4.java
 *
 *
 * @author 
 * @version 1.00 2020/7/12
 */


public class Car {
	private String plateNo;
	private String color;
	private int year;
	
    public Car(String plateNo, String color, int year) {
    	this.plateNo = plateNo;
    	this.color = color;
    	this.year = year;
    }
    
    public void setCarInfo(String plateNo, String color, int year) {
    	this.plateNo = plateNo;
    	this.color = color;
    	this.year = year;
    }
    
    public String toString() {
    	return String.format("%8s %8s %5d %s",plateNo,color,year) ;
    }
    
    
}