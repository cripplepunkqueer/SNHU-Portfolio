package contact;

public class contact {

	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact (String contactID, String firstName, String lastName, String phone, String address) 
			
		public String getFirstName() { //this is a getter method that returns firstName//
			return firstName;
		}
		
		public void setFirstName(String firstName) { //sets firstName variable//
			this.firstName = firstName;
		}
		
		public String getLastName() { //getter method that retrieves lastName//
			return lastName;
		}
		
		public void setLastName(String lastName) { //sets lastName variable//
			this.lastName = lastName;
		}
		
		public String getPhone() {
			return phone();
		}
		
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		public String getAddress() { //getter method that retrieves address variable//
		return address;	
		}
		
		public void setAddress(String address) { //sets address variable//
			this.address = address;
		}

		
		public String getContactID() { //gets contactID variable//
			return contactID;
		}
	}
	
	
}
