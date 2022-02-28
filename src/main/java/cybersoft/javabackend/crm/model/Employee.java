package cybersoft.javabackend.crm.model;

public class Employee extends User {

	public Employee(int id, String name, String email) {
		super(id, name, email);
		this.setRole("Employee");
	}

}
