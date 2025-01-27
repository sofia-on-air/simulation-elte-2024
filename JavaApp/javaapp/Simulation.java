/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;

/**
 *
 * @author famil
 */
import java.util.List;
/*
*Simulation class simulate plants behavior
*and create radiation for a next day
*/

public class Simulation {
    /*
    *List of a plant using for simulation
    */
    private final List<Plant> plants;
    /*
    *Number simulation of days 
    */
    private int nDays;
    
    /*
    *Constractor to initialize plants and number of days for simulation
    @param database source for plants and nDays
    */

    public Simulation(Database database){
        plants = database.getPlants();
        nDays = database.getDays();
    }
    /*
    *Determine radiation for next day based on nutrients
    *@param plants plants list
    *@return next day radiation
    */
    public Radiation NextDayRadiation(List<Plant> plants) {
        int AlphaNeed = 0;
        int DeltaNeed = 0;

        for (Plant plant : plants) {
            AlphaNeed += plant.get_alpha_need();
            DeltaNeed += plant.get_delta_need();
        }

        if (AlphaNeed >= DeltaNeed + 3) {
            return new Alpha();
        } else if (DeltaNeed >= AlphaNeed + 3) {
            return new Delta();
        } else {
            return new NoRad();
        }
    }
    /*
    *simulate plants changes for given number of days and printnig it
    */
    public void simulate() {
        Radiation rad = new NoRad();

        for (int i = 0; i < nDays; i++) {
            System.out.println("\nDay " + (i + 1)+"\n");

            for (Plant pl : plants) {
                rad.affect(pl);
                System.out.println(pl.toString());
            }
            rad = NextDayRadiation(plants);
        }
    }
}
