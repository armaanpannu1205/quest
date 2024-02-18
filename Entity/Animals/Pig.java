public class Pig extends Animal {
    public String getIcon() {
        return "🐖";
    }

    public String getDescription() {
        return "This native breed of boar is a non-aggressive animal.\nIt is very yummy.\nObtained \"Ham.\"";
    }

    public Med isDead() {
        Ham ham = new Ham();
        return ham;
    }
}