package com.springboot.controller.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {

	private List<User> users = new ArrayList<>(Arrays.asList(
			                                                new User("1", "swathi", "spring"), 
			                                                new User("2", "Sony", "SpringBoot"),
			                                                new User("3", "pinky", "Hibernate"), 
			                                                new User("4", "chaitu", "Java")));
	
	
	public List<User> getAllUser(){
		return users;
	}

	
	public User getUser(String id) {
		return users.stream().filter(t ->t.getId().equals(id)).findFirst().get();
		
	}


	public void addUser(@RequestBody User user) {
		// TODO Auto-generated method stub
		users.add(user);
	}


	public void updateUser(String id, User user) {
		
		// TODO Auto-generated method stub
		for(int i=0;i<users.size();i++) {
			User u=users.get(i);
			if(u.getId().equals(id)) {
				users.set(i, user);
			}
		}
	}


	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		users.removeIf(t->t.getId().equals(id));
		
	}


	
}