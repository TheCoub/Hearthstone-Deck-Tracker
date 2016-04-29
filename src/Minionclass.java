
public class Minionclass extends Card {
	public int attack;
	public int health;

	public Minionclass(String cType, int cCost, String cName, int mAttack, int mHealth){
		super(cType, cCost, cName);
		attack = mAttack;
		health = mHealth;
	}
	
	public String toString(){
		return name + " is a " + cost + " Cost " + type + " with " + attack + " Attack and " + health + " Health.";
	}
}
