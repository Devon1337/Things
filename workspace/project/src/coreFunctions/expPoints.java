package coreFunctions;

public class expPoints {


	
	public void setLevel(double PokeLevel) {
		
		
	}
	
	public void getLevel(double PokeLevel) {
		
		setLevel(PokeLevel);
		
	}
	
	public void totalEXP(double PokeLevel) {
		
		double baseEXP = 100;
		double expMulti = 2.5 * PokeLevel;
		double expTotal = PokeLevel + expMulti;	
		double RequiredExp = expTotal;
		
	}
	
	public void LevelManager(double PokeLevel, double RequiredExp, double currentEXP) {
		
		int baseLevel = 1;
		int maxLevel = 100;
		
		if(currentEXP == RequiredExp){
			PokeLevel++;
			
		}
		
	}

}
