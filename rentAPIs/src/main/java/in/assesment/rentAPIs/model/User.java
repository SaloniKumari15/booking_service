package in.assesment.rentAPIs.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "`user`")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String mobileNumber;
    private int prodId;
	private String duration;
	public User() {}
	public User(String name, String mobileNumber, int prodId, String duration) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.prodId = prodId;
		this.duration = duration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getProductId() {
		return prodId;
	}
	public void setProductId(int prodId) {
		this.prodId = prodId;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", productId=" + prodId
				+ ", duration=" + duration + "]";
	}
	
	
	
}
