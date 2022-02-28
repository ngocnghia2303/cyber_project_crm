package cybersoft.javabackend.crm.model;

import java.time.LocalDateTime;

public class Tasks {
	private int id;
	private String name;
	private LocalDateTime startDate;
	private LocalDateTime endDate;
	private int userID;
	private String taskDesc;
	private Status status;
}
