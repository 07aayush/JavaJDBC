package com.bl.Model;

public class UserPojo {

	private String Name;
	private String Email;
	private String Password;
	private String  MobileNumber;
	
	public UserPojo() {
		
	}

	public UserPojo(String name, String email, String password, String mobileNumber) {
		super();
		Name = name;
		Email = email;
		Password = password;
		MobileNumber = mobileNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Email == null) ? 0 : Email.hashCode());
		result = prime * result + ((MobileNumber == null) ? 0 : MobileNumber.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((Password == null) ? 0 : Password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserPojo other = (UserPojo) obj;
		if (Email == null) {
			if (other.Email != null)
				return false;
		} else if (!Email.equals(other.Email))
			return false;
		if (MobileNumber == null) {
			if (other.MobileNumber != null)
				return false;
		} else if (!MobileNumber.equals(other.MobileNumber))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (Password == null) {
			if (other.Password != null)
				return false;
		} else if (!Password.equals(other.Password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserPojo [Name=" + Name + ", Email=" + Email + ", Password=" + Password + ", MobileNumber="
				+ MobileNumber + "]";
	}
	
}
