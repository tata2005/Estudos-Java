package entities;

public class OutsourcedEmployee extends Employee {

	private Double addtionalCharge;
		
	public OutsourcedEmployee() {
		
	}

	public OutsourcedEmployee(String name, Integer hour, Double valuePerHour, Double addtionalCharge) {
		super(name, hour, valuePerHour);
		this.addtionalCharge = addtionalCharge;
	}

	public Double getAddtionalCharge() {
		return addtionalCharge;
	}

	public void setAddtionalCharge(Double addtionalCharge) {
		this.addtionalCharge = addtionalCharge;
	}
	
	@Override
	public Double payment() {
		return valuePerHour * hour + (addtionalCharge * 1.1);
	}
}
