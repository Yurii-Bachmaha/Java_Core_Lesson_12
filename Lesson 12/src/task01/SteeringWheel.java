package task01;

public class SteeringWheel {

	private double SteeringWheelDiameter;
	private String SteeringWheelMaterial;

	public SteeringWheel(double steeringWheelDiameter, String steeringWheelMaterial) {
		super();
		SteeringWheelDiameter = steeringWheelDiameter;
		SteeringWheelMaterial = steeringWheelMaterial;
	}

	public double getSteeringWheelDiameter() {
		return SteeringWheelDiameter;
	}

	public void setSteeringWheelDiameter(double steeringWheelDiameter) {
		SteeringWheelDiameter = steeringWheelDiameter;
	}

	public String getSteeringWheelMaterial() {
		return SteeringWheelMaterial;
	}

	public void setSteeringWheelMaterial(String steeringWheelMaterial) {
		SteeringWheelMaterial = steeringWheelMaterial;
	}

	@Override
	public String toString() {
		return "SteeringWheelDiameter = " + SteeringWheelDiameter  + ", SteeringWheelMaterial = "
				+ SteeringWheelMaterial;
	}

}