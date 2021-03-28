package domain;

public abstract class CommonDuck implements DuckService {
	private DuckType duckName;

	public CommonDuck(DuckType string) {
		this.duckName = string;
	}
	
	@Override
	public DuckType returnName() {
		return duckName;
	}

	public String duckBreed() {
		return "can breed";
	}
	
	public void printDuck() {
		System.out.println("The duck name is " + returnName() + ".");
		System.out.println("The duck " + duckBreed() + ".");
		System.out.println("It's " + duckFly() + " that the duck can fly.\n");
	}
}
