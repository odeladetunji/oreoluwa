package com;

import java.io.FileInputStream;

public class Parent {
    public static void main(String[] args){
         System.out.println("Application Started  = =================== = Java");

         TextReader obj = new TextReader();

         try {
             obj.setFile(new FileInputStream("/Users/mac/IdeaProjects/oreofe/src/com/data.text"));
         }catch (Exception ex){
             System.out.println(ex);
         }

         obj.readtheFile();

         System.out.println(obj.timeOfIncident + "         " + obj.numberOfAccidents +  "          "
                 + obj.vehiclesInvolved +  "         " + obj.numberOfFatality);
         obj.printLastLine();
         System.out.println("this ----- time has the highest vehicle to accident");
         System.out.println("ratio, which means more vehicles are involved in ");
         System.out.println("each accident in the morgin than any other time span");
         obj.printLastLine();
    }
}
