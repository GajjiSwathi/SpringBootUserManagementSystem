package com.springboot.controller.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/userlist")
	public List<User> getAllUserList() {
		return userService.getAllUser();

	}

	@RequestMapping("/user/{id}")
	public User getUser(@PathVariable String id) {
		return userService.getUser(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/userAdd")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/user/{id}")
	public void updateUser(@RequestBody User user, @PathVariable String id) {
		userService.updateUser(id, user);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/user/{id}")
	public void deleteUser(@PathVariable String id) {
		userService.deleteUser(id);
	}
}
