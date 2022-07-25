package com.Demi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String choice = "y";

        for (int i = 0; i < 3; i++) {
            System.out.println("You wake up shaken from a nightmare; sweat consuming your back.");
            System.out.print("Would you like to get a drink of water? (Y/N) ");
            choice = userInput.nextLine().toLowerCase();
            if (choice.equals("y")){
                boolean drinkWater = true;
                System.out.println("You get out of bed and pour yourself a drink of water.");
                if (drinkWater){
                    System.out.print("You pour yourself a drink and hear a knock on the door. Will you open? (Y/N)");
                    choice = userInput.nextLine().toLowerCase();
                    if (choice.equals("y")){
                        System.out.print("You open your door. \nYou neighbor appears in a panic. ('Are you okay' / 'Close the door')");
                        choice = userInput.nextLine().toLowerCase();
                        if (choice.equals("are you okay")){
                            System.out.print("The neighbor cries: 'Can I please spend a night in here?' (Y/N)");
                            choice = userInput.nextLine().toLowerCase();
                            break;
                        } else if (choice.equals("close the door")) {
                            choice = "n";
                            break;
                        }
                    } else {
                        System.out.println("You choose to try and get some rest.");
                    }
                }
            } else {
                String sleep = "Go back to sleep.";
                System.out.println(sleep);
            }
        }

        for (int i = 0; i < 3; i++) {
            if (choice.equals("y")) {
                System.out.println("Yeah of course come on in have a seat!");
                System.out.println("-------------------------");
                System.out.println("\t\tThe night of");
                System.out.println("-------------------------");
                System.out.println("You pour a glass and hand the neighbor some water. (What's wrong / let them calm down)");
                choice = userInput.nextLine().toLowerCase();
                choice.replaceAll("'", "");
                choice.replace(" ", "");
                if (choice.equals("whatswrong")){
                    System.out.println("'Don't go out there!' ");
                }
            }
        }

        if (choice.equals("n")){
            System.out.println("---------------------------");
            System.out.println("\t\tThe next day");
            System.out.println("---------------------------");

        }






    }
}
