package domain;

public class MallardDuck extends CommonDuck {

	public MallardDuck(DucksEntry duckName) {
		super(duckName.getDuckName());
	}

	@Override
	public boolean duckFly() {
		return true;
	}

}
