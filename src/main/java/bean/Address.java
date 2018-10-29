package bean;

public class Address {

	private String lane;
	private String city;
	private String pincode;

	@Override
	public String toString() {
		return "Address [lane=" + lane + ", city=" + city + ", pincode=" + pincode + "]";
	}

	public String getLane() {
		return lane;
	}

	public void setLane(String lane) {
		this.lane = lane;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Address(String lane, String city, String pincode) {
		this.lane = lane;
		this.city = city;
		this.pincode = pincode;
	}

}
