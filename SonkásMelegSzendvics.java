public class Melegszendvics {
	public Melegszendvics(Ingredient[] ingredients) {
		for (Ingredient i : ingredients) {
			if (i instanceof Kenyér k) k.cook();
		}
	}
	
	public static void main(String[] args) {
		Melegszendvics msz = new Melegszendvics(new Ingredient[{new Kenyér(false)}]);
	}
}

public abstract class Ingredient {
	
	public int getSaltyness();
	
	public String getName();
	
	public int getRequiredCookingTime();
	
}

// ingredients
public class Kenyér extends Ingredient {
	
	public Kenyér(boolean cookInstant) {
		if (cookInstant) {
			cook();
		}
	}
	
	public void cook() {
		
	}
	
	public int getSaltyness() {
		return 0;
	}
	
	public String getName() {
		return "Kenyér";
	}
	
	public int getRequiredCookingTime() {
		return 4;
	}
	
	
}