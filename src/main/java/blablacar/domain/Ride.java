package blablacar.domain;

import java.util.Date;
import java.util.List;

public class Ride {

    private long id;
    private Integer totalPlaces;
    private String leftPlaces;
    private Date departureDate;
    
    private List<Location> locations;
    private List<arrivalDate> arrivalDates;
    private List<String> caracteristics;
    
    
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Integer getTotalPlaces() {
		return totalPlaces;
	}
	public void setTotalPlaces(Integer totalPlaces) {
		this.totalPlaces = totalPlaces;
	}
	public String getLeftPlaces() {
		return leftPlaces;
	}
	public void setLeftPlaces(String leftPlaces) {
		this.leftPlaces = leftPlaces;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public List<Location> getLocations() {
		return locations;
	}
	public void setLocations(List<Location> locations) {
		this.locations = locations;
	}
	public List<arrivalDate> getArrivalDates() {
		return arrivalDates;
	}
	public void setArrivalDates(List<arrivalDate> arrivalDates) {
		this.arrivalDates = arrivalDates;
	}
	public List<String> getCaracteristics() {
		return caracteristics;
	}
	public void setCaracteristics(List<String> caracteristics) {
		this.caracteristics = caracteristics;
	}
    
}
