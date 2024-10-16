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

        System.out.print("\t=====================================================");
        System.out.print("=====================================================");
        System.out.print("=====================================================\n");

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tFX MANAGEMENT SYSTEM");

        System.out.print("\t=====================================================");
        System.out.print("=====================================================");
        System.out.print("=====================================================\n");

        try{

          do{
              System.out.println("\n" +
                      "\t\t||--------------------------------------------||\n" +
                      "\t\t||\t\t\t\t\tMENU\t\t\t\t\t  ||\n" +
                      "\t\t||--------------------------------------------||\n" +
                      "\t\t||\t\t1: Add a new Investor \t\t\t\t  ||\n" +
                      "\t\t||\t\t2: View All Investors \t\t\t\t  ||\n" +
                      "\t\t||\t\t3: View Paid Investors \t\t\t\t  ||\n" +
                      "\t\t||\t\t4: Delete an Investor \t\t\t\t  ||\n" +
                      "\t\t||\t\t5: Exit Program \t\t\t\t\t  ||\n" +
                      "\t\t||--------------------------------------------||\n");
              System.out.println("Input your Preferred action: ");
              int choice = input.nextInt();

              switch (choice){

                  case 1:
                      System.out.println("Input the name of the investor: ");
                      String name = input.next();
                      input.nextLine();
                      System.out.println("Input the amount of your investment: ");
                      double amount = input.nextDouble();
                      manageScheme.addTrader(new Trading(0, name, amount));
                      break;

                  case 2:
                      manageScheme.viewAllTraders();
                      break;

                  case 3:
                      manageScheme.viewPaidTraders();
                      break;

                  case 4:
                      System.out.println("Input the id of the Investor you want to delete: ");
                      int id = input.nextInt();
                      manageScheme.deleteTrader(id);
                      break;

                  case 5:
                      System.out.println("Exiting the FX Management System.");
                      System.exit(0);
                      break;

              }

          }while(true);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}