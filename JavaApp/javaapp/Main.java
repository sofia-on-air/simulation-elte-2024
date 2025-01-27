/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp;
import java.io.FileNotFoundException;


//import java.io.FileNotFoundException;
/**
 * * @author famil
 */public class Main {
     /*
     * main method start the application
     */
    public static void main(String[] args){
        Database ps = new Database();//new Database created
        var console = System.console();//get the console for the input

        if (console == null) {
            System.out.println("No console available");// check if console avaliable
            return;
        }
        String fileName = console.readLine("Enter fileName: ");
        /*
        read the plant from a file or handle FileNotFoundException or InvalidInputException 
        */
        try{
            ps.read(fileName);
        }catch (FileNotFoundException ex){
            System.out.println("File not found");
            System.exit(-1);    }
        catch (InvalidInputException ex) {
            System.out.println("Invalid input!");
            System.exit(-1);
        }
        /*
        *create new simulation object and run it
        */
        Simulation simulation = new Simulation(ps);
        simulation.simulate();
        /*
        *print out survivors
        */
        System.out.println("\n\nResult: ");
        for (Plant pl : ps.getPlants()) {
            if(pl.isAlive()){
                System.out.println(pl.getName());
            }
        }


    }
 }
