public class Character extends Entity {
    static int hp = 100;

    public String getIcon() {
        return "🧍";
    }

    public void recievedDamage(int x) {
        hp = hp - x;
        System.out.println("Remaining HP: " + hp);
    }

    public void healed(int x) {
        hp = hp + x;
        if (hp > 100) {
            hp = 100;
        }
    }

    public String getDescription() {
        return "";
    }
    
    public int getHp() {
        return hp;
    }
}