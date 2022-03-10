package videos;

public abstract class Employee {
	
	private String firstName;
	private String lastName;
	private double pay;
	private String address;
	private String reportsTo;
	
	public Employee(String firstName, String lastName, double pay) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pay = pay;
		
		
	}
	
	public abstract double calculatePay();
	
	public String getInformation() {
		return "Name: " + firstName + " " + lastName
				+ "\nReports to: " + reportsTo
				+ "\nAddress: " + address;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the pay
	 */
	public double getPay() {
		return pay;
	}

	/**
	 * @param pay the pay to set
	 */
	public void setPay(double pay) {
		this.pay = pay;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the reportsTo
	 */
	public String getReportsTo() {
		return reportsTo;
	}

	/**
	 * @param reportsTo the reportsTo to set
	 */
	public void setReportsTo(String reportsTo) {
		this.reportsTo = reportsTo;
	}

}
