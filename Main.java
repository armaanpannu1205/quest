import java.util.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String typed;
        Plot p = new Plot();
        Map map = new Map();
        map.createMap();
        Scanner scan = new Scanner(System.in);

        
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("     Welcome to Quest!");
        System.out.println("       ▬▬ι═══════ﺤ");
        System.out.println("\n\n\n\n\n\n\n\n\n");
        System.out.println("Type to continue.");
        typed = scan.next();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Please zoom in using \"CTRL\" and \"+\" to view the map.");
        System.out.println("Use \"WASD\" to move around.");
        System.out.println("Type \"/help\" for a list of commands.");
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println("Type to continue.");
        typed = scan.next();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("It is often better to enjoy the game with some music.");
        System.out.println("Suggestion: https://www.youtube.com/watch?v=qCa64XOO5Ng&t=359s");
        System.out.println("\n\n\n\n\n\n\n\n\n");
        System.out.println("Type to continue.");
        typed = scan.next();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Long ago, a deity who was praised and prayed to became corrupted.");
        System.out.println("It is unknown why, but the deity fell to the earth at the speed of light.");
        System.out.println("At the time of impact, a Shogun was there.");
        System.out.println("The Shogun realized the vileness leaking from this wreck, right before him.");
        System.out.println("Before a glance could be taken, he delivered a slice.");
        System.out.println("However, the physical properties of the sword did not affect this spiritual entity.");
        System.out.println("Instead, the slice lead to the Shoguns vulnerability and death.");
        System.out.println("Little did the entity know, the sword was casted with a spell that reduced their power 1000 fold.");
        System.out.println("Being a spiritual creature, dependent on prayer for power, it is only of now that the entity gained back its power.");
        System.out.println("\n\n");
        System.out.println("Type to continue.");
        typed = scan.next();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("The entities return was little known.");
        System.out.println("The first sign to come was the vanishment of people.");
        System.out.println("Then, creatures of unusual size began appearing.");
        System.out.println("It was soon known across Japan that everyone from the inland had disappeared.");
        System.out.println("Japan's citizens being scared called for the greatess Shogun they knew.");
        System.out.println("That is you... you are the Shogun.");
        System.out.println("This is your journey.");
        System.out.println("\n\n\n\n");
        System.out.println("Type to continue.");
        typed = scan.next();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Use \"WASD\" to move around.");
        System.out.println("Type \"/help\" for a list of commands.");
        map.printArea();
        System.out.println("\n");
        
        boolean x = true;
        while (x == true) {
            typed = scan.next();
            map.useWasd(typed);
            map.printArea();
            System.out.println("\n");
        }
        //Game runs here
    }

    
}