package blablacar.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity // Liaison vers Hibernate
public class Ride {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
    @JsonFormat(pattern="yyyy-MM-dd HH:mm")
    @Temporal(TemporalType.TIMESTAMP)
	private Date departureDate;
    private String fromCity;
    private String toCity;
    private int seats;
    @NotNull
    private double price;

    @OneToMany(mappedBy ="ride")
    private List<Booking> bookings;
    
	@JsonIgnore // Pour éviter une boucle lors de la requête entre user et ride
	@ManyToOne
	private User userWhoProposed;

	
	//--------------------------Getters-Setters -----------------------------//
	public int getId() {
		return id;}
	public void setId(int id) {
		this.id = id;}
	
	public Date getDepartureDate() {
		return departureDate;}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;}
	public String getFromCity() {
		return fromCity;}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;}
	public String getToCity() {
		return toCity;}
	public void setToCity(String toCity) {
		this.toCity = toCity;}
	public Integer getSeats() {
		return seats;}
	public void setSeats(int seats) {
		this.seats = seats;}
	public double getPrice() {
		return price;}
	public void setPrice(double price) {
		this.price = price;}
	
	public List<Booking> getBookings() {
		return bookings;}
	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;}
	
	public User getUserWhoProposed() {
		return userWhoProposed;}
	public void setUserWhoProposed(User userWhoProposed) {
		this.userWhoProposed = userWhoProposed;}

}
