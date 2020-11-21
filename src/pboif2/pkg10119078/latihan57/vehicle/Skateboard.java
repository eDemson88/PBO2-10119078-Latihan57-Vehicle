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
public class Skateboard extends Vehicle{
    private double myBoardLength;
    
    public Skateboard(){
        super();
    }
    
    public double getBoardLength(){
        return myBoardLength;
    }
    
    public void setBoardLength(double boardLength){
        this.myBoardLength=boardLength;
    }
    
}
