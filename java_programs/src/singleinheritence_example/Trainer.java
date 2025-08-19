package singleinheritence_example;

public class Trainer extends Person {
	
	
	private int eid;
	private String designation;
	private String location;
	
	
	public Trainer(int pid, String name, String city, int eid, String designation, String location) {
		super(pid, name, city);      //person class constructor
		this.eid = eid;
		this.designation = designation;
		this.location = location;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Trainer [eid=" + eid + ", designation=" + designation + ", location=" + location + ", Pid()="
				+ getPid() + ", Name()=" + getName() + ", City()=" + getCity() + "]";
	}


	
	
	
	

}
