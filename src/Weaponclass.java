
public class Weaponclass extends Card {
	public int wepAttack;
	public int durability;

	public Weaponclass(String cType, int cCost, String cName, int wAttack, int wDurability){
		super(cType, cCost, cName);
		wepAttack = wAttack;
		durability = wDurability;
	}
	
	public String toString(){
		return name + " is a " + cost + " Cost " + type + " with " + wepAttack + " Attack " + durability + " Durability.";
	}
}