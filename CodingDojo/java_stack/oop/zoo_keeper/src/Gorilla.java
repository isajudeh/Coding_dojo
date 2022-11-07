public class Gorilla extends Mammal{
	
	public int throwSomething() {
		energyLevel -= 5;
		System.out.println("EnergyLevel: " + energyLevel);
		return energyLevel;
		}
	
	public int eatBananas() {
		energyLevel += 10;
		System.out.println("EnergyLevel: " + energyLevel);
		return energyLevel;
		}
	
	public int climb() {
		energyLevel -= 10;
		System.out.println("EnergyLevel: " + energyLevel);
		return energyLevel;
		}
	
}