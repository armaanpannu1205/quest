public class House extends Entity {
    public String getIcon() {
        return "🏠";
    }

    public String getDescription() {
        return "The residents are long gone.";
    }

    public String dialogue() {
        int x = (int)(Math.random() * 4);
        if (x < 3) {
            System.out.println("You found:\nNothing...");
        }
        if (x == 3) {
            System.out.println("You found:\nSome odd shaped footprints leading NorthWest");
        }
        return "";
    } 
}