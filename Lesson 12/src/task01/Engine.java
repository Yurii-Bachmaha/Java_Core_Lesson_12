package task01;

public class Engine {

	private int NumberOfCylinders;

	public Engine(int numberOfCylinders) {
		super();
		NumberOfCylinders = numberOfCylinders;
	}

	public int getNumberOfCylinders() {
		return NumberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		NumberOfCylinders = numberOfCylinders;
	}

	@Override
	public String toString() {
		return "NumberOfCylinders = " + NumberOfCylinders;
	}

}