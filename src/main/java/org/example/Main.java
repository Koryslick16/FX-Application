package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);

        FXManager manageScheme = new FXManager();

        try{

          do{
              System.out.println("\n" +
                      "\t\t||--------------------------------------------||\n" +
                      "\t\t||\t\t\t\t\tMENU\t\t\t\t\t  ||\n" +
                      "\t\t||--------------------------------------------||\n" +
                      "\t\t||\t\t1: View All Rooms \t\t\t\t\t  ||\n" +
                      "\t\t||\t\t2: Reserve a Room \t\t\t\t\t  ||\n" +
                      "\t\t||\t\t3: Check Availability for an \t\t  ||" +
                      "\n\t\t||\t\t   Already Booked Room \t\t\t\t  ||\n" +
                      "\t\t||\t\t4: Cancel a Reservation \t\t\t  ||\n" +
                      "\t\t||\t\t5: Exit Program \t\t\t\t\t  ||\n" +
                      "\t\t||--------------------------------------------||\n");
              System.out.println("Input your Preferred action: ");
          }while(true);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}