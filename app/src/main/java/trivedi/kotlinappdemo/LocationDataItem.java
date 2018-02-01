package trivedi.kotlinappdemo;

import com.google.gson.annotations.SerializedName;

public class LocationDataItem{

	@SerializedName("hotel_rate")
	private String hotelRate;

	@SerializedName("book_online")
	private int bookOnline;

	@SerializedName("address")
	private String address;

	@SerializedName("booking_url")
	private String bookingUrl;

	@SerializedName("hotel_id")
	private String hotelId;

	@SerializedName("site_id")
	private int siteId;

	@SerializedName("pagesize")
	private int pagesize;

	@SerializedName("hotel_alliance_id")
	private String hotelAllianceId;

	@SerializedName("LatLng")
	private LatLng latLng;

	@SerializedName("hotel_name")
	private String hotelName;

	public void setHotelRate(String hotelRate){
		this.hotelRate = hotelRate;
	}

	public String getHotelRate(){
		return hotelRate;
	}

	public void setBookOnline(int bookOnline){
		this.bookOnline = bookOnline;
	}

	public int getBookOnline(){
		return bookOnline;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setBookingUrl(String bookingUrl){
		this.bookingUrl = bookingUrl;
	}

	public String getBookingUrl(){
		return bookingUrl;
	}

	public void setHotelId(String hotelId){
		this.hotelId = hotelId;
	}

	public String getHotelId(){
		return hotelId;
	}

	public void setSiteId(int siteId){
		this.siteId = siteId;
	}

	public int getSiteId(){
		return siteId;
	}

	public void setPagesize(int pagesize){
		this.pagesize = pagesize;
	}

	public int getPagesize(){
		return pagesize;
	}

	public void setHotelAllianceId(String hotelAllianceId){
		this.hotelAllianceId = hotelAllianceId;
	}

	public String getHotelAllianceId(){
		return hotelAllianceId;
	}

	public void setLatLng(LatLng latLng){
		this.latLng = latLng;
	}

	public LatLng getLatLng(){
		return latLng;
	}

	public void setHotelName(String hotelName){
		this.hotelName = hotelName;
	}

	public String getHotelName(){
		return hotelName;
	}

	@Override
 	public String toString(){
		return 
			"LocationDataItem{" + 
			"hotel_rate = '" + hotelRate + '\'' + 
			",book_online = '" + bookOnline + '\'' + 
			",address = '" + address + '\'' + 
			",booking_url = '" + bookingUrl + '\'' + 
			",hotel_id = '" + hotelId + '\'' + 
			",site_id = '" + siteId + '\'' + 
			",pagesize = '" + pagesize + '\'' + 
			",hotel_alliance_id = '" + hotelAllianceId + '\'' + 
			",latLng = '" + latLng + '\'' + 
			",hotel_name = '" + hotelName + '\'' + 
			"}";
		}
}