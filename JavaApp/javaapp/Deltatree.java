/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;
/*
*Class represents a plant type of Deltatree 
*/
class Deltatree extends Plant{
    /*
    *constructor to initialize a deltatree
    *@param name name of a plant
    *@param nutrients nutrients of a plant
    */
    public Deltatree(String name, int nutrients){
    super(name, "d", nutrients);    }
    /*
    *calculate alpha radiation for deltatree
    *@return number of radiation need to compare it later
    */
    @Override
    public int get_alpha_need() {
        return 0;
    }
    /*
    *calculate delta radiation for deltatree
    *@return number of radiation need to compare it later
    */
    @Override
    public int get_delta_need() {
        if(getNutrients() < 5){
            return 4;
        }else if(getNutrients() >= 5 && getNutrients() <=10){
            return 1;
        }
        return 0;
    }
    /*
    * checks if plant is still alive
    * @return boolean if alive - true, if dead - false.
    */
    @Override
    public boolean isAlive(){
    if (getNutrients() <= 0)
    {
        return false;
    }else{
        return true;
    }
    }
}