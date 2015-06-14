package jinject.testpackage2;

import com.riccardonoviello.commons.jinject.annotations.Inject;

import jinject.testpackage.Person;

public class House {
	
	@Inject
	Person owner;
	
	private int age;
	private int bedrooms;
	private int bathrooms;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	public int getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}
	
	
}
