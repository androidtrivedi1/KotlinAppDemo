package trivedi.kotlinappdemo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataClassHotel{

	@SerializedName("total")
	private String total;

	@SerializedName("LocationData")
	private List<LocationDataItem> locationData;

	@SerializedName("error")
	private boolean error;

	@SerializedName("message")
	private String message;

	public void setTotal(String total){
		this.total = total;
	}

	public String getTotal(){
		return total;
	}

	public void setLocationData(List<LocationDataItem> locationData){
		this.locationData = locationData;
	}

	public List<LocationDataItem> getLocationData(){
		return locationData;
	}

	public void setError(boolean error){
		this.error = error;
	}

	public boolean isError(){
		return error;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	@Override
 	public String toString(){
		return 
			"DataClassHotel{" + 
			"total = '" + total + '\'' + 
			",locationData = '" + locationData + '\'' + 
			",error = '" + error + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}