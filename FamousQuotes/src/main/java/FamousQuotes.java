

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner userChoice = new Scanner(System.in);


        String[] songs = {"1. What a fool believes - Doobie Brothers",
                "2. Peg - Steely Dan",
                "3. Ride like The Wind - Christopher Cross",
                "4.Just the Two of Us - Bill Withers",
                "5. Sarah Smile - Hall & Oates",
                "6. Rosanna - Toto",
                "7. How Long - Ace",
                "8. Brandy - Looking Glass",
                "9. Dreams - Fleetwood Mac",
                "10. Africa - Toto"};


        System.out.println("Choose a number from 1-10 pick your favorite song");
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i]);
        }
        System.out.println("Your choice: ");
        String input = userChoice.nextLine();

        try {
            int choice = Integer.parseInt(input);

            if (choice >= 1 && choice <= songs.length) {
                String selected = songs[choice - 1];
                System.out.println("You chose: " + selected);

                switch (choice) {
                    case 1:
                        System.out.println("Classic🎵");
                        break;
                    case 2:
                        System.out.println("Groovy 🕺🏽");
                        break;
                    case 3:
                        System.out.println("Me too! 🏇🏽");
                        break;
                    case 4:
                        System.out.println("We can make it if we try! 🧑‍🤝‍🧑");
                        break;
                    case 5:
                        System.out.println("80s Ruled 😎");
                        break;
                    case 6:
                        System.out.println("Nice 🏎");
                        break;
                    case 7:
                        System.out.println("Sweet 🕺🏽");
                        break;
                    case 8:
                        System.out.println("Classic yacht rock! 🚢");
                        break;
                    case 9:
                        System.out.println("Groovy ⚡");
                        break;
                    case 10:
                        System.out.println("Awesome! 🌍");

                }
            } else {
                System.out.println("Invalid choice! Try again.");

            }

        } catch (Exception e) {
            System.out.println("Invalid choice! Please enter a number from 1 to 10.");

        }


    }
}



