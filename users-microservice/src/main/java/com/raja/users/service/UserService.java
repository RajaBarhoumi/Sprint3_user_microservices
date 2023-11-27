package com.raja.users.service;

import java.util.List;

import com.raja.users.entities.Role;
import com.raja.users.entities.User;

public interface UserService {
	User saveUser(User user);

	User findUserByUsername(String username);

	Role addRole(Role role);

	User addRoleToUser(String username, String rolename);
	
	List <User> findAllUsers();
}
