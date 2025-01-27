/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;

/**
 *
 * @author famil
 */
/*
* class represents behavior of no radiation on different plants
*/
public class NoRad implements  Radiation{
    /*
    *apply no radiation on a plant 
    *@param p is a plant for that we emply no radiation
    */
    @Override
    public void affect(Plant p){
        if (p.isAlive()){
        if(p instanceof Puffs){
            p.setNutrients(p.getNutrients()-1);
        } else if (p instanceof  Parabush) {
            p.setNutrients(p.getNutrients()-1);
        }
        else {
            p.setNutrients(p.getNutrients()-1);
        }
        }
        
    }
    
}
