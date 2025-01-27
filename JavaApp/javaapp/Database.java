/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;

/**
 *
 * @author famil
 */
import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
/*
*Database read the data from a file and storing plants for later simulation
*/
public class Database {
    /*
    *list of plants
    */
    private final List<Plant> plants;
    /*
    number of days
    */
    private int nDays;
    /*
    *constructor to initialize list of plants
    */
    public Database() {
        plants = new ArrayList<>();
    }
    /*
    * reads plants and simulation days
    *@param filename name of a file
    *@throws FileNotFoundException if file not found
    *@throws InvalidInputException if invalid plant
    */
    public void read(String filename) throws FileNotFoundException, InvalidInputException {
        Scanner sc = new Scanner(new BufferedReader(new FileReader(filename)));
        int numPlants = sc.nextInt();
        /*
        *if file is empty print that file is empty
        */
        if (numPlants == 0){
            System.out.println("File doesn't contain anything");
            
        }else{
        for (int i = 0; i < numPlants; i++) {
            Plant plant;
            String name = sc.next();
            String kind = sc.next();
            int nutrients = sc.nextInt();
            /*
            create a plant
            */
            switch (kind) {
                case "p":
                    plant = new Puffs(name, nutrients);
                    break;
                case "b":
                    plant = new Parabush(name, nutrients);
                    break;
                case "d":
                    plant = new Deltatree(name, nutrients);
                    break;
                default:
                    throw new InvalidInputException();
            }
            plants.add(plant);

        }
        /*
        * read a number of simulation day
        */
        nDays = sc.nextInt();
    }
    }
    /*
    *@return list of plants
    */
    public List<Plant> getPlants() {
        return plants;
    }
    /*
    * @return number of days for simulation
    */
    public int getDays(){
        return nDays;
    }
}
