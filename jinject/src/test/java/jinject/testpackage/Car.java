package jinject.testpackage;

import com.riccardonoviello.commons.jinject.annotations.Inject;

public class Car {
	@Inject 
	Person owner;
	
	private String model;
	
	private String transmission;
	
	private int milage;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
}
