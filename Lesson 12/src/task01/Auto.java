package task01;

public class Auto {

	private int AmountOfHorsepower;
	private int YearOfRelease;
	private Engine engine;
	private SteeringWheel steeringWheel;

	public Auto(int amountOfHorsepower, int yearOfRelease, Engine engine, SteeringWheel steeringWheel) {
		super();
		AmountOfHorsepower = amountOfHorsepower;
		YearOfRelease = yearOfRelease;
		this.engine = engine;
		this.steeringWheel = steeringWheel;
	}

	public int getAmountOfHorsepower() {
		return AmountOfHorsepower;
	}

	public void setAmountOfHorsepower(int amountOfHorsepower) {
		AmountOfHorsepower = amountOfHorsepower;
	}

	public int getYearOfRelease() {
		return YearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		YearOfRelease = yearOfRelease;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public SteeringWheel getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(SteeringWheel steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

	@Override
	public String toString() {
		return "Auto : AmountOfHorsepower = " + AmountOfHorsepower + ", YearOfRelease = " + YearOfRelease
				+ ", NumberOfCylinders = " + engine.getNumberOfCylinders() + ", SteeringWheelDiameter = "
				+ steeringWheel.getSteeringWheelDiameter() + " inches " + ", SteeringWheelMaterial = "
				+ steeringWheel.getSteeringWheelMaterial() + "\n";
	}

}