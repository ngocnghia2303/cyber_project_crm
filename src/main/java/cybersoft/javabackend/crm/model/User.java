package cybersoft.javabackend.crm.model;

public class User {
	
	private int id;
	private String name;
	private String email;
	private String role;
	
	public User(int id, String name,String email) {
		this.id = id;
		this.email = email;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
