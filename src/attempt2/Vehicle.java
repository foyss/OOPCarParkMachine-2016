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
public abstract class Vehicle { //vehicle Class
    protected String brand;
    protected String idPlate; 
    private Date entryDate;
    
    
    public Vehicle(){
        brand = "Ferrari";
        idPlate = "EJ09FRX";
        
    }
    public Vehicle(String brand, String idPlate, Date entryDate){
        this.brand = brand;
        this.idPlate = idPlate;
        this.entryDate = entryDate;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void SetidPlate (String idPlate){
        this.idPlate = idPlate;
    }
    public String idPlate(){
        return idPlate;
    }
    
    
    
    public String toString(){
        return "Brand = " + brand +", idPlate = " + idPlate;
    }
    //add abstract methods from Vehicle
    
    
    public abstract String getVehicle();

    /**
     * @return the entryDate
     */
    public Date getEntryDate() {
        return entryDate;
    }

    /**
     * @param entryDate the entryDate to set
     */
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
    
    
}
