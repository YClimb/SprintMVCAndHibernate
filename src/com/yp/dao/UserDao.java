package com.yp.dao;

import java.util.List;

import com.yp.entity.User;

public interface UserDao {
	public User getUser(String id);  
    
    public List<User> getAllUser();  
      
    public void addUser(User user);  
      
    public boolean delUser(String id);  
      
    public boolean updateUser(User user);  
}
