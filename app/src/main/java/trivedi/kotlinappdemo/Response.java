package trivedi.kotlinappdemo;

import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class Response{

	@SerializedName("user_details")
	private UserDetails userDetails;

	@SerializedName("error")
	private boolean error;

	@SerializedName("message")
	private String message;

	public void setUserDetails(UserDetails userDetails){
		this.userDetails = userDetails;
	}

	public UserDetails getUserDetails(){
		return userDetails;
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
			"Response{" + 
			"user_details = '" + userDetails + '\'' + 
			",error = '" + error + '\'' + 
			",message = '" + message + '\'' + 
			"}";
		}
}