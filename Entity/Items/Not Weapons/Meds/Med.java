public abstract class Med extends NotWeapon {
    int heal;
    public Med(int x) {
        heal = x;
    }
    
    public abstract int value();
}