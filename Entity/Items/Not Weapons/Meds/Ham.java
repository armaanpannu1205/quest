public class Ham extends Med {
	public Ham() {
		super(40);
	}
	
    public String getIcon() {
        return "🍖";
    }
		

    public String getDescription() {
        return "🍖 (Restores 40HP)";
    }
    public int value() {
        return 40;
    }
}