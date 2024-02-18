import java.util.*;
public class Map {
    Character c = new Character();
    Entity[][] mainmap = new Entity[45][70]; //Map Size
    int x = 22; //Starting coordinates of Character
    int y = 22;
    Entity lol = new Tree(); //Temp Variable
    Inventory inv = new Inventory();
    public void test() {
        for (int i = 0; i < mainmap.length; i++) {
            for (int j = 0; j < mainmap[i].length; j++) {
                System.out.print(mainmap[i][j].getIcon());
            }
        System.out.println();
        }
    }
    public void createMap() {
        inv.addToWeapons(new Axe());//For inventory.
        int temp; //Temp variable


        //Creates Trees
        for (int i = 0; i < mainmap.length; i++) {
            for (int j = 0; j < mainmap[i].length; j++) {
                temp = (int) (Math.random() * 12);
                if (temp == 11) {
                    mainmap[i][j] = new TreeWall();}
                else if (temp == 6) {
                    mainmap[i][j] = new Tree(); }
                else {
                    mainmap[i][j] = new Empty(); }
            }
        }


        //Creates Coffins
        for (int i = 0; i < mainmap.length; i++) {
            for (int j = 0; j < mainmap[i].length; j++) {
                temp = (int) (Math.random() * 200);
                if (temp == 1) {
                    mainmap[i][j] = new Coffin(); }
            }
        }


        //Creates Mobs
        for (int i = 0; i < mainmap.length; i++) {
            for (int j = 0; j < mainmap[i].length; j++) {
                temp = (int) (Math.random() * 120);
                if (temp == 1) {
                    mainmap[i][j] = new Snake(); }
                else if (temp == 2) {
                    mainmap[i][j] = new Scorpion(); }
            }
        }


        //Create Houses
        for (int i = 0; i < mainmap.length; i++) {
            for (int j = 0; j < mainmap[i].length; j++) {
                temp = (int) (Math.random() * 150);
                if (temp == 1) {
                    mainmap[i][j] = new House(); }
            }
        }


        //Create Animals
        for (int i = 0; i < mainmap.length; i++) {
            for (int j = 0; j < mainmap[i].length; j++) {
                temp = (int) (Math.random() * 150);
                if (temp == 1) {
                    mainmap[i][j] = new Pig(); }
                else if (temp == 2) {
                    mainmap[i][j] = new Cow(); }
            }
        }
        
        for (int i = 3; i < mainmap.length; i++) {
            for (int j = 45; j < mainmap[i].length; j++) {
                mainmap[i][j] = new Empty(); }
        }

        //Places
        mainmap[6][6] = new HauntedHouse();
        mainmap[22][22] = new Character();


        //Bosses
        mainmap[12][56] = new Devil();
        mainmap[14][56] = new Zombie();
        mainmap[13][56] = new Zombie();

        mainmap[11][56] = new Zombie();
        mainmap[10][56] = new Zombie();

        mainmap[12][57] = new Zombie();
        mainmap[12][58] = new Zombie();

        mainmap[12][55] = new Zombie();
        mainmap[12][54] = new Zombie();

        mainmap[10][55] = new Zombie();
        mainmap[10][57] = new Zombie();
        mainmap[13][55] = new Zombie();
        mainmap[13][57] = new Zombie();


        //Walls
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < mainmap[i].length; j++) {
                mainmap[i][j] = new Wall(); }
        }
        for (int i = 42; i < 45; i++) {
            for (int j = 0; j < mainmap[i].length; j++) {
                mainmap[i][j] = new Wall(); }
        }
        for (int i = 0; i < mainmap.length; i++) {
            for (int j = 0; j < 3; j++) {
                mainmap[i][j] = new Wall(); }
        }
        for (int i = 0; i < mainmap.length; i++) {
            for (int j = 42; j < 45; j++) {
                mainmap[i][j] = new Wall(); }
        }
        for (int i = 42; i < mainmap.length; i++) {
            for (int j = 45; j < mainmap[i].length; j++) {
                mainmap[i][j] = new Wall(); }
        }
        for (int i = 21; i < 24; i++) {
            for (int j = 45; j < mainmap[i].length; j++) {
                mainmap[i][j] = new Wall(); }
        }
        for (int i = 0; i < mainmap.length; i++) {
            for (int j = 67; j < 70; j++) {
                mainmap[i][j] = new Wall(); }
        }
        
    }


    //Prints Entities around Character
    public void printArea() {
        if (inv.searchKey() == true && (x == 7) && (y == 6)) {
            mainmap[x][y] = new Empty();
            mainmap[12][60] = new Character();
            x = 12;
            y = 60;
        }
        if ((x == 12) && (y == 56)) {
            int temp;
            for (int i = 3; i < 42;i++) {
            for (int j = 3; i < 42; i++) {
                temp = (int) (Math.random() * 200);
                if (temp == 1) {
                    mainmap[i][j] = new People(); }
            }
        }
            mainmap[x][y] = new Empty();
            mainmap[22][22] = new Character();
            x = 22;
            y = 22;
            System.out.println("And thus concluded the Shoguns story.");
            System.out.println("https://www.youtube.com/watch?v=1Bix44C1EzY");
        }
        System.out.println("━━━━━━━━━━━━━━");
        for (int a = x-3; a < x+3; a++) {
            for (int b = y-3; b < y+3; b++) {
                    System.out.print(mainmap[a][b].getIcon());
                }
            System.out.println();
        }
        System.out.println("━━━━━━━━━━━━━━");
    }

    
    //Movements and Interactions
    public void moveUp() {
        //Tests for Hardened to see if character can move
        try {
            lol = (Hardened)mainmap[x-1][y];
            System.out.println(lol.getDescription());
        }
        catch (Exception a) {
            //Tests for Mobs
            try {
                lol = (Mob)mainmap[x-1][y];
                System.out.println(lol.getDescription());
                System.out.println("Foe was slain!");
                int temp = (int) (Math.random() * 75);
                c.recievedDamage(temp);
                if (c.getHp() <= 0) {
                    System.out.println("GameOver!");
                    for (int i = 0; i < mainmap.length; i++) {
                        for (int j = 0; j < mainmap[i].length; j++) {
                    mainmap[i][j] = new Devil(); }
                    }
                }
                temp = (int)(Math.random() * 8);
                if (temp == 5) {
                    System.out.println("Obtained \"Key.\"");
                    inv.addToItems(new Key());
                }
            
                mainmap[x][y] = new Empty();
                x = x - 1;
                mainmap[x][y] = new Character();
                

            }
            catch (Exception b) {
                //Tests for Animal
                try {
                    lol = (Animal)mainmap[x-1][y];
                    System.out.println(lol.getDescription());
                    mainmap[x][y] = new Empty();
                    x = x - 1;
                    mainmap[x][y] = new Character();
                    try {
                    inv.addToItems(((Animal)lol).isDead());
                    } catch (Exception ab) {}
                    

                }
                catch (Exception c) {
                    //Tests for Coffin
                    try { 
                        lol = (Coffin)mainmap[x-1][y];
                        System.out.println(lol.getDescription());
                        mainmap[x][y] = new Empty();
                        x = x - 1;
                        mainmap[x][y] = new Character();
                        try {
                        inv.addToWeapons((Weapon)(((Coffin)lol).graveloot()));
                            } catch (Exception ae) {}
                        //


                        }
                    catch (Exception d) {
                        //Tests for House
                        try {
                            lol = (House)mainmap[x-1][y];
                            System.out.println(lol.getDescription());
                            mainmap[x][y] = new Empty();
                            x = x - 1;
                            mainmap[x][y] = new Character();
                            try {
                            ((House)lol).dialogue();
                            } catch (Exception za) {}


                        }
                         catch (Exception z) {
                        mainmap[x][y] = new Empty();
                        x = x - 1;
                        mainmap[x][y] = new Character();
                        }
                    }
                }
            }
        }
    }

    public void moveDown() {
        try {
            lol = (Hardened)mainmap[x+1][y];
            System.out.println(lol.getDescription());
        }
        catch (Exception e) {
            try {
                lol = (Mob)mainmap[x+1][y];
                System.out.println(lol.getDescription());
                mainmap[x][y] = new Empty();
                x = x + 1;
                mainmap[x][y] = new Character();
                System.out.println("Foe was slain!");
                int temp = (int) (Math.random() * 75);
                c.recievedDamage(temp);
                if (c.getHp() <= 0) {
                    System.out.println("GameOver!");
                    for (int i = 0; i < mainmap.length; i++) {
                        for (int j = 0; j < mainmap[i].length; j++) {
                    mainmap[i][j] = new Devil(); }
                    }
                }
                temp = (int)(Math.random() * 8);
                if (temp == 5) {
                    System.out.println("Obtained \"Key.\"");
                    inv.addToItems(new Key());
                }    
            }
            catch (Exception f) {
                try {
                    lol = (Animal)mainmap[x+1][y];
                System.out.println(((Animal)lol).getDescription());
                mainmap[x][y] = new Empty();
                x = x + 1;
                mainmap[x][y] = new Character();
                try {
                    lol = new Coffin();
                    inv.addToItems(((Animal)lol).isDead());
                    } catch (Exception aa) {}


                }
                catch (Exception g) {
                    try { 
                        lol = (Coffin)mainmap[x+1][y];
                        System.out.println(lol.getDescription());
                        mainmap[x][y] = new Empty();
                        x = x + 1;
                        mainmap[x][y] = new Character();
                        try {
                        inv.addToWeapons(((Coffin)lol).graveloot());
                            } catch (Exception af) {}


                        }
                    catch (Exception h) {
                        try {
                            lol = (House)mainmap[x+1][y];
                            System.out.println(lol.getDescription());
                            mainmap[x][y] = new Empty();
                            x = x + 1;
                            mainmap[x][y] = new Character();
                            try {
                            ((House)lol).dialogue();
                            } catch (Exception zb) {}
                        } 
                        catch (Exception q) {
                            mainmap[x][y] = new Empty();
                            x = x + 1;
                            mainmap[x][y] = new Character();
                        }
                    }
                }
            }
        }
    }

    public void moveLeft() {
        try {
            lol = (Hardened)mainmap[x][y-1];
            System.out.println(lol.getDescription());
        }
        catch (Exception u) {
            try {
                lol = (Mob)mainmap[x][y-1];
                System.out.println(((Mob)lol).getDescription());
                mainmap[x][y] = new Empty();
                y = y - 1;
                mainmap[x][y] = new Character();
                System.out.println("Foe was slain!");
                int temp = (int) (Math.random() * 75);
                c.recievedDamage(temp);
                if (c.getHp() <= 0) {
                    System.out.println("GameOver!");
                    for (int i = 0; i < mainmap.length; i++) {
                        for (int j = 0; j < mainmap[i].length; j++) {
                    mainmap[i][j] = new Devil(); }
                    }
                }
                temp = (int)(Math.random() * 8);
                if (temp == 5) {
                    System.out.println("Obtained \"Key.\"");
                    inv.addToItems(new Key());
                    }   
                }
            catch (Exception j) {
                try {
                    lol = (Animal)mainmap[x][y-1];
                System.out.println(lol.getDescription());
                mainmap[x][y] = new Empty();
                y = y - 1;
                mainmap[x][y] = new Character();
                try {
                    inv.addToItems(((Animal)lol).isDead());
                    } catch (Exception ac) {}


                }
                catch (Exception k) {
                    try { 
                        lol = (Coffin)mainmap[x][y-1];
                        System.out.println(lol.getDescription());
                        mainmap[x][y] = new Empty();
                        y = y - 1;
                        mainmap[x][y] = new Character();
                        try {
                        inv.addToWeapons(((Coffin)lol).graveloot());
                            } catch (Exception ag) {}


                        }
                    catch (Exception l) { try {
                        lol = (House)mainmap[x][y-1];
                        System.out.println(lol.getDescription());
                        mainmap[x][y] = new Empty();
                        y = y - 1;
                        mainmap[x][y] = new Character();
                        try {
                            ((House)lol).dialogue();
                            } catch (Exception zc) {}


                        } 
                        catch (Exception t) {
                            mainmap[x][y] = new Empty();
                            y = y - 1;
                            mainmap[x][y] = new Character();
                        }
                    }
                }
            }
        }
    }

    public void moveRight() {
        try {
            lol = (Hardened)mainmap[x][y+1];
            System.out.println(lol.getDescription());
        }
        catch (Exception m) {
            try {
                lol = (Mob)mainmap[x][y+1];
                System.out.println(lol.getDescription());
                mainmap[x][y] = new Empty();
                y = y + 1;
                mainmap[x][y] = new Character();
                System.out.println("Foe was slain!");
                int temp = (int) (Math.random() * 75);
                c.recievedDamage(temp);
                if (c.getHp() <= 0) {
                    System.out.println("GameOver!");
                    for (int i = 0; i < mainmap.length; i++) {
                        for (int j = 0; j < mainmap[i].length; j++) {
                    mainmap[i][j] = new Devil(); }
                    }
                }
                temp = (int)(Math.random() * 8);
                if (temp == 5) {
                    System.out.println("Obtained \"Key.\"");
                    inv.addToItems(new Key());
                    }
                }
            catch (Exception n) {
                try {
                    lol = (Animal)mainmap[x][y+1];
                System.out.println(lol.getDescription());
                mainmap[x][y] = new Empty();
                y = y + 1;
                mainmap[x][y] = new Character();
                try {
                    inv.addToItems(((Animal)lol).isDead());
                    } catch (Exception ad) {}


                }
                catch (Exception o) {
                    try { 
                        lol = (Coffin)mainmap[x][y+1];
                        System.out.println(lol.getDescription());
                        mainmap[x][y] = new Empty();
                        y = y + 1;
                        mainmap[x][y] = new Character();
                        try {
                        inv.addToWeapons(((Coffin)lol).graveloot());
                            } catch (Exception ah) {}


                        }
                    catch (Exception p) { try {
                        lol = (House)mainmap[x][y+1];
                        System.out.println(lol.getDescription());
                        mainmap[x][y] = new Empty();
                        y = y + 1;
                        mainmap[x][y] = new Character();
                        try {
                            ((House)lol).dialogue();
                            } catch (Exception zd) {}


                    } 
                    catch (Exception w) {
                            mainmap[x][y] = new Empty();
                            y = y + 1;
                            mainmap[x][y] = new Character();
                        }
                    }
                }
            }
        }
    }

    //Uses inputs
    public void useWasd(String z) {
        String input = z;
        int temp;
        if (input.length()==0) {
        }
        else
            if (input.equalsIgnoreCase("/help")) {
                System.out.println();
                System.out.println();
                System.out.println("List of Commands: ");
                System.out.println("/hp");
                System.out.println("/use#");
                System.out.println("/drop#");
                System.out.println("/inventory");
                System.out.println("/cords");
            }
            if (input.equalsIgnoreCase("/cords")) {
                System.out.println("X: " + x);
                System.out.println("Y: " + y);
                input = "."; 
            }
            if (input.equalsIgnoreCase("/hp")) {
                System.out.println("Health: " + ((Character)mainmap[x][y]).getHp() + "/100");
            }
            if (input.equalsIgnoreCase("/inventory")) {
                inv.display();
            }
            if (input.equalsIgnoreCase("/drop1")) {
                inv.drop1();
                System.out.println("Dropped item.");
                input = "."; 
            }
            if (input.equalsIgnoreCase("/drop2")) {
                inv.drop2();
                System.out.println("Dropped item.");
                input = "."; 
            }
            if (input.equalsIgnoreCase("/drop3")) {
                inv.drop3();
                System.out.println("Dropped item.");
                input = "."; 
            }
            if (input.equalsIgnoreCase("/drop4")) {
                inv.drop4();
                System.out.println("Dropped item.");
                input = ".";
            }
            if (input.equalsIgnoreCase("/drop5")) {
                inv.drop5();
                System.out.println("Dropped item.");
                input = "."; 
            }
            if (input.equalsIgnoreCase("/drop6")) {
                inv.drop6();
                System.out.println("Dropped item.");
                input = "."; 
            }
            if (input.equalsIgnoreCase("/drop7")) {
                inv.drop7();
                System.out.println("Dropped item.");
                input = "."; 
            }
            if (input.equalsIgnoreCase("/use2")) {
                inv.use2();
                System.out.println("Used item.");
                input = "."; 
            }
            if (input.equalsIgnoreCase("/use3")) {
                inv.use3();
                System.out.println("Used item.");
                input = "."; 
            }
            if (input.equalsIgnoreCase("/use4")) {
                inv.use4();
                System.out.println("Used item.");
                input = "."; 
            }
            if (input.equalsIgnoreCase("/use5")) {
                inv.use5();
                System.out.println("Used item.");
                input = "."; 
            }
            if (input.equalsIgnoreCase("/use6")) {
                inv.use6();
                System.out.println("Used item.");
                input = "."; 
            }
            if (input.equalsIgnoreCase("/use7")) {
                inv.use7();
                System.out.println("Used item.");
                input = "."; 
            }
            for (int i = 0; i < input.length(); i++) {
                if (input.substring(i,i+1).equals("w")) {
                    moveUp();
                }
                else if (input.substring(i,i+1).equals("s")) {
                    moveDown();
                }
                else if (input.substring(i,i+1).equals("a")) {
                    moveLeft();
                }
                else if (input.substring(i,i+1).equals("d")) {
                    moveRight();
            }
        }
    }
}
