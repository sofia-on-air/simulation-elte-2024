/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;
/*
*Class represents a plant type of Parabush 
*/
class Parabush extends Plant{ 
    /*
    *constructor to initialize a parabush
    *@param name name of a plant
    *@param nutrients nutrients of a plant
    */
    public Parabush(String name, int nutrients){
    super(name, "b", nutrients);    }
    /*
    * checks if plant is still alive
    * @return boolean if alive - true, if dead - false.
    */
    @Override
    public boolean isAlive(){
    if (getNutrients() <= 0){
        return false;
    }else{
        return true;
    }}
    /*
    *calculate alpha radiation for Parabush
    *@return number of radiation need to compare it later
    */
    
    @Override
    public int get_alpha_need() {
        return 0;
    }
    
    /*
    *calculate delta radiation for Parabush
    *@return number of radiation need to compare it later
    */
    @Override
    public int get_delta_need() {
        return 0;
    }
}
