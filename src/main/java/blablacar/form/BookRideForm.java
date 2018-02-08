package blablacar.form;

//import java.util.Date;
//
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
//import javax.validation.constraints.NotNull;
//
//import com.fasterxml.jackson.annotation.JsonFormat;

public class BookRideForm {
	
	private int userId;
	private int rideId;
	
	public int getUserId() {
		return userId;}
	public void setUserId(int userId) {
		this.userId = userId;}
	
	public int getRideId() {
		return rideId;}
	public void setRideId(int rideId) {
		this.rideId = rideId;}

	
//	@NotNull	
//	private String fromCity;
//	@NotNull	
//	private String toCity;
//	
//	@JsonFormat(pattern="yyyy-MM-dd HH:mm")
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date departureDate;	
//	
//	//---Getters-Setters ---//
//	public String getFromCity() {
//		return fromCity;}
//	public void setFromCity(String fromCity) {
//		this.fromCity = fromCity;}
//	public String getToCity() {
//		return toCity;}
//	public void setToCity(String toCity) {
//		this.toCity = toCity;}
//	public Date getDepartureDate() {
//		return departureDate;}
//	public void setDepartureDate(Date departureDate) {
//		this.departureDate = departureDate;}

}
