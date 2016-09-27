
public class BuddyInfo {
	
	private String name;
	private String address;
	private String phone_number;
	
	public BuddyInfo(String name,String address,String phone_number){
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public static void main(String[] args) {
		BuddyInfo a = new BuddyInfo(null, null, null);
		a.setName("Waddup Homer");
		System.out.println(a.getName());
	}

}
