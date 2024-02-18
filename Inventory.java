import java.util.*;
public class Inventory {
        static ArrayList<NotWeapon> inventoryItems = new ArrayList<NotWeapon>(6);
		static ArrayList<Weapon> inventoryWeapons = new ArrayList<Weapon>(2);
        Character c = new Character();

		public void addToItems(NotWeapon i) {
			if(inventoryItems.size() < 6) {
				inventoryItems.add(i);
			} else {
				System.out.println("Items are full.\nRemove an item beforehand.");
			}
		}

		public void addToWeapons(Weapon w) {
			if(inventoryWeapons.size() < 1) {
				inventoryWeapons.add(w);
			} else {
				System.out.println("Can't carry anymore weapons.\nRemove a weapon beforehand.");
			}
		}

		public void removeFromItems(NotWeapon y) {
			inventoryItems.remove(y);
		}

		public void removeFromWeapons(Weapon x) {
				inventoryWeapons.remove(x);
		}

        public Weapon getWeapon1() {
            return inventoryWeapons.get(0);
        }

        public void drop1() {
            if (inventoryWeapons.size()>0) {
                inventoryWeapons.remove(0);
            }
        }
        public void drop2() {
            if (inventoryItems.size()>0) {
                inventoryItems.remove(0);
            }
        }
        public void drop3() {
            if (inventoryItems.size()>1) {
                inventoryItems.remove(1);
            }
        }
        public void drop4() {
            if (inventoryItems.size()>2) {
                inventoryItems.remove(2);
            }
        }
        public void drop5() {
            if (inventoryItems.size()>3) {
                inventoryItems.remove(3);
            }
        }
        public void drop6() {
            if (inventoryItems.size()>4) {
                inventoryItems.remove(4);
            }
        }
        public void drop7() {
            if (inventoryItems.size()>5) {
                inventoryItems.remove(5);
            }
        }
        public void use2() {
            if (inventoryItems.size()>0) {
                c.healed(inventoryItems.remove(0).value());
            }
        }
        public void use3() {
            if (inventoryItems.size()>1) {
                c.healed(inventoryItems.remove(1).value());
            }
        }
        public void use4() {
            if (inventoryItems.size()>2) {
                c.healed(inventoryItems.remove(2).value());
            }
        }
        public void use5() {
            if (inventoryItems.size()>3) {
                c.healed(inventoryItems.remove(3).value());
            }
        }
        public void use6() {
            if (inventoryItems.size()>4) {
                c.healed(inventoryItems.remove(4).value());
            }
        }
        public void use7() {
            if (inventoryItems.size()>5) {
                c.healed(inventoryItems.remove(5).value());
            }
        }

        public void display() {
           System.out.println("Inventory: "); 
           if (inventoryWeapons.size() > 0) {
            System.out.println("Slot 1: " + inventoryWeapons.get(0).getDescription()); 
           }
           if (inventoryItems.size() > 0) {
           System.out.println("Slot 2: " + inventoryItems.get(0).getDescription()); 
           }
           if (inventoryItems.size() > 1) {
           System.out.println("Slot 3: " + inventoryItems.get(1).getDescription()); 
           }
           if (inventoryItems.size() > 2) {
           System.out.println("Slot 4: " + inventoryItems.get(2).getDescription()); 
           }
           if (inventoryItems.size() > 3) {
           System.out.println("Slot 5: " + inventoryItems.get(3).getDescription());
           } 
           if (inventoryItems.size() > 4) {
           System.out.println("Slot 6: " + inventoryItems.get(4).getDescription()); 
           }
           if (inventoryItems.size() > 5) {
           System.out.println("Slot 7: " + inventoryItems.get(5).getDescription()); 
           }
        }
    public boolean searchKey() {
        for (int i = 0; i < inventoryItems.size(); i++) {
            try {
                return (inventoryItems).get(i).isKey();
            }
            catch (Exception ae) {}
            
        }
        return false;
    }
}