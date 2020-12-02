package Thantrick;

import java.util.Arrays;
import java.util.Date;

public class Employee {
	private String name;
	private String empId;
	private String gender ;
	private Date dob;
	private String[] technologies;
	private int salary;
	private Address[] address;
	private Project project;

	public Employee(String name, String empId, String gender,Date dob,String[] technologies, int salary, Address[] address,Project project) {
		super();
		this.name = name;
		this.empId = empId;
		this.gender=gender;
		this.dob = dob;
		this.technologies=technologies;
		this.salary = salary;
		this.address = address;
		this.project=project;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	

	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address[] getAddress() {
		return address;
	}

	public void setAddress(Address[] address) {
		this.address = address;
	}


	public String[] getTechnologies() {
		return technologies;
	}


	public void setTechnologies(String[] technologies) {
		this.technologies = technologies;
	}


	public Project getProject() {
		return project;
	}


	public void setProject(Project project) {
		this.project = project;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", gender=" + gender + ", dob=" + dob + ", technologies="
				+ Arrays.toString(technologies) + ", salary=" + salary + ", address=" + Arrays.toString(address)
				+ ", project=" + project + "]";
	}
	
	

}
