package gafat.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

	public class Hotel  implements Serializable {
	    private static final long serialVersionUID = -908L;
	    private long id;
	    private String description="Free WiFi Guests consistently rate the WiFi as excellent";
	    private String name="Sheraton";
	    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getImgName() {
			return imgName;
		}
		public void setImgName(String imgName) {
			this.imgName = imgName;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		private String imgName="img1";
	    private String url="http://www.booking.com/hotel/us/cambria-suites-washington-washington.html";
	    public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public Date getCheckInDate() {
			return checkInDate;
		}
		public void setCheckInDate(Date checkInDate) {
			this.checkInDate = checkInDate;
		}
		public Date getCheckOutDate() {
			return checkOutDate;
		}
		public void setCheckOutDate(Date checkOutDate) {
			this.checkOutDate = checkOutDate;
		}
		public int getNoOfGuest() {
			return noOfGuest;
		}
		public void setNoOfGuest(int noOfGuest) {
			this.noOfGuest = noOfGuest;
		}
		@NotNull
	    private Date checkInDate;
	    @NotNull
	    private Date checkOutDate;
	    @Min(1)
	    private int noOfGuest;

}
