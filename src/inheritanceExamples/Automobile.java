package inheritanceExamples;

public class Automobile {

	String automobileName;
	int noOfDriver;
	String fuelUsed;
	String engineName;

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
