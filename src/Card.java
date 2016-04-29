
public class Card {
	public String type;
	public int cost;
	public String name;
	
	public Card(String cType, int cCost, String cName){
		type = cType;
		cost = cCost;
		name = cName;
	}
	
	public String toString(){
		return name + " is a " + cost + " Cost " + type + ". ";
	}
}
