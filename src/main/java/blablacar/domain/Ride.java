package blablacar.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity // Liaison à Hibernate
public class Ride {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int totalPlaces;
	private Date departureDate;
	// private String leftPlaces;
	// private List<Location> locations;
	// private List<arrivalDate> arrivalDates;
	// private List<String> caracteristics;

	@JsonIgnore // Pour éviter une boucle lors de la requête entre user et ride
	@ManyToOne
	private User userWhoProposed;

	public int getId() {
		return id;}
	public void setId(int id) {
		this.id = id;}
	public Integer getTotalPlaces() {
		return totalPlaces;}
	public void setTotalPlaces(Integer totalPlaces) {
		this.totalPlaces = totalPlaces;}
	public Date getDepartureDate() {
		return departureDate;}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;}
	public User getUserWhoProposed() {
		return userWhoProposed;}
	public void setUserWhoProposed(User userWhoProposed) {
		this.userWhoProposed = userWhoProposed;}

	// public String getLeftPlaces() {
	// return leftPlaces;
	// }
	// public void setLeftPlaces(String leftPlaces) {
	// this.leftPlaces = leftPlaces;
	// }
	// public List<Location> getLocations() {
	// return locations;
	// }
	// public void setLocations(List<Location> locations) {
	// this.locations = locations;
	// }
	// public List<arrivalDate> getArrivalDates() {
	// return arrivalDates;
	// }
	// public void setArrivalDates(List<arrivalDate> arrivalDates) {
	// this.arrivalDates = arrivalDates;
	// }
	// public List<String> getCaracteristics() {
	// return caracteristics;
	// }
	// public void setCaracteristics(List<String> caracteristics) {
	// this.caracteristics = caracteristics;
	// }

}
