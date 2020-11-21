/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan57.vehicle;

/**
 *
 * @author ryzen
 */
public class Bicycle extends Vehicle{
    private int myGearCount;
    
    public Bicycle(){
        super();
    }
    
    public int getGearCount(){
        return myGearCount;
    }
    
    public void setGearCount(int gearCount){
        this.myGearCount=gearCount;
    }
}
