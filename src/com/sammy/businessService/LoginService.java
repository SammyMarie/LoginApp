package com.sammy.businessService;
//This class is used to authenticate the values passed in from the jsp form before putting it into the database
import java.util.HashMap;

import com.sammy.model.User;

public class LoginService {
	
		HashMap<String, String> users = new HashMap<String, String>();
		
		public LoginService(){
			users.put("johnny", "John Doe");
			users.put("sammy", "Samuel James");
			users.put("sunny", "Sunny Drinkwater");
		}

		public boolean aunthenticate(String userName, String password){
			
			if (password == null || password.trim() == "") {
				
				return false;
			}
			
			return true;
		}
		public User getUserDetails(String userId){
			
			User user = new User();
			
			user.setUserName(users.get(userId));
			user.setUserId(userId);
			
			return user;
		}
}
