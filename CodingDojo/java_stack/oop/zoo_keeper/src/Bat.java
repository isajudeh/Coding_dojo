public class Bat extends Mammal{
	
	int energyLevel = 300;
	public int fly() {
		energyLevel -= 50;
		System.out.println("EnergyLevel: " + energyLevel);
		return energyLevel;
		}
	
	public int eatHumans() {
		energyLevel += 25;
		System.out.println("EnergyLevel: " + energyLevel);
		return energyLevel;
		}
	
	public int attackTown() {
		energyLevel -= 100;
		System.out.println("EnergyLevel: " + energyLevel);
		return energyLevel;
		}

	
//	public void displayEnergy() {
//		System.out.println("Total EnergyLevel: " +energyLevel);
//	}
	
}
