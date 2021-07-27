package models;

public class Client {

	// Attributes

	private String name;
	private String lastName;
	private String id;
	private boolean child;

	// Constructor

	public Client(String name, String lastName, String id, boolean child) {
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.child = child;

	}
    // Methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isChild() {
		return child;
	}

	public void setChild(boolean child) {
		this.child = child;
	}

}
