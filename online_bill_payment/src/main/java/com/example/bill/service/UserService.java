package com.example.bill.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.bill.model.User;

public interface UserService {
	public boolean addUser(User user);
	public List<User> getUser();
	public boolean updateUser(Long id, User user);
	public boolean deleteUser(Long id);
	public Page<User> getAllUser(PageRequest pageRequest);
	List<User> findAllQuery();
	
	public User findByAccountNum();
	User findByAccountNum(String accountNum);
//	public void updateUserQuery(String userName, Long id);
	
}
