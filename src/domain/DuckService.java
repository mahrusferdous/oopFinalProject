package domain;

/**
 * Duck Search service that defines and enforces the requirement for the child items
 *
 */
public interface DuckService {
	
	/**
	 * 
	 * @return the name of the duck {@code String}
	 */
	DuckType returnName();
	
	/**
	 * 
	 * @return the duck can bread {@code String}
	 */
	String duckBreed();
	
	/**
	 *
	 * @return the if duck can fly is true or false {@code boolean}
	 */
	boolean duckFly();
	
	/**
	 * 
	 * @return the duck information {@code void}
	 */
	void printDuck();
}
