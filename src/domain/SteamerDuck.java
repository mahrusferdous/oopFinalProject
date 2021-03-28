package domain;

public class SteamerDuck extends CommonDuck {

	public SteamerDuck(DucksEntry duckName) {
		super(duckName.getDuckName());
	}

	@Override
	public boolean duckFly() {
		return false;
	}

}
