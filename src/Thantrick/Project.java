package Thantrick;

import java.util.Date;

public class Project {
	private String name;
	private Date startDate;
	private Date endDate;
	private Client client;

	public Project(String name, Date startDate, Date endDate, Client client) {
		super();
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.client = client;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Project [name=" + name + ", startDate=" + startDate + ", endDate=" + endDate + ", client=" + client
				+ "]";
	}
	
	

}
