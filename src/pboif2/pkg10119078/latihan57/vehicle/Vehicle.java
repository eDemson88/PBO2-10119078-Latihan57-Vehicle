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
public class Vehicle {
    private String myBrand,myModel;
    
    public Vehicle(){
        String name[]  = getClass().getCanonicalName().split("\\.");
        System.out.println(name[name.length -1]);
    }
    
    public String getBrand(){
        return myBrand;
    }
    
    public void setBrand(String brand){
        this.myBrand=brand;
    }
    
    public String getModel(){
        return myModel;
    }
    
    public void setModel(String model){
        this.myModel=model;
    }
    
}
