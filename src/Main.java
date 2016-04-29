import java.io.Console;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello!");
		
		JFrame frame = new JFrame("InputDialog Example #1");
		String costString = JOptionPane.showInputDialog(frame, "What cost minions do you want to see?");
		
		int costSearch = Integer.parseInt(costString);

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
		List<Minionclass> CostedMinions = minionsOfCost(costSearch, minions);
		for (Minionclass minion : CostedMinions){
			
			System.out.println(minion.toString());			
		}		
	
		Weaponclass axe = new Weaponclass("Weapon", 2, "Fiery War Axe", 3, 2);
		//System.out.println(axe);
		
		Card muster = new Card("Spell", 3, "Muster for Battle");
		//System.out.println(muster);
		
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
}
