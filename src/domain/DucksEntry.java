package domain;

public class DucksEntry {
	private DuckType duckName;

	public DucksEntry(DuckType duckName) {
		super();
		this.duckName = duckName;
	}

	public DuckType getDuckName() {
		return duckName;
	}

	public void setDuckName(DuckType duckName) {
		this.duckName = duckName;
	}
	
}
