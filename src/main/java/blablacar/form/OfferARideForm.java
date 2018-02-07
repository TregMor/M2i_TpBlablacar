package blablacar.form;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class OfferARideForm {
	
	private int userId;
	private String fromCity;
	private String toCity;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date departureDate;
	private int seats;
	
	private short startHour;
	private short startMinutes;
	
	private double price;
	
	
	//---Getters-Setters ---//
	public int getUserId() {
		return userId;}
	public void setUserId(int userId) {
		this.userId = userId;}
	public String getFromCity() {
		return fromCity;}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;}
	public String getToCity() {
		return toCity;}
	public void setToCity(String toCity) {
		this.toCity = toCity;}
	public Date getDepartureDate() {
		return departureDate;}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;}
	public int getSeats() {
		return seats;}
	public void setSeats(int seats) {
		this.seats = seats;}
	
	public short getStartHour() {
		return startHour;}
	public void setStartHour(short startHour) {
		this.startHour = startHour;}
	public short getStartMinutes() {
		return startMinutes;}
	public void setStartMinutes(short startMinutes) {
		this.startMinutes = startMinutes;}
	public double getPrice() {
		return price;}
	public void setPrice(double price) {
		this.price = price;}

}
