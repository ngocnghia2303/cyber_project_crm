package cybersoft.javabackend.crm.model;

public class Leader extends User {
	
    public Leader(int id, String name,String email) {
    	super(id, email, email);
    	this.setRole(Role.LEADER);
    }
    
}
