package in.assesment.rentAPIs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int prodId;
	private String name;
	private String costPerHour;
	private String costPerDay;
	private String costPerWeek;
	public Product() {
		
	}
	public Product(String name, String costPerHour, String costPerDay, String costPerWeek) {
		super();
		this.name = name;
		this.costPerHour = costPerHour;
		this.costPerDay = costPerDay;
		this.costPerWeek = costPerWeek;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCostPerHour() {
		return costPerHour;
	}
	public void setCostPerHour(String costPerHour) {
		this.costPerHour = costPerHour;
	}
	public String getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(String costPerDay) {
		this.costPerDay = costPerDay;
	}
	public String getCostPerWeek() {
		return costPerWeek;
	}
	public void setCostPerWeek(String costPerWeek) {
		this.costPerWeek = costPerWeek;
	}
	

}
