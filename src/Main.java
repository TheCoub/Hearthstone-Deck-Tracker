import java.io.Console;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello!");
		
		JFrame frame = new JFrame("InputDialog Example #1");
		String filterString = JOptionPane.showInputDialog(frame, "What do you want to see?");
		
		String spyString = " ";
		
		String attackString = " ";
		
		String healthString = " ";
		
		String costString = " ";
		
		String statsString = " ";
		
		boolean searchingStats = false; 
		
		boolean searchingCost = false;
		
		boolean searchingAttack = false;
		
		boolean searchingHealth = false;
		
		int costSearch = -1;
		int attackSearch = -1;
		int healthSearch = -1;
		
		if(filterString.equals("cost") || filterString.equals("Cost")){
			
			costString = JOptionPane.showInputDialog(frame, "What cost cards do you want to see?");
			costSearch = Integer.parseInt(costString);
			searchingCost = true;
		
		} else if(filterString.equals("attack") || filterString.equals("Attack")){
			
			attackString = JOptionPane.showInputDialog(frame, "What attack minions do you want to see?");
			attackSearch = Integer.parseInt(attackString);
			searchingAttack = true;
			
		} else if(filterString.equals("spy") || filterString.equals("Spy")){
			System.out.println("It's Camden.");
		} else if(filterString.equals("health") || filterString.equals("Health")){
			
			healthString = JOptionPane.showInputDialog(frame, "What health minions do you want to see?");
			healthSearch = Integer.parseInt(healthString);
			searchingHealth = true;
			
		} else if(filterString.equals("stats") || filterString.equals("Stats")){
			
			statsString = JOptionPane.showInputDialog(frame, "What stat do you want to see?");
			searchingStats = true;
		}
		
		//Creating the spells in the deck
		Card arcBlast = new Card("Spell", 1, "Arcane Blast");
		
		Card mirImage = new Card("Spell", 1, "Mirror Image");
		
		Card frstbolt = new Card("Spell", 2, "Frostbolt");
		
		Card arcInt = new Card("Spell", 3, "Arcane Intellect");
		
		Card fBall = new Card("Spell", 4, "Fireball");
		
		Card poly = new Card("Spell", 4, "Polymorph");
		
		Card flamestrke = new Card("Spell", 7, "Flamestrike");
		
		List<Card> spells = new ArrayList<Card>();
		
		spells.add(arcBlast);
		spells.add(mirImage);
		spells.add(frstbolt);
		spells.add(arcInt);
		spells.add(fBall);
		spells.add(poly);
		spells.add(flamestrke);
		
		//Creating the minions in the deck
		Minionclass manaWyrm = new Minionclass("Minion", 1, "Mana Wyrm", 1, 3);
		
		Minionclass cultSorc = new Minionclass("Minion", 2, "Cult Sorcerer", 3, 2);
		
		Minionclass sorcApprentice = new Minionclass("Minion", 2, "Sorcerer's Apprentice", 3, 2); 
		
		Minionclass flamewake = new Minionclass("Minion", 3, "Flamewaker", 2, 4);
		
		Minionclass waterEle = new Minionclass("Minion", 4, "Water Elemental", 3, 6);
		
		Minionclass azure = new Minionclass("Minion", 5, "Azure Drake", 4, 4);
		
		Minionclass faceSum = new Minionclass("Minion", 6, "Faceless Summoner", 5, 5);
		
		Minionclass rag = new Minionclass("Minion", 8, "Ragnaros the Firelord", 8, 8);
		
		Minionclass yogg = new Minionclass("Minion", 10, "Yogg-Saron, Hope's End", 7, 5);
		
		//String[] minions = new String[2];
		List<Minionclass> minions = new ArrayList<Minionclass>();
		
		
		minions.add(manaWyrm);
		minions.add(cultSorc);
		minions.add(sorcApprentice);
		minions.add(flamewake);
		minions.add(waterEle);
		minions.add(azure);
		minions.add(faceSum);
		minions.add(rag);
		minions.add(yogg);
			
		//Creates bucket for costed minions
		if(searchingCost){
			List<Minionclass> CostedMinions = minionsOfCost(costSearch, minions);
			for (Minionclass minion : CostedMinions){
			
				System.out.println(minion.toString());			
			}
			List<Card> CostedSpells = spellsOfCost(costSearch, spells);
			for (Card spell : CostedSpells){
				
				System.out.println(spell.toString());
			}
		}
		//Creates bucket for attack of minions
		if(searchingAttack){
			List<Minionclass> AttackMinions = minionsOfAttack(attackSearch, minions);
			for (Minionclass minion : AttackMinions){
			
			System.out.println(minion.toString());			
			}
		}
		//Creates bucket for health of minions
		if(searchingHealth){
			List<Minionclass> HealthMinions = minionsOfHealth(healthSearch, minions);
			for (Minionclass minion : HealthMinions){
			
			System.out.println(minion.toString());			
			}
		}
		//Creates bucket for all minions
		double minionsInDeck = minions.size();

		if(searchingStats && (statsString.equals("Percent of Minions") || statsString.equals("percent of minons"))){
		
			System.out.println((minionsInDeck/30) * 100 + "%");
			
		}
	}
	
	//List that adds all minions of costedMinions
	private static List<Minionclass> minionsOfCost(int cost, List<Minionclass> authorityList){
		
		List<Minionclass> output = new ArrayList<Minionclass>();
		for(Minionclass minion : authorityList){
			if(minion.cost == cost){
				output.add(minion);
			}
		}
		return output;
	}
	private static List<Card> spellsOfCost(int cost, List<Card> authorityList){
		
		List<Card> output = new ArrayList<Card>();
		for(Card spell : authorityList){
			if(spell.cost == cost){
				output.add(spell);
			} 
		}
		return output;
	}
	
	//List that adds all minions of attackMinions
	private static List<Minionclass> minionsOfAttack(int attack, List<Minionclass> authorityList){
		
		List<Minionclass> output = new ArrayList<Minionclass>();
		for(Minionclass minion : authorityList){
			if(minion.attack == attack){
				output.add(minion);
			}
		}
		return output;
	}
	
	//List that adds all minions of healthMinions
		private static List<Minionclass> minionsOfHealth(int health, List<Minionclass> authorityList){
			
			List<Minionclass> output = new ArrayList<Minionclass>();
			for(Minionclass minion : authorityList){
				if(minion.health == health){
					output.add(minion);
				}
			}
			return output;
		}
	Weaponclass axe = new Weaponclass("Weapon", 2, "Fiery War Axe", 3, 2);
	//System.out.println(axe);
	
	Card muster = new Card("Spell", 3, "Muster for Battle");
	//System.out.println(muster);

}
