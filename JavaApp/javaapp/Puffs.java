/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;

/*
*Class represents a plant type of Puffs 
*/
class Puffs extends Plant {
    /*
    *constructor to initialize a puff
    *@param name name of a plant
    *@param nutrients nutrients of a plant
    */
    public Puffs(String name, int nutrients) {
        super(name, "p", nutrients);
    }
    /*
    *calculate alpha radiation for puffs
    *@return number of radiation need to compare it later
    */
    @Override
    public int get_alpha_need() {
        return  10 - getNutrients();
    }
    /*
    *calculate delta radiation for puffs
    *@return number of radiation need to compare it later
    */
    @Override
    public int get_delta_need() {
        return 0;
    }
    /*
    * checks if plant is still alive
    * @return boolean if alive - true, if dead - false.
    */
    @Override
    public boolean isAlive() {
        if (getNutrients() > 10) {
            return false;
        } else {
            return true;
        }
    }
}