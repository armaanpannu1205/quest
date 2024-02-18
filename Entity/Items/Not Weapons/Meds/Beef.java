public class Beef extends Med {
    public Beef() {
			super(50);
		}

    public String getIcon() {
        return "🥩";
    }

    public String getDescription() {
        return "🥩 (Restores 50HP)";
    }

    public int value() {
        return 50;
    }
}