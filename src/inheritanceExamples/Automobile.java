package inheritanceExamples;

public class Automobile implements AutomobileInterface{

	String automobileName;
	int noOfDriver;
	String fuelUsed;
	String engineName;
	
	//IS-A RelationShip
	// has - A Relationship

	public void setEngine(String engineName) {
		this.engineName = engineName;
	}

	public void setFuel(String fuel) {
		this.fuelUsed = fuel;
	}

	public void setNoOfDriverRequired() {
		this.noOfDriver = 1;
	}
}
