/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attempt2;
import java.util.*;
import java.util.Arrays;

public class WestminsterCarParkManager implements CarParkManager {
    
    private ArrayList<Vehicle> carList;
    private int numVehicle;
    private int parkingSize = 0;
   //variables for parking cars cost
    int hoursParked = 0;
    int currentCost = 0;
    int totalCost = 0;
    //variables for statistics
    private int cars = 0;
    private int vans = 0;
    private int bikes = 0;
   
    public WestminsterCarParkManager(int listLength){
        this.numVehicle = listLength;
        carList = new ArrayList<Vehicle>();   //array
         
        
    }
    //add vehicle method
    public void addVehicle(Vehicle v)
    {
        
        if (carList.size() < numVehicle){
                
            carList.add(v); 
                
            
            
             if(v.getVehicle().equals("Car")) {
                parkingSize = parkingSize + 1;
        cars = cars + 1;                //add 1 to var everytime car is selected
        
        }
             if(v.getVehicle().equals("Van"))  {
                parkingSize = parkingSize + 2;
        vans = vans + 2;                //add 2 to var everytime van is selected
             }
                    
             if(v.getVehicle().equals("Motorbike")) {
                 parkingSize = parkingSize + 1;
        bikes = bikes + 1;              //add 1 to var everytime bikes is selected
             }
             
                     
        }
            else{
                    System.out.println("No more space in the list!"); //if spaces are full
                    }
            
        }
    //when this method is called, displays car list showing cars registered
    public void printCarList(){
        
        for (int i=0; i < carList.size(); i++)
            
            
        {
            
            currentCost = calculateCharges(hoursParked);//most recent customer
                totalCost+=currentCost;
            if(carList.get(i).getVehicle().equals("Car")){
             
                System.out.println("Vehicle = Car, Registration = " + carList.get(i).idPlate + ", Cost: £ " + currentCost + " Date/Time: " + carList.get(i).getEntryDate().toString());

                
                
            }
            
            if(carList.get(i).getVehicle().equals("Van") ){
            
                System.out.println("Vehicle = Van, Registration = " + carList.get(i).idPlate + ", Cost: £" + currentCost + " Date/Time: " + carList.get(i).getEntryDate().toString());
             
                
               
            }
            if (carList.get(i).getVehicle().equals("Motorbike")){
               
                System.out.println("Vehicle = Motorbike, Registration = " + carList.get(i).idPlate + ",  Cost: £" + currentCost + " Date/Time: " + carList.get(i).getEntryDate().toString());
               
                
                
            }
        }
    }    
    
    
    public static int calculateCharges (int numHours)
    {
        //assuming maximum hours = 24 hours
        int garageCost = 0;
        
        if (numHours <=3){
            garageCost = numHours * 3;
        }
           
        
        else if (numHours >3 && numHours <= 24)
            garageCost = 9 + 1 * (numHours - 3);
        
        return garageCost;
        
        
    }
    
    
    public boolean runMenu(){
        
        boolean exit = false;
        
        System.out.println("To add a new car, press 1");
        System.out.println("To print the list of vehicles, press 2");
        System.out.println("To exit, press 3");
        System.out.println("Display parking spaces available, press 4");
        System.out.println("Press 5 for statistics");
        
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("Press 1 if you want to add a Car");
                System.out.println("Press 2 if you want to add a Van");
                System.out.println("Press 3 if you want to ad a Motorbike");
                
                int choice2 = s.nextInt();
                s.nextLine();
                
                System.out.println("Enter the brand of your vehicle");
                String brand = s.nextLine();
                
                System.out.println("Enter the registration plate of your vehicle");
                String idPlate = s.nextLine();
                                                
                System.out.println("Please enter the day of your date");
                int day = s.nextInt();
                
                System.out.println("Please enter the month of your date");
                int month = s.nextInt();
                
                System.out.println("Please enter the year of your date");
                int year = s.nextInt();
                
                System.out.println("Please enter current hour");
                int hour = s.nextInt();
                
                System.out.println("Please enter current minute");
                int minute = s.nextInt();
                
                
                
                Date date = new Date(day, month, year, hour, minute); //date in this format
                
                
                {
                    System.out.println("How many hours will you stay?");
                hoursParked = s.nextInt();
                currentCost = calculateCharges(hoursParked);//most recent customer
                totalCost+=currentCost;
        }
                System.out.println("Running total : £" + currentCost);
                //add time entered stuff
                switch (choice2){
                    case 1:
                        //if it is a car
                        System.out.println("Enter number of doors");
                        int noOfDoors = s.nextInt();
                        
                        System.out.println("Enter colour of car");
                        String colour = s.next();
                        
                        
                        
                        Car c = new Car(noOfDoors, colour, brand, idPlate, date);
                        
                        
                        this.addVehicle(c);
                        System.out.println("No of Parking lots Free " +(20-parkingSize));
                        
                        break;
                        
                    case 2:
                        //if it is a van
                        System.out.println("Enter cargo volume in KG");
                        double cargoVolume = s.nextDouble();
                        
                        
                        Van v = new Van(cargoVolume, brand, idPlate, date);
                        
                        
                        this.addVehicle(v);
                        System.out.println("No of Parking lots Free " +(20-parkingSize));
                       
                        break;
                        
                    case 3:
                        //if it is a motorbike
                        System.out.println("Enter engine size");
                        double engineSize = s.nextDouble();
                        
                        
                        Motorbike m = new Motorbike(engineSize, brand, idPlate, date);
                        
                        
                        this.addVehicle(m);
                        System.out.println("No of Parking lots Free " +(20-parkingSize));
                        
                        break;
                }
            break;
            case 2: //displays carlist method
                this.printCarList();
                break;
                
            case 3: //exits program
                exit = true;
                break;
            case 4:
                System.out.println("No of Parking lots Free " +(20-parkingSize));
                break;
            case 5:
                 //displays vehicle statistics
                 cars = (cars * 100) / (20);
                 vans = (vans * 100) / (20);
                 bikes = (bikes * 100) / (20);
                
                System.out.println("Percentage of cars: " + cars + "%");
                System.out.println("Percentage of vans: " + vans + "%");
                System.out.println("Percentage of bikes: " + bikes + "%");
                
                cars = cars / 5;
                vans = vans / 5;
                bikes = bikes / 5;
                
                break;
        }
        return exit;
    }
    
    
   public static void main(String[] args){
        
        //create a parking
        CarParkManager sys = new WestminsterCarParkManager(20); //maximum space for parking lot
        
        boolean exit = false;
        
        
        while (!exit){
            exit = sys.runMenu();
        }
        
    }

    @Override
    public void addCar(Vehicle car) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
