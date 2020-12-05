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
public class Date {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;
    
    public Date(int day, int month, int year, int hour, int minute){
        if ((year > 2015) && (year<2020) && (month > 0) && (month < 13) && (day > 0) && (day<32) && (hour > 0) && (hour < 25) && (minute > 0) && (minute < 61)) {
            this.day = day;
            this.month = month;
            this.year = year;
            this.hour = hour;
            this.minute = minute;
            
        }
        else {
            System.out.println("Incorrect date or time entered!");
        }
        
    }
    
    public void setYear (int year){
        if ((year > 2015 ) && (year < 2020)){
            this.year = year;
        }
        else{
            System.out.println("Incorrect year range");
        }
    }
    
    public void setMonth (int month){
        if ((month > 0) && (month < 13)){
            this.month = month;
        }else{
            System.out.println("Incorrect month range");
        }
    }
    
    public void setDay(int day){
        if ((day > 0) && (day < 32)){
            this.day = day;                       
        }else{
            System.out.println("Incorrect day range");
        }
    }
    
    public void setHour(int hour){
        if ((hour > 0) && (hour < 25)){
            this.hour = hour;
        }else{
            System.out.println("Incorrect hour range");
        }
    }
    
    public void setMinute(int minute){
        if ((minute > 0 ) && (minute < 61)){
            this.minute = minute;
        }else{
            System.out.println("Incorrect minute range!");
        }
    }
    
    public int getYear(){
        return year;
    }
    
    public int getMonth(){
        return month;
    }
    
    public int getDay(){
        return day;
    }
    
    public int getHour(){
        return hour;
    }
    
    public int getMinute(){
        return minute;
    }
    
    public String getDate(){
        String dateStr = String.format("%02d/%02d/%04d/%02d:%02d", day, month, year, hour, minute);
        return dateStr;
    }
    
    public String toString(){
        String dateStr = String.format("%02d/%02d/%04d %02d:%02d", day, month, year, hour, minute);
        return dateStr;
    }
    
     
}


