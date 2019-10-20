package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TextReader {

    FileInputStream file;
    char[] data = new char[2000];
    int numberOfFatality = 0;
    int vehiclesInvolved = 0;
    String timeOfIncident = "";
    int numberOfAccidents = 0;

    public void setFile(FileInputStream file) throws FileNotFoundException {
        this.file = file;
    }

    public FileInputStream getFile() {
        return file;
    }

    public int getVehicles(){
        return vehiclesInvolved;
    }

    public int getFatality(){
        return numberOfFatality;
    }

    public void time(String param){

        if (Integer.parseInt(param) == 12 && Integer.parseInt(param) < 16){
            timeOfIncident = "Afternoon";
        }

        if (Integer.parseInt(param) < 12 ){ timeOfIncident = "Morning"; }

        if (Integer.parseInt(param) > 15) { timeOfIncident = "Good Evening"; }

    }

    public void readtheFile(){

        int c;

        try {
            while ((c = file.read()) != -1){
                String u = String.valueOf(c);
                System.out.print(u);
                String[] line = u.split(" ");

                time(line[0]); // time accident occurred
                numberOfFatality = numberOfFatality + Integer.parseInt(line[2]); //fatality
                vehiclesInvolved = vehiclesInvolved + Integer.parseInt(line[1]); //vehicles involved;
                numberOfAccidents++;
            }
        }catch (Exception ex){
            System.out.println(ex);
        }

        System.out.println(" ");


        System.out.println("------------------------------------------------------ ");
        System.out.println(" ");
        System.out.println("TimeSpan" + "   " + "Accidents" + "   " + "Vehicles" + "   " + "Fatals" + "   " + "Veh./Acc");
        System.out.println(" ");
        System.out.println("------------------------------------------------------ ");

    }


    public void printLastLine(){
        System.out.println(" ");
        System.out.println("------------------------------------------------------ ");
    }

    public TextReader() { }

}
