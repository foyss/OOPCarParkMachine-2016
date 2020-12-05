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
public class Van extends Vehicle {
    protected Double cargoVolume;
    
    public Van(){
        brand = "Ferrari";
        idPlate = "EJ09FRX";
        
        cargoVolume = 50.50;
    }
    
    public Van(double cargoVolume){
        brand = "Ferrari";
        idPlate = "EJ09FRX";
        
        this.cargoVolume = cargoVolume;
    }
    
    public Van(Double cargoVolume, String brand, String idPlate, Date entryDate){
        super(brand, idPlate, entryDate);
       
        
        this.cargoVolume = cargoVolume;
    }

    Van(double cargoVolume, String brand, String idPlate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setcargoVolume(Double cargoVolume){
        this.cargoVolume = cargoVolume;
    }
    
    public Double getcargoVolume(){
        return cargoVolume;
    }
       
    public String getVehicle(){
    return "Van";
    }
}
