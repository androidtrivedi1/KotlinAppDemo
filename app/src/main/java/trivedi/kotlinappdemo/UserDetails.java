package trivedi.kotlinappdemo;

import com.google.gson.annotations.SerializedName;

//@Generated("com.robohorse.robopojogenerator")
public class UserDetails{

	@SerializedName("user_addr2")
	private String userAddr2;

	@SerializedName("user_addr1")
	private String userAddr1;

	@SerializedName("user_email")
	private String userEmail;

	@SerializedName("user_first_name")
	private String userFirstName;

	@SerializedName("user_last_name")
	private String userLastName;

	@SerializedName("user_phone")
	private String userPhone;

	@SerializedName("user_city")
	private String userCity;

	@SerializedName("state_id")
	private String stateId;

	public void setUserAddr2(String userAddr2){
		this.userAddr2 = userAddr2;
	}

	public String getUserAddr2(){
		return userAddr2;
	}

	public void setUserAddr1(String userAddr1){
		this.userAddr1 = userAddr1;
	}

	public String getUserAddr1(){
		return userAddr1;
	}

	public void setUserEmail(String userEmail){
		this.userEmail = userEmail;
	}

	public String getUserEmail(){
		return userEmail;
	}

	public void setUserFirstName(String userFirstName){
		this.userFirstName = userFirstName;
	}

	public String getUserFirstName(){
		return userFirstName;
	}

	public void setUserLastName(String userLastName){
		this.userLastName = userLastName;
	}

	public String getUserLastName(){
		return userLastName;
	}

	public void setUserPhone(String userPhone){
		this.userPhone = userPhone;
	}

	public String getUserPhone(){
		return userPhone;
	}

	public void setUserCity(String userCity){
		this.userCity = userCity;
	}

	public String getUserCity(){
		return userCity;
	}

	public void setStateId(String stateId){
		this.stateId = stateId;
	}

	public String getStateId(){
		return stateId;
	}

	@Override
 	public String toString(){
		return 
			"UserDetails{" + 
			"user_addr2 = '" + userAddr2 + '\'' + 
			",user_addr1 = '" + userAddr1 + '\'' + 
			",user_email = '" + userEmail + '\'' + 
			",user_first_name = '" + userFirstName + '\'' + 
			",user_last_name = '" + userLastName + '\'' + 
			",user_phone = '" + userPhone + '\'' + 
			",user_city = '" + userCity + '\'' + 
			",state_id = '" + stateId + '\'' + 
			"}";
		}
}