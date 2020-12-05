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
public class Motorbike extends Vehicle {
    protected Double engineSize;
    
    public Motorbike(){
        brand = "Ferrari";
        idPlate = "EJ09FRX";
       
        engineSize = 4.2;
        }
    
  public Motorbike(Double engineSize){
      brand = "Ferrari";
      idPlate = "EJ09FRX";
     
      this.engineSize = engineSize;
  }
  
  public Motorbike(Double engineSize, String brand, String idPlate, Date entryDate){
      super(brand, idPlate, entryDate);
      
      
     
      this.engineSize = engineSize;
  }

    Motorbike(double engineSize, String brand, String idPlate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
  public void setengineSize(Double engineSize){
      this.engineSize = engineSize;
  }
  
  public Double getengineSize(){
      return engineSize;
  }
  
  
  public String getVehicle(){
    return "Motorbike";
    }  
}
