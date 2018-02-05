package blablacar.domain;

import java.util.Date;

public class Booking {

	private Integer placesCount;
	private Date creationDate;
	
	
	public Integer getPlacesCount() {
		return placesCount;
	}
	public void setSeatCount(Integer placesCount) {
		this.placesCount = placesCount;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
