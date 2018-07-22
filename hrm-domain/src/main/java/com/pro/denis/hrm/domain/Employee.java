package com.pro.denis.hrm.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee extends AbstractDomain {

	private String name;
	private String address;
	private String position;
	private String department;
	private int supervisorId;
	private int qualificationId;

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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSupervisorId() {
		return supervisorId;
	}
	public void setSupervisorId(int supervisorId) {
		this.supervisorId = supervisorId;
	}
	public int getQualificationId() {
		return qualificationId;
	}
	public void setQualificationId(int qualificationId) {
		this.qualificationId = qualificationId;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", position=" + position + ", department="
				+ department + ", supervisorId=" + supervisorId + ", qualificationId=" + qualificationId
				+ "]";
	}


}
