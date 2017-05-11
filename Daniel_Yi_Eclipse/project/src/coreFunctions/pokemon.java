package coreFunctions;

import java.util.HashMap;
import java.util.Scanner;

public class pokemon {

	public static HashMap<Integer, String> pokemonID = new HashMap<Integer, String>();
	public static HashMap<Integer, String> StatusID = new HashMap<Integer, String>();
	public static HashMap<Integer, String> AttackID = new HashMap<Integer, String>();
	public static HashMap<Integer, String> AttackType = new HashMap<Integer, String>();
	public static HashMap<Integer, String> TypeID = new HashMap<Integer, String>();
	public static HashMap<Integer, Integer> PokeType = new HashMap<Integer, Integer>();
	
	
	/* Poke Status
	 *  [PokeID]
	 *  [HP]
	 *  [XP]
	 *  [Status Effects]
	 */
	
	public static double[][] pokeStatus = new double[10][3];
	public static double[][] pokeAttacks = new double[10][5];
	public static int[] pokeParty = new int[6];
	public static int[][] PDA = new int[10][3];
	/* The Attack ID
	 * Damage
	 * Acc
	 */
	
	private static Scanner keyboard = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setupPokeAttack();
		setupPokemonID(10, 100);
		startMenu();
	}
	
	public static void startMenu() {
		System.out.println("1.) Start");
		int start = keyboard.nextInt();
		battleMenu();
	}
	
	public static void battleMenu() {
		clearScreen();
		System.out.println(pokemonID.get(1) + " wants to fight you!");
		System.out.println("Choose an attack");
		System.out.println(AttackID.get(1));
		System.out.println();
		System.out.println();
	}
	
	public static void clearScreen() {
		for(int x = 0; x < 20; x++) {
			System.out.println();
		}
	}
	
	public static void setupPokemonID(double PokeBaseHP, double PokeEXP) {
		
		pokemonID.put(1, "PikaRat");
		pokeStatus[0][0] = 1;
		pokeStatus[0][1] = PokeBaseHP;
		pokeStatus[0][2] = PokeEXP;
	}
	
	public static void setupPokeStatus() {
		StatusID.put(1, "Normal");
	}

	public static void setupPokeAttack() {
		AttackID.put(1, "ThunderBolt");
		AttackType.put(1, "mBase");
		
		baseDamageSetup(0, 2);
	}
	
	public static void baseDamageSetup(int pokeID, int PokeBaseAttack) {
		int lBase = 30;
		int mBase = 40;
		int hBase = 60;
		if(AttackType.get(pokeID).equals("lBase")) {
			PDA[pokeID][1] = (lBase/PokeBaseAttack);
		} else if(AttackType.get(pokeID).equals("mBase")) {
			PDA[pokeID][1] = (mBase/PokeBaseAttack);
		} else {
			PDA[pokeID][1] = (hBase/PokeBaseAttack);
		}
	}
	
	public static void baseAccSetup() {
		
	}
}
