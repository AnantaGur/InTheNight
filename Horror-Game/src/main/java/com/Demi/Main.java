package com.Demi;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws JavaLayerException, FileNotFoundException, InterruptedException {
        Scanner userInput = new Scanner(System.in);
        Actions actions = new Actions();
        JumpOutTheWindow jump = new JumpOutTheWindow();

        FileInputStream rainFile = new FileInputStream("rainfall.mp3");
        FileInputStream quietFile = new FileInputStream("neighborknock.mp3");
        FileInputStream loudFile = new FileInputStream("loudknock.mp3");
        FileInputStream phoneFile = new FileInputStream("phonering.mp3");
        FileInputStream droneFile = new FileInputStream("drone.mp3");
        Player rainMP3 = new Player(rainFile);
        Player quietKnockMP3 = new Player(quietFile);
        Player loudKnockMP3 = new Player(loudFile);
        Player phoneRingMP3 = new Player(phoneFile);
        Player droneMP3 = new Player(droneFile);

        String choice = "y";

        for (int i = 0; i < 3; i++) {

            System.out.println("You wake up shaken from a nightmare; sweat drenched all over your back.");
            System.out.print("Would you like to get a drink of water? (Y/N) ");
            choice = userInput.nextLine().toLowerCase();
            if (choice.equals("y")) {
                boolean drinkWater = true;
                System.out.println("You get out of bed and pour yourself a drink of water.");
                if (drinkWater) {
                    System.out.print("You pour yourself a drink and hear . . .\n");
                    quietKnockMP3.play();
                    System.out.println("A knock on the door. Will you open? (Y/N)");
                    choice = userInput.nextLine().toLowerCase();
                    if (choice.equals("y")) {
                        System.out.print("You open your door. \nYou neighbor appears in a panic. " +
                                "('Are you okay' / 'Close the door')");
                        choice = userInput.nextLine().toLowerCase();
                        String choice1 = choice.replace(" ", "");
                        if (choice1.equals("areyouokay")) {
                            System.out.print("Shaking furiously with sunken cheeks he cries: \n" +
                                    "'I'm begging you, could I please spend the night here?' with a shaky tone (Y/N)");
                            choice = userInput.nextLine().toLowerCase();
                            if (choice.equals("y")) {
                                break;
                            } else if (choice.equals("n")) {
                                System.out.println("'I'm sorry I can't'\n" +
                                        "You close the door");
                                break;
                            }
                        } else if (choice.equals("closethedoor")) {
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
                System.out.println();
                System.out.println("-------------------------");
                System.out.println("\tThe night of");
                System.out.println("-------------------------");
                System.out.println();
                System.out.println("You pour a glass and hand the neighbor some water. (What's wrong / let him calm down)");
                choice = userInput.nextLine().toLowerCase();
                String choiceS = choice.replaceAll("'", "").replaceAll(" ", "");
                if (choiceS.equals("whatswrong")) {
                    System.out.print("'Don't go out there!' He furiously juts towards you grabbing your forearm.\n" +
                            "'The evil . . . There is . . .' He starts convulsing.\n" +
                            "Afraid you quickly jut backwards away from the man. (Help him / You need to get out)");
                    choice = userInput.nextLine().toLowerCase();
                    choiceS = choice.replaceAll("'", "").replaceAll(" ", "");
                    if (choiceS.equals("helphim")) {
                        System.out.println("You attempt to help the man, give him drinks," +
                                " and attempt to call an ambulance.");
                    } else if (choiceS.equals("youneedtogetout")) {
                        System.out.println("You plead for the man to get out of your home:\n" +
                                "'You need to get out!'");
                    }
                    System.out.println("The man starts violently seizing on the floor.\n" +
                            "In a panic you attempt to help him out anyways.\n" +
                            "'HEY! What's wrong!?' you exclaim. 'Hey don't die on me now!'");
                    break;
                } else {
                    System.out.println("The man starts to calm down . . . Then dead silence\n" +
                            "As if the world had froze he stares at you with horror.\n" +
                            "'The evil . . . There is . . .' He starts convulsing and drops \n" +
                            "seizing on the floor you attempt to help\n" +
                            "'HEY! What's wrong!?' you exclaim. 'Hey don't die on me now!'");
                }
            }
        }
        System.out.println();
        System.out.println("---------------------------");
        System.out.println("\t\tThe next day");
        System.out.println("---------------------------");
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print("You wake up shaken from a nightmare; sweat drenched all over your back.\n" +
                    "'What the hell!?' shaking off your nightmare you just had you go get yourself a drink of water.\n" +
                    "'That felt too real' then . . . ");
            Thread.sleep(3000);
            loudKnockMP3.play();
            System.out.println( "KNOCK... KNOCK... KNOCK... from your door\n" +
                    "You fall back shaken unable to even get a whimper out.  Do you open the door? (Y/N)");
            choice = userInput.nextLine().toLowerCase();
            if (choice.equals("y")) {
                System.out.print("You muster up enough courage to get up and face the door.\n" +
                        "'It was just a nightmare', you attempt to convince yourself.\n");
                System.out.println("As you muster up enough courage to open the door.\n");
                Thread.sleep(3000);
                phoneRingMP3.play();
                System.out.println("RING RING... RING RING... RING RING... Do you answer the phone or open the door?");
                choice = userInput.nextLine();
                String choiceS = choice.replaceAll("'", "").replaceAll(" ", "");
                if (choiceS.equals("answerthephone")) {
                    System.out.print("You chose to answer the phone white noise blasts your ears:\n" +
                            "BBBZZzzzz faint voice appears 'hello?..' bzzz" +
                            "'you' BZZzzzz 'run!' BZZzzzz (Jump out the window / Open the door / Hide) ");
                    choice = userInput.nextLine();
                    choiceS = choice.replaceAll("'", "").replaceAll(" ", "");
                    if (choiceS.equals("jumpoutthewindow")) {
                        jump.jumpOutTheWindow();
                        break;
                    } else if (choiceS.equals("openthedoor")) {
                        System.out.print("You open the door. . .\n" +
                                "Frozen with fear a tall lanky figures shadow towers over you.\n" +
                                "It makes a whispered whimper, it sounds like the being is in pain 'Aaaaggghhhhuuuuuuhhhhahhhh'\n" +
                                "(greet it / run / fight) ");
                        choice = userInput.nextLine();
                        choiceS = choice.replaceAll("'", "").replaceAll(" ", "");
                        if (choiceS.equals("greetit")) {
                            System.out.println("'Hi! How's it goin'!'\n" +
                                    "The being winds up revealing its claws and slashes down on your head.");
                            actions.getInstant();
                            break;
                        } else if (choiceS.equals("fight")) {
                            actions.getHit();
                            actions.attack();
                        }
                    } else {
                        System.out.print("You quickly run towards your room with the phone still ringing and door still banging.\n" +
                                "You chose to hide under your bed.");
                    }
                } else if (choiceS.equals("openthedoor")) {
                    System.out.print("You open the door. . .\n" +
                            "Frozen with fear a tall lanky figures shadow towers over you.\n" +
                            "It makes a whispered whimper, it sounds like the being is in pain 'Aaaaggghhhhuuuuuuhhhhahhhh'\n" +
                            "(greet it / run / fight) ");
                    droneMP3.play();
                    choice = userInput.nextLine();
                    choiceS = choice.replaceAll("'", "").replaceAll(" ", "");
                    if (choiceS.equals("greetit")) {
                        System.out.println("'Hi! How's it goin'!'\n" +
                                "The being winds up revealing its claws and slashes down on your head.");
                        actions.getInstant(); // insta kill
                        break;
                    } else if (choiceS.equals("fight")) {
                        actions.getHit(); // monster hits you
                        actions.attack(); // you hit back as long as you don't die immediately
                    }
                }
            } else if (choice.equals("n")) {
                System.out.print("You decide to go against it.\n" +
                        "Then you start hearing RING... RING.. RING.\n" +
                        "Both the door banging and phone ringing fills the void of the room.\n" +
                        "What do you do? (Answer the phone / Open the door / Hide) ");
                choice = userInput.nextLine();
                String choiceS = choice.replaceAll("'", "").replaceAll(" ", "");
                if (choiceS.equals("greetit")) {
                    System.out.println("'Hi! How's it goin'!'\n" +
                            "The being winds up revealing its claws and slashes down on your head.");
                    actions.getInstant(); // insta kill
                    break;
                } else if (choiceS.equals("fight")) {
                    actions.getHit();
                    actions.attack();
                } else {
                    System.out.print("You quickly run towards your room with the phone still ringing and door still banging.\n" +
                            "You chose to hide under your bed.");
                }
            }

        }

    }
}
