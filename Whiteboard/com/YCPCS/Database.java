package com.YCPCS;

import java.util.ArrayList;

public class Database {

	private ArrayList<User> userList = new ArrayList<User>();
	
	public Database(){
		
	}
	
	public User getUser(String username){
		for(int i = 0;i<userList.size();i++){
			User user = userList.get(i);
			if(user.getUsername().equals(username)){
				return user;
			}
		}
		return null;
	}
	
}
