package com.Demi;
import java.util.Scanner;

public class JumpOutTheWindow extends Main{
    public String jumpOutTheWindow(){
        Scanner userInput = new Scanner(System.in);
        Actions actions = new Actions();
        String choice = "y";

        for (int i = 0; i < 3; i++) {
            System.out.print("You chose to follow the voice on the phone and not open the door.\n" +
                    "You open and jump out of your second story window.\n" +
                    "'AAaaughh' you roll your ankle.\n" +
                    "Hobbled but able to continue you get up and make your way through the night.");
            actions.setStatus("Sprained Ankle");

            System.out.println();
            System.out.println("-----------------------");
            System.out.println("\t The Other Side");
            System.out.println("-----------------------");
            System.out.println();

            System.out.println("Out here in the pitch black night you barely can even see 10 feet in front of you" +
                    "\nYou wonder why it's still night even though you could've sworn you slept all night." +
                    "\nFirst thing is survival so you keep moving to see if you can find any sort of help." +
                    "\nYou see a group of shadows, in the shape of people, gathered around a glow of light." +
                    "\n (Call out / Move on)");
            choice = userInput.nextLine().toLowerCase();
            choice = choice.replace(" ", "");
            if (choice.equals("callout")){
                System.out.println("'Hey! There's something going on, could any of you help!?'" +
                        "\nThe group of figures don't move the glow of the light continues.");
            }


        }
        return null;
    }
}
