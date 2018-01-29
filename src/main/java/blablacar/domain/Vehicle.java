package blablacar.domain;

import java.time.Year;

public class Vehicle {

    private long Id;
    private String name;
    private Year buildDate;
    
    
    
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Year getBuildDate() {
		return buildDate;
	}
	public void setBuildDate(Year buildDate) {
		this.buildDate = buildDate;
	}

    
}
