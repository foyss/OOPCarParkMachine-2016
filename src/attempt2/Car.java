/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attempt2;

/**
 *
 * @author Foysal
 */
public class Car extends Vehicle {
    protected Integer noOfDoors;
    protected String colour; 
    
    public Car(){
        brand = "Ferrari";
        idPlate = "EJ09FRX";
        
        noOfDoors = 4;
        colour = "blue";
    }
    
    public Car(Integer noOfDoors){
        brand = "Ferrari";
        idPlate = "EJ09FRX";
        
        this.noOfDoors = noOfDoors;
    }
    
    public Car(Integer noOfDoors, String colour, String brand, String idPlate, Date entryDate){
        super(brand, idPlate, entryDate);
        
        
        this.noOfDoors = noOfDoors;
        this.colour = colour;
    }

    Car(int noOfDoors, String colour, String brand, String idPlate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setnoOfDoors(Integer noOfDoors){
        this.noOfDoors = noOfDoors;
    }
    
    public Integer getnoOfDoors(){
        return noOfDoors;
    }
    
    public void setcolour(String colour){
        this.noOfDoors = noOfDoors;
    }
    
    public String getcolour(){
        return colour;
    }
    
    public String getVehicle(){
    return "Car";
    }
}
