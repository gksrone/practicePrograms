/**
 * 
 */
package rone.gson.json;

import java.util.Date;

/**
 * @author Ronnie
 *
 */
public class Student {

	private String name;
	
	private String address;
	
	private Date dob;

	public Student(String name, String address, Date dob) {
		this.name = name;
		this.address = address;
		this.dob = dob;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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
}
