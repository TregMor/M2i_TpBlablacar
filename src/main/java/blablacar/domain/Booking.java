package blablacar.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@JsonIgnore
	@ManyToOne
	private Ride ride;
	
	@JsonIgnore
	@ManyToOne
	private User user;

	
	//---Getters-Setters ---//
	
	public int getId() {
		return id;}
	public void setId(int id) {
		this.id = id;}

	public Ride getRide() {
		return ride;}
	public void setRide(Ride ride) {
		this.ride = ride;}

	public User getUser() {
		return user;}
	public void setUser(User user) {
		this.user = user;}

}
