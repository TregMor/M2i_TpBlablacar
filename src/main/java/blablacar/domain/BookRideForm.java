package blablacar.domain;

import java.util.Date;

import javax.validation.constraints.NotNull;

public class BookRideForm {
	
	private int Id;
	
	@NotNull	
	private String villeDepart;
	@NotNull	
	private String villeArrivee;
	
	private Date departureDate;
	
	private int hour;
	private int minutes;
	private int placesCount;
	
	
	public String getVilleDepart() {
		return villeDepart;}
	public void setVilleDepart(String villeDepart) {
		this.villeDepart = villeDepart;}
	public String getVilleArrivee() {
		return villeArrivee;}
	public void setVilleArrivee(String villeArrivee) {
		this.villeArrivee = villeArrivee;}
	
	public Date getDepartureDate() {
		return departureDate;}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;}
	public int getHour() {
		return hour;}
	public void setHour(int hour) {
		this.hour = hour;}
	public int getMinutes() {
		return minutes;}
	public void setMinutes(int minutes) {
		this.minutes = minutes;}
	
	public int getPlacesCount() {
		return placesCount;}
	public void setPlacesCount(int placesCount) {
		this.placesCount = placesCount;}
}
