public class Cow extends Animal {
    public String getIcon() {
        return "🐄";
    }

    public String getDescription() {
        return "A timid but large animal who doesn attack.\nIt's meat is very nutritious.\nObtained \"Beef.\"";
    }

    public Med isDead() {
        Beef beef = new Beef();
        return beef;
    }
}