package com.assignment.customer.entity;

import java.util.Objects;

public class Customer {

	private long customerId;
	private String customerName;
	private String department;

	public Customer() {

	}

	public Customer(long customerId, String customerName, String department) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.department = department;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", department=" + department
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerId, customerName, department);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return customerId == other.customerId && Objects.equals(customerName, other.customerName)
				&& Objects.equals(department, other.department);
	}

}
