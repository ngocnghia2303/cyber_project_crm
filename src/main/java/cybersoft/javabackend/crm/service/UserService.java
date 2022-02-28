package cybersoft.javabackend.crm.service;

import java.util.ArrayList;
import java.util.List;

import cybersoft.javabackend.crm.model.User;

public class UserService {
	private List<User> users = new ArrayList<>();
	
	public boolean addUser(User user) {
		for(int i = 0 ; i < users.size(); i++) {
			if(user.getId() == users.get(i).getId()) {
				System.out.println("This employee already exist");
				return false;
			}
		}
		users.add(user);
		return true;
	}
	
	public boolean removeUser(int id) {
		for(int i = 0 ; i < users.size(); i++) {
			if(id == users.get(i).getId()) {
				System.out.println("Found Employee");
				users.remove(i);
				return true;
			}
		}
		System.out.println("Cannot find Employee");
		return false;
	}
	
	public List<User> getUserList(){
		return users;
	}
	
	
}
