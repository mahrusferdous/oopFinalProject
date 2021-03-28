package domain;

public enum DuckType {
	MALLARD("mallard"), STEAMER("steamer"), INVALID("invalid");

	private String duckType;

	DuckType(String duckType) {
		this.duckType = duckType;
	}

	public static DuckType fromString(String duckType) {
		DuckType[] duckEnums = DuckType.values();
		for (DuckType d : duckEnums) {
			if (d.duckType.equalsIgnoreCase(duckType)) {
				return d;
			}
		}
		return INVALID;
	}

	// Not sure why this returns the value without calling it anywhere
	@Override
	public String toString() {
		return duckType;
	}
}
