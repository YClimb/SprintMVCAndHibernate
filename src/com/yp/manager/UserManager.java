package com.yp.manager;

import java.util.List;

import com.yp.entity.User;

public interface UserManager {

	public User getUser(String id);
	
	public List<User> getAllUser();
	
	public void addUser(User user);
	
	public boolean delUser(String id);
	
	public boolean updateUser(User user);
}
