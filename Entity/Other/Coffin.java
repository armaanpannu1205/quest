public class Coffin extends Entity {
    public String getIcon() {
        return "⚰️";
    }

    public String getDescription() {
        return "You graverob it for a weapon.";
    }

    public Weapon graveloot() {
        if ((int)(Math.random() * 2) == 1) {
            DualSword d = new DualSword();
            System.out.println("Obtained \"DualSword.\"");
            return d;
        }
        else {
            Bow s = new Bow();
            System.out.println("Obtained \"Bow.\"");
            return s;
        }
    }
}