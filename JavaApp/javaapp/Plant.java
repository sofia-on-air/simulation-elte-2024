/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;
/*
* the abstract class of a Plant that stores common properties
*/

import java.util.ArrayList;
import java.util.List;

public abstract class Plant{
    /*
    *name of a plant
    */
    private String name;
    /*
    *kind of a plant
    */
    private String kind;
    /*
    *nutrients of a plant
    */
    private int nutrients;
    /*
    *abstract method 
    *@returns the number needs for alpha radiation
    */
    public abstract int get_alpha_need();
    /*
    *abstract method 
    *@returns the number needs for delta radiation
    */
    public abstract int get_delta_need();
    /*
    *constructor to initialize a plant
    *@param name is a name of a plane
    *@param kind is kind of a plant (Puffs, Parabush or deltatree)
    *@param nutritients is a nutritients of a plant 
    */
    public Plant(String name,String kind, int nutrients){
        this.name = name;
        this.nutrients = nutrients;
        this.kind = kind;
    }
    /*
    *abstract class to check if plant is alive
    * @return true if alive and false if dead
    */
    public abstract boolean isAlive();
    /*
    *@return name
    */
    public String getName() {return name;}
    /*
    *set name 
    *@param name is a name of a plant
    */
    public void setName(String name) {this.name = name;}
    /*
    *@return nutrients
    */
    public int getNutrients() { return nutrients;}
    /*
    *set nutrients
    *@param nutrients is nutrients of a plant
    */
    public void setNutrients(int nutrients) { this.nutrients = nutrients;}
    /*
    *@return true if alive and false if dead
    */
    public boolean getLiving() { return isAlive();}
    /*
    *@return string plant's name, kind, nutrients, and if alive
    */
    @Override
    public String toString() {
        return "Name: " + name +" kind: "+ kind + ", nutrients: " + nutrients + ", alive: " + isAlive();
    }
    /*
    *@return kind of a plant
    */
    public String getKind() {
        return kind;}

}